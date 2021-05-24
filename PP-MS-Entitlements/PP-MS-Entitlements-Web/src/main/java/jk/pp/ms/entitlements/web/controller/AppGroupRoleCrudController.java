package jk.pp.ms.entitlements.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jk.pp.engg.foundations.common.controller.core.AppCrudController;
import jk.pp.engg.foundations.common.domain.core.entitlements.AppGroupRole;
import jk.pp.engg.foundations.common.domain.core.entitlements.AppGroupRoleCrudDTO;
import jk.pp.ms.entitlements.service.AppGroupRoleCrudService;

@RestController
@RequestMapping(path = "/api/services/entitlements/appgrouprole/crud", produces = "application/json")
public class AppGroupRoleCrudController extends AppCrudController<AppGroupRole, AppGroupRoleCrudDTO> {

	@Autowired
	public AppGroupRoleCrudController(AppGroupRoleCrudService service) {
		super.setCrudService(service);
	}

	@Override
	public List<AppGroupRoleCrudDTO> populateInitialDataDomais() {

		List<AppGroupRoleCrudDTO> initialDataDomains = new ArrayList<AppGroupRoleCrudDTO>();

		AppGroupRoleCrudDTO crudDTO = null;
		AppGroupRole asset = null;

		Random randomGenerator = new Random();

		for (int ctr = 1; ctr <= 10; ++ctr) {
			crudDTO = new AppGroupRoleCrudDTO();

			asset = new AppGroupRole();

			asset.setGroupPK((long) randomGenerator.nextInt(10));
			asset.setRolePK((long) randomGenerator.nextInt(10));

			crudDTO.setDomain(asset);

			initialDataDomains.add(crudDTO);
		}

		return initialDataDomains;
	}
}
