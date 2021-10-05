pipeline{
    agent any
    stages{
        stage('Clean stage'){
            steps{
                sh 'mvn clean'
            }
        }
        stage('Build stage'){
            steps{
                sh 'mvn install'
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

