# spring_vue_learn

## Spring Boot基础配置

### 增加HTTPS支持

HTTPS证书：

* 云服务器厂商免费提供
* JDK的`jdk\bin`文件夹下`keytool`工具可以生成一个数字证书

```shell
keytool -genkey -alias tomcathttps -keyalg RSA -keysize 2048 -keystore sang.p12 -validity 365
```

各个带`-`符号表示：

* 创建新密钥
* 别名
* 加密算法
* 密钥长度
* 密钥存放位置
* 密钥有效时间

使用：

* 复制生成的`sang.p12`文件到项目根目录

* 在`application.properties`中配置如下

  ```shell
  server.ssl.key-store=sang.p12
  server.ssl.key-alias=tomcathttps
  server.ssl.key-store-password=123456 #生成密钥时指定的密码	
  ```

  