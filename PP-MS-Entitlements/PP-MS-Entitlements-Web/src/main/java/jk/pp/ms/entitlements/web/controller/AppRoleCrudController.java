package jk.pp.ms.entitlements.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jk.pp.engg.foundations.common.controller.core.AppCrudController;
import jk.pp.engg.foundations.common.domain.core.entitlements.AppRole;
import jk.pp.engg.foundations.common.domain.core.entitlements.AppRoleCrudDTO;
import jk.pp.ms.entitlements.service.AppRoleCrudService;

@RestController
@RequestMapping(path = "/api/services/entitlements/approle/crud", produces = "application/json")
public class AppRoleCrudController extends AppCrudController<AppRole, AppRoleCrudDTO> {

	@Autowired
	public AppRoleCrudController(AppRoleCrudService service) {
		super.setCrudService(service);
	}

	@Override
	public List<AppRoleCrudDTO> populateInitialDataDomais() {

		List<AppRoleCrudDTO> initialDataDomains = new ArrayList<AppRoleCrudDTO>();

		AppRoleCrudDTO crudDTO = null;
		AppRole asset = null;

		int length = 25;
		boolean useLetters = true;
		boolean useNumbers = false;
		String generatedString = null;

		for (int ctr = 1; ctr <= 10; ++ctr) {
			crudDTO = new AppRoleCrudDTO();

			asset = new AppRole();

			generatedString = RandomStringUtils.random(length, useLetters, useNumbers);

			asset.setName(generatedString);
			crudDTO.setDomain(asset);

			initialDataDomains.add(crudDTO);
		}

		return initialDataDomains;
	}

}
