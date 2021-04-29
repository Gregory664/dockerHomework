FROM ubuntu:latest

RUN apt-get update
SHELL ["/bin/bash", "-c"]
RUN apt-get -qq -y install curl wget unzip zip

RUN curl -s "https://get.sdkman.io" | bash
RUN source "$HOME/.sdkman/bin/sdkman-init.sh" && sdk install java 21.0.0.2.r11-grl && java --version
ENV PATH=/root/.sdkman/candidates/java/current/bin:$PATH

RUN mkdir /app
RUN mkdir /app/config

