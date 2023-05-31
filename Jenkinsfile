pipeline {
  agent any
  stages {
    stage('Maven Version') {
      parallel {
        stage('Maven Version') {
          steps {
            bat 'mvn -v'
          }
        }

        stage('Java Version') {
          steps {
            bat 'java -version'
          }
        }

      }
    }

    stage('Running Test') {
      steps {
        bat 'mvn clean test'
      }
    }

  }
}
