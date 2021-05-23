package jk.pp.ms.entitlements.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import jk.pp.ms.commons.configs.MSCommonGlobalConfig;
import jk.pp.ms.commons.configs.MSType;

@SpringBootApplication
@ComponentScan(basePackages = { "jk.pp.ms.entitlements.domain", "jk.pp.ms.entitlements.dao",
		"jk.pp.ms.entitlements.service", "jk.pp.ms.entitlements.web" })
@EntityScan(basePackages = { "jk.pp.ms.entitlements.domain", "jk.pp.engg.foundations.common.domain.core.entitlements" })
@EnableJpaRepositories(basePackages = { "jk.pp.ms.entitlements.dao" })
@Import(value = { MSCommonGlobalConfig.class })
public class EntitlementsWebMain {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(EntitlementsWebMain.class);
		app.setAdditionalProfiles(MSCommonGlobalConfig.buildAMSStartupProfiles(MSType.ENTITLEMENTS));

		app.run(args);
	}

}
