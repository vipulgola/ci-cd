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
		sh 'sudo docker push m_webserver:latest'
            }
        }
        stage('Deploy') {
            steps {
                sh 'echo "deploy"'
            }
        }
    }
}

