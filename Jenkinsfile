pipeline {
    agent any
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
