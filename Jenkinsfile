pipeline {
	agent {label 'master'}
    stages {
        stage('Build') {
            steps {
                sh 'mvn compile'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }       
        }
        stage('Validate') {
            steps {
                sh 'mvn validate'
            }
        }
        stage('Verify'){
			steps {
				sh 'mvn verify'
			}
        }
    }
}
