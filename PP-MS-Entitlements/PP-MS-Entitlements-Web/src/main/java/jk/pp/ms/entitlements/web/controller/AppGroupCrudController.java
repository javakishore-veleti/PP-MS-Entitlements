package jk.pp.ms.entitlements.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jk.pp.engg.foundations.common.controller.core.AppCrudController;
import jk.pp.engg.foundations.common.domain.core.entitlements.AppGroup;
import jk.pp.engg.foundations.common.domain.core.entitlements.AppGroupCrudDTO;
import jk.pp.ms.entitlements.service.AppGroupCrudService;

@RestController
@RequestMapping(path = "/api/services/entitlements/appgroup/crud", produces = "application/json")
public class AppGroupCrudController extends AppCrudController<AppGroup, AppGroupCrudDTO> {

	@Autowired
	public AppGroupCrudController(AppGroupCrudService service) {
		super.setCrudService(service);
	}

	@Override
	public List<AppGroupCrudDTO> populateInitialDataDomais() {

		List<AppGroupCrudDTO> initialDataDomains = new ArrayList<AppGroupCrudDTO>();

		AppGroupCrudDTO crudDTO = null;
		AppGroup asset = null;

		int length = 25;
		boolean useLetters = true;
		boolean useNumbers = false;
		String generatedString = null;

		for (int ctr = 1; ctr <= 10; ctr++) {
			crudDTO = new AppGroupCrudDTO();

			asset = new AppGroup();

			generatedString = RandomStringUtils.random(length, useLetters, useNumbers);

			asset.setName(generatedString);
			crudDTO.setDomain(asset);

			initialDataDomains.add(crudDTO);
		}

		return initialDataDomains;
	}

}
