pipeline {
    agent any
    stages {
        stage("Compile") {
            steps {
                sh "chmod u+x gradlew"
                sh "./gradlew compileJava"
            }
        }
        stage("Unit test") {
            steps {
                sh "chmod u+x gradlew"
                sh "./gradlew test"
            }
        }
        stage("Code Coverage") {
            steps {
                sh "chmod u+x gradlew"
                sh "./gradlew jacocoTestReport"
                publishHTML (target: [
                    reportDir: 'build/reports/jacoco/test/html',
                    reportFiles: 'index.html',
                    reportName: "JaCoCo Report"
                ])
                sh "./gradlew jacocoTestCoverageVerification"
            }
        }
    }
}
