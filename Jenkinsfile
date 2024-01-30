pipeline {
 agent {
    docker {
      image 'maven:3.9.0-eclipse-temurin-17-alpine'
      args '-v ${PWD}/:/usr/src/app -w /usr/src/app'
      reuseNode true
    }
  }
  stages {
    stage('Build') {
      steps {
        sh "mvn clean package"
      }
    }
    stage('Test') {
      steps {
        sh "mvn test"
      }
    }
    // stage('Deploy') {

    //   steps {
    //     sh "docker build -t first-image ."
    //   }
    // }
  }
}