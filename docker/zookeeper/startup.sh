docker stop imooc-zookeeper
docker rm imooc-zookeeper
docker run --name imooc-zookeeper -p 2181:2181 --restart always  zookeeper:3.5
