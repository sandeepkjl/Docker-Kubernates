# Docker-Kubernates

kubernates command in minikube.

1. minikube start --driver=docker => to start minikube with docker.
2. kubectl apply -f deployemnt/service.yaml => to create deployemnt or servcie with external file configuration.
3. kubectl get pods/deployemnts/service => to see the details of pod/deployment/servcie.
4. kubectl delete deployemnt/service <service-name> => to delete deployment/service

to stop minikube.
minikube stop
minikube delete --all
