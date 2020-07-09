pipeline {
    agent any 
    stages {
        stage(' Clean ') {
            steps {
                bat label: '', script: 'mvn clean'
            }
        }
        stage('Test') {
            steps {
                bat label: '', script: 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                bat label: '', script: 'mvn package'
            }
        }
    }
}
