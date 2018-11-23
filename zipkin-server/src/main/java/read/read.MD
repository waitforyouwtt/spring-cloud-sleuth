####链路追踪
#####注意yml 配置文件，不然到最后可能砍不到service 哦
####查看效果：
1.依次启动eureka-server,zipkin-service,user-service,geteway-serivce
2.访问：[http://localhost:5000/user-api/user/hi]
3.访问：[http://localhost:9411/](可进行搜索，以及看依赖关系)