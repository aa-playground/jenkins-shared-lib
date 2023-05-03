# jenkins-shared-lib

### dockerbuild usage
- add the shared library in the Jenkinsfile
```
library identifier: 'jenkins-shared-lib@fmain', retriever: modernSCM([$class: 'GitSCMSource',
   remote: 'https://github.com/aa-playground/jenkins-shared-lib.git',
   credentialsId: 'github_token'])
```

- add the function call in the stage

```
    stage('Docker Image Build') {
      steps {
        script{
               container('podman') {
               podmanBuild("jed.ocir.io", "${imageName}", "${tag}")
               }
            }
        }
    }
```