echo "Creating new JAR-File..."
mvn clean install
echo "Removing current container..."
docker container rm -f testservice
echo "Removing current image..."
docker image rm -f testservice
echo "Building new image and starting container..."
docker-compose up
