node{
    try{
        stage('Initialize'){
            deleteDir()
            checkout scm
            sh 'mvn clean'
        }
        stage('Build'){
            sh 'mvn compile'
        }
        stage('Test'){
            sh 'mvn test'
        }
        stage('Clean Workspace'){
            deleteDir()
        }
    }
    catch(err){
        echo "There seem some error!! Below are the details"
        throw err
    }
}