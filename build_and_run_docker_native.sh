echo "mvn package -Pnative -Dnative-image.docker-build=true"
mvn package -Pnative -Dnative-image.docker-build=true
echo "docker rmi quarkus_simple_native"
docker rmi quarkus_simple_native
echo "docker build -f Dockerfile.native -t quarkus_simple_native ."
docker build -f Dockerfile.native -t quarkus_simple_native .
echo "docker run -i --rm -p 8080:8080 quarkus_simple_native"
docker run -i --rm -p 8080:8080 quarkus_simple_native
