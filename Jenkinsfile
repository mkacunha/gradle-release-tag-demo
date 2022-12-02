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
      steps {
        sh './gradlew unitTest'
        sh './gradlew integrationTest'
        sh './gradlew componentTest'
        sh './gradlew mutationTest'
      }
    }

    stage('tag') {
      steps {
        git(url: 'https://github.com/mkacunha/gradle-release-tag-demo.git', branch: 'master', credentialsId: 'github-mkacunha', poll: true)
        sh './gradlew release -Prelease.useAutomaticVersion=true'
      }
    }

  }
}