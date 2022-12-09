#!groovy

def createTag() {
    stage('create-tag') {
        steps {
             withCredentials([gitUsernamePassword(credentialsId: 'github-mkacunha', gitToolName: 'git-tool')]) {
               sh "./gradlew release -Prelease.useAutomaticVersion=true"
             }
           }
    }
   
    return '1.0.0'
}

return this