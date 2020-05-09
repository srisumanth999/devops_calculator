pipeline{
  agent any
  stages 
    {
    stage('Clean') {
      steps {
        sh 'mvn clean'
      }
    }
    stage('Compile') {
      steps {
        sh 'mvn compile'
      }
    }
    stage('Test') {
      steps {
        sh 'mvn test'
      }
    }
             stage ('Building image')
        {
           steps{
                 script {
                      dockerImage=docker.build registry + ":$BUILD_NUMBER"
                      dockerImageLatest=docker.build registry + ":latest"
                   }
               }
         }

          stage('Deploy Image') {
             steps{
                 script{
                      docker.withRegistry('',registryCredential){
                      dockerImage.push()
                      dockerImageLatest.push()
                     }
                 }
             }
          }
  }
}
