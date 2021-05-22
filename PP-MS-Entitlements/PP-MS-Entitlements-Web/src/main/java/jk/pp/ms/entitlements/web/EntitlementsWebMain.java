package jk.pp.ms.entitlements.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import jk.pp.ms.commons.configs.MSCommonGlobalConfig;
import jk.pp.ms.commons.configs.MSType;

@SpringBootApplication
@Import(MSCommonGlobalConfig.class)
public class EntitlementsWebMain {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(EntitlementsWebMain.class);
		app.setAdditionalProfiles(MSCommonGlobalConfig.buildAMSStartupProfiles(MSType.ENTITLEMENTS));
		
		app.run(args);
	}

}
