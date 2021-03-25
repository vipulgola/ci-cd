pipeline { 
    agent any 

    stages {
        stage('Build') { 
            steps { 
                sh 'sudo docker run  --rm --name my-maven-project -v "$(pwd)":/usr/src/mymaven -w /usr/src/mymaven maven:3.3-jdk-8 mvn clean install' 
            }
        }
        stage('Build Image & push to docker hub'){
            steps {
                sh 'sudo docker build . -t="m_webserver"'
		sh 'sudo docker tag m_webserver akash7778/m_webserver'
		sh 'sudo docker push akash7778/m_webserver:latest'
            }
        }
        stage('Deploy to Kubernetes') {
            steps {
		sh 'sudo runuser -l akash -c "kubectl create deployment --image=akash7778/m_webserver webserver-app"'
                sh 'sudo runuser -l akash -c "kubectl expose deployment webserver-app --port=8080 --type=NodePort --name=webserver"'
            }
        }
    }
}

