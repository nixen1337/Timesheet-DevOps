pipeline {
    agent any
    
    stages {
        stage('Git') {
            steps {
                echo "Getting Project from Git";
                sh "rm -rf Timesheet-DevOps"
                sh "git clone https://github.com/nixen1337/Timesheet-DevOps.git"
                  }
            }
            
        stage('MVN Clean'){  
            steps {
                sh "mvn clean"
                  }
        }        
        
        stage('MVN Install'){
            steps {
                sh "mvn install"
                  }
        }       
        
        stage('MVN Test'){
            steps {
                sh "mvn test"
                  }
        }          
        
        stage('MVN Package'){
            steps {
                sh "mvn package"
                  }
        }          
        
        stage('MVN SONARQUBE'){
            steps{
                sh 'mvn sonar:sonar \
  -Dsonar.projectKey=JenkinsAchatProject \
  -Dsonar.host.url=http://172.20.10.10:9000 \
  -Dsonar.login=372e3ff11263b437e5042ec0fa5aed1d7ce5fbcd'
                 }
        }    
        stage('MVN NEXUS'){
            steps {
                sh 'mvn deploy -Dmaven.test.skip=true'
                  }
        }          
   }
}
