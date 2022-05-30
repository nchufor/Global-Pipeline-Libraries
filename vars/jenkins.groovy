stage('Maven Clean Build') {
        def mavenHome = tool name: "Maven-3.8.4", type: "maven"
        def mavenCMD = "${mavenHome}/bin/mvn"
        sh "${mavenCMD} clean package"
        sh "mvn verify"
