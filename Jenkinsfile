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
        withGradle() {
          sh './gradlew build -x Test'
        }

      }
    }

    stage('test') {
      parallel {
        stage('unit-test') {
          steps {
            sh './gradlew unitTest'
          }
        }

        stage('integration-test') {
          steps {
            sh './gradlew integrationTest'
          }
        }

        stage('component-test') {
          steps {
            sh './gradlew componentTest'
          }
        }

        stage('mutation-test') {
          steps {
            sh './gradlew mutationTest'
          }
        }

      }
    }

    stage('tag') {
      steps {
        sh './gradlew release -Prelease.useAutomaticVersion=true'
      }
    }

  }
}