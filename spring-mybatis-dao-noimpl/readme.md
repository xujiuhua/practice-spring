## 技术

SpringMVC + MySQL + MyBaits + Gradle

## 功能

Dao层无实现

```xml
<!-- 映射接口直接转换为spring容器的bean -->
<bean class="org.mybatis.spring.mapper.MapperScannerConfigurer"
      p:basePackage="com.*.dao"/>
```

