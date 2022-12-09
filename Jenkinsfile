#!groovy

def createTag() {
    withCredentials([gitUsernamePassword(credentialsId: 'github-mkacunha', gitToolName: 'git-tool')]) {
        dir(env.PWD) {
             sh "./gradlew release -Prelease.useAutomaticVersion=true"
        }
    }

    return '1.0.0'
}

return this