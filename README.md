# mvcSwagger
简单的集成了spring mvc 和 swagger


比较值得注意的一点是：修改swagger的index.html的时候，url为项目根目录后直接加上 '/api-docs'。
我最初犯的错误是把'/api-docs'添加在了swagger UI的根目录后面。

访问http://localhost:8080/apidocs/index.html即可

