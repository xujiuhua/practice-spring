## SpringBoot thymeleaf 国际化

#### step1: Defining the Message Sources

messages_XX.properties, where XX is the locale code, see `java.util.Locale`

#### step2: setting application.yml

```yaml
spring:
  messages:
    basename: i18n/messages   # 设置国际化配置文件存放在classpath:/i18n目录下
    encoding: utf-8           # 设定message bundles编码方式，默认为UTF-8
  thymeleaf:
    mode: HTML
    encoding: UTF-8
```

#### step3: Implements WebMvcConfigurer

> Recommend using WebMvcConfigurer as WebMvcConfigurerAdapter is Deprecated.

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
        lci.setParamName("lang");
        return lci;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localeChangeInterceptor());
    }
}
```

#### step4: Controller And Html

`#{}` read value from .properties

`${}` read value from backEnd model

