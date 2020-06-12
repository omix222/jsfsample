 3 lines (3 sloc) 175 Bytes
#!/bin/sh
mvn clean package && docker build -t jsfsample/jsfsample .
docker rm -f jsfsample || true && docker run -d -p 8080:8080 -p 4848:4848 --name jsfsample jsfsample/jsfsample