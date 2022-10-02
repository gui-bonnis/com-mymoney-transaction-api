# com-mymoney-transaction-api

## to build gralvm package
cd transaction-api
./mvnw -DskipTests -Pnative clean package

## to create docker image
./mvnw -DskipTests clean package spring-boot:build-image

# Install gralvm on linux
https://www.graalvm.org/22.2/docs/getting-started/linux/
## download tar
mkdir ~/installs 
cd installs
curl https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-22.2.0/graalvm-ce-java17-linux-amd64-22.2.0.tar.gz ~/installs

tar -xzf graalvm-ce-java17-linux-amd64-22.2.0.tar.gz
  
cd graalvm-ce-java17-22.2.0
## Add to zshrc
export PATH=$PWD/bin:$PATH
export JAVA_HOME=$PWD


