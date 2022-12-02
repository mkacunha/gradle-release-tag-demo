pipeline {
  agent any
  stages {
    stage('clean') {
      steps {
        sh './gradlew clean'
      }
    }

    stage('build') {
      steps {
        sh './gradlew build -x Test'
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
        sh 'git config --global user.email "mkacunha@gmail.com"'
        sh 'git config --global user.name "Maiko Cunha"'
        sh './gradlew release -Prelease.useAutomaticVersion=true'
      }
    }

  }
}