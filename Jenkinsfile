import groovy.json.JsonSlurperClassic

timeout(time: 15, unit: 'MINUTES') {
    node {
       stage('Git SCM') {
           checkout scm
       }
       stage('Build') {
           sh "openapi-generator version"
           sh "openapi-generator generate -i https://dev-api.egoiapp.com/openapi -g php -o . -c configJava.json"

           sh "rm -rf target/"
           sh "ls"
           sh "/usr/local/bin/mvn clean install"
       }
       stage('Test') {
           //add junit tests
       }
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
