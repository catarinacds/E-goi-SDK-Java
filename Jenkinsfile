import groovy.json.JsonSlurperClassic

timeout(time: 15, unit: 'MINUTES') {
    node {
       stage('Git SCM') {
           checkout scm
       }
       stage('Build') {
           copyArtifacts filter: 'sdk-java.zip', fingerprintArtifacts: true, projectName: 'SDK Configs', selector: lastWithArtifacts(), target: './'
           sh "unzip java-sdk.zip"
       }
       //stage('Test'){
       //     sh "/usr/local/bin/mvn clean install"
       //}
       stage('Deploy') {
           def json = readFile(file:'config.json')
           def data = new JsonSlurperClassic().parseText(json)
           def version = data.artifactVersion

           sh "git commit -am \"Version:  ${version}\""
           sh 'git push'
           sh "git tag ${version}"
           sh 'git push --tags'
       }
       stage('SonarQube analysis') {
           withSonarQubeEnv('E-Goi SonarQube') {
             sh "/usr/bin/sonar-scanner"
           }
       }
   }
}
