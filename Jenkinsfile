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
    }
}
