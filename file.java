Docker:
1. Advanced Commands
Docker_Host
Q1: How to create a image from running container?
Q2: What is the Algorithm Using in Docker? [SHA]
Q3: How to save image in local system? SAVE
Q4: TAG?
Q5: PUSH?
    
1 Traditional Deployment Model vs VMS vs CONTAINERIZATION
2 Monolythic VS Microservices
3 Docker Architecture
4 Docker Components
5 Docker set-up and running basic commands..
    
https://medium.com/bb-tutorials-and-thoughts/docker-a-beginners-guide-to-dockerfile-with-a-sample-project-6c1ac1f17490
Private Dockerfile creation and running..... 
Note: The name of the Dockerfile is an case sensitive and this is an global name 
as well for the private or public docker file generation.
    
vi Dockerfile
FROM ubuntu
MAINTAINER Deena
RUN apt install wget vim -y
#docker build -t pythimg .
    
ex2:
vi Dockerfile
FROM ubuntu:18.04
ENV TZ=Europe/Kiev
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
RUN apt update && apt install -y python-pip python-dev ssh python-boto3

#docker build -t pythimg .
#docker run -itd --name pythcon pythimg
#docker exec -it 1b3a283abeed /bin/bash
