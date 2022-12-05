pipeline {
  agent any
  stages {
    stage('tag') {
      steps {
        echo 'oiiiiiiiiiiiiiiiiiiiiiiii'
        withCredentials(bindings: [usernamePassword(credentialsId: 'teste', passwordVariable: 'PASSWORD', usernameVariable: 'USERNAME')]) {
          echo 'Oi quatroooooooo'
          echo "username -> ${USERNAME} "
          echo "password -> ${PASSWORD} "
          echo 'Oiii foiiiiiii'
        }

      }
    }

    stage('git') {
      steps {
        git(credentialsId: 'github-mkacunha', branch: 'master', url: 'https://github.com/mkacunha/gradle-release-tag-demo.git')
      }
    }

  }
}