def call() {
    kubeconfig(credentialsId: 'k8s', serverUrl: '')  {
        sh "kubectl apply -f deployment.yml"
    }
}
