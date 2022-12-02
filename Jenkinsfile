pipeline {
  agent any
  stages {
    stage('clean') {
      steps {
        withGradle() {
          sh './gradlew clean'
        }

      }
    }

    stage('build') {
      steps {
        sh './gradlew build'
      }
    }

  }
}