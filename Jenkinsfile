pipeline {
    agent any
    stages {
        stage ('Build') {
            steps {
                echo 'Building...'
                mvn -B clean package
            }
        }
        stage ('Test'){
            steps {
                echo 'Testing...'
            }
        }
    }
}
