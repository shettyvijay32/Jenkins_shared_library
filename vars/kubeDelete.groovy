def call() {
   kubeconfig(credentialsId: 'k8s', serverUrl: '') {
        sh "kubectl delete -f deployment.yml"
    }
}
