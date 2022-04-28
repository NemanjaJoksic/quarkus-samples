echo "mvn clean package"
mvn clean package
echo "docker rmi quarkus_simple_jvm"
docker rmi quarkus_simple_jvm
echo "docker build -f Dockerfile.jvm -t quarkus_simple_jvm ."
docker build -f Dockerfile.jvm -t quarkus_simple_jvm .
echo "docker run -i --rm -p 8080:8080 quarkus_simple_jvm"
docker run -i --rm -p 8080:8080 quarkus_simple_jvm
