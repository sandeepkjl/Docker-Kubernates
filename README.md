# Docker-Kubernates

kubernates command in minikube.

1. minikube start --driver=docker => to start minikube with docker.
2. kubectl apply -f deployemnt/service.yaml => to create deployemnt or servcie with external file configuration.
3. minkube service service-name (if after running that command if we see external-ip is pending for Loadbalancer network then we run **minikube tunnel** command in gitbash.)
4. kubectl get pods/deployemnts/service => to see the details of pod/deployment/servcie.
5. kubectl delete deployemnt/service <service-name> => to delete deployment/service

to stop minikube.
1 .minikube stop
2. minikube delete --all

  
  
