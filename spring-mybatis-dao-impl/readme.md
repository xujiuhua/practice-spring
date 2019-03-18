## 技术

SpringMVC + MySQL + MyBaits + Gradle

## 功能

登陆、记录登陆日志

## 扩展

1. Gradle 安装及配置
2. Spring 单元测试
3. 事务控制

## 集成MyBatis步骤

> 每一个 Mybatis 应用程序都以一个 SqlSessionFactory 对象的实例为核心

### 添加依赖包

```xml
'org.mybatis:mybatis:3.4.1',
'org.mybatis:mybatis-spring:1.3.0'
```

### 配置 applicationContext.xml

```xml
<bean id="sqlSessionFactory"
  class="org.mybatis.spring.SqlSessionFactoryBean"
  p:dataSource-ref="dataSource"
  p:configLocation="classpath:myBatisConfig.xml"
  p:mapperLocations="classpath:mapper/*.xml"/>

<bean class="org.mybatis.spring.SqlSessionTemplate">
	<constructor-arg ref="sqlSessionFactory"/>
</bean>
```


