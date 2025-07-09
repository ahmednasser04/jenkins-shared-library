def call(Map params) {
    pipeline {
        agent any

        stages {
            stage("Build: ${params.target}") {
                steps {
                    echo "Target: ${params.target}"
                    echo "Arch: ${params.arch}"
                    echo "Build Type: ${params.type}"
                }
            }
        }
    }
}