package jk.pp.ms.entitlements.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jk.pp.engg.foundations.common.controller.core.AppCrudController;
import jk.pp.engg.foundations.common.domain.core.entitlements.AppGroupRole;
import jk.pp.engg.foundations.common.domain.core.entitlements.AppGroupRoleCrudDTO;
import jk.pp.ms.entitlements.service.AppGroupRoleCrudService;

@RestController
@RequestMapping(name = "/api/services/entitlements/appgrouprole/crud", produces = "application/json")
public class AppGroupRoleCrudController extends AppCrudController<AppGroupRole, AppGroupRoleCrudDTO> {

	@Autowired
	public AppGroupRoleCrudController(AppGroupRoleCrudService service) {
		super.setCrudService(service);
	}

}
