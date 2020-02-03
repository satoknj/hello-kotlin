FROM ubuntu:18.04

ENV DEBIAN_FRONTEND=noninteractive
SHELL ["/bin/bash", "-c"]

RUN apt-get update \
    && apt-get -y install \
        git curl zip unzip

RUN curl -s https://get.sdkman.io | bash \
    && source "/root/.sdkman/bin/sdkman-init.sh" \
    && sdk install java 11.0.6.hs-adpt \
    && sdk install kotlin 1.3.61 \
    && sdk install gradle 6.1.1

ENV DEBIAN_FRONTEND=dialog
