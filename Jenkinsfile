pipeline{
    agent any
    stages{
        stage('Clean stage'){
            steps{
                mvn clean
            }
        }
        stage('Build stage'){
            steps{
                mvn install
            }
        }
        stage('package'){
            steps{
                echo 'Package'
            }
        }
        stage('package upload'){
            steps{
                echo 'Package upload'
            }
        }
    }
}

