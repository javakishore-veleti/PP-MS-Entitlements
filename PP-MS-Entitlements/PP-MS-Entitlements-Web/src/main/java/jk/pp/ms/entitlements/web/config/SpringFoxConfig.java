package jk.pp.ms.entitlements.web.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ConditionalOnProperty(name = "pp.platform.ms.common.swagger.enabled", havingValue = "true")
@Configuration
@EnableSwagger2
public class SpringFoxConfig  {

}
