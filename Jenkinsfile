pipeline {
	agent {label 'master'}
    stages {
        stage('Android') {
            steps {
				echo 'Proyecto Android'
                dir('p02/ActivityA2020'){
					sh './gradlew assembleDebug'
                }
            }
        }
        stage('Arduino') {
            steps {
                echo 'Proyecto Arduino'
                
            }       
        }
        stage('Maven') {
            steps {
                echo 'Proyecto Maven'
                dir('p03/simple'){
					sh 'mvn verify'
					sh 'site'
                }
            }
        }
    }
}

