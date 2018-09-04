pipeline {
    agent any
    tools {
        maven 'Maven 3'
    }
    stages {
        stage ('Build') {
            steps {
                echo 'Building...'
                sh 'mvn -B clean package'
            }
        }
        stage ('Test'){
            steps {
                echo 'Testing...'
            }
        }
        stage ('Deploy'){
            steps {
                echo 'Deploying...'
                sh 'cd target/'
                sh 'java -jar jenkinstest-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}
