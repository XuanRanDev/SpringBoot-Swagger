package dev.xuanran.springbootswagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableOpenApi
public class Swagger2Config {

    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())//设置API信息
                .enable(true) //是否启用Swagger，注意在正式环境关闭
                .select() // 通过select方法配置扫描包
                .apis(RequestHandlerSelectors.basePackage("dev.xuanran")) //配置要扫描哪个包
                .build();
    }

    public ApiInfo apiInfo(){
        Contact contact = new Contact("XuanRan","xuanran.cc","xuanrandev@qq.com");
        return new ApiInfo("接口开发文档", "示例Demo","1.0","https://baidu.com",
                contact,"your license","license url",new ArrayList<>());
    }
}



