def call() {
    sh 'trivy image vijaytechnologies/youtube:latest > trivyimage.txt'
}
