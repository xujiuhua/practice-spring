## SpringBoot freemarker 国际化

### step1: 引入spring.ftl

### step2: implements WebMvcConfigurer

### step3: message_xx.properties

### step4: 页面中使用`@spring.message code="xx"`


```java
@Configuration
public class I18nConfig implements WebMvcConfigurer {
    @Bean
    public LocaleResolver localeResolver() {
        SessionLocaleResolver slr = new SessionLocaleResolver();
        slr.setDefaultLocale(Locale.CHINA);
        return slr;
    }

    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
        // 拦截请求参数 lang
        lci.setParamName("lang");
        return lci;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localeChangeInterceptor());
    }
}
```

基于（请求、session、cookie）三种形式

- 基于请求：请求时携带参数`?lang=en_US`

e.g: http://localhost:8080/login?lang=en_US

- 基于session
```java
@Bean
public LocaleResolver localeResolver() {
    SessionLocaleResolver slr = new SessionLocaleResolver();
    slr.setDefaultLocale(Locale.CHINA);
    return slr;
}

```

当第一次请求更改语言后，以后的请求不用携带参数`?lang=en_US`，请求时会基于session国际化，
如访问http://localhost:8080/login，会session国际化

- [TODO] 基于cookie