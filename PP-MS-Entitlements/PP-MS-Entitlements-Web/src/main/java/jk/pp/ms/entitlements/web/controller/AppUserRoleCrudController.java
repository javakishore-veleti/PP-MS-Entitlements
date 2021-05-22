package jk.pp.ms.entitlements.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jk.pp.engg.foundations.common.controller.core.AppCrudController;
import jk.pp.engg.foundations.common.domain.core.entitlements.AppUserRole;
import jk.pp.engg.foundations.common.domain.core.entitlements.AppUserRoleCrudDTO;
import jk.pp.ms.entitlements.service.AppUserRoleCrudService;

@RestController
@RequestMapping(name = "/api/services/entitlements/appuserrole/crud", produces = "application/json")
public class AppUserRoleCrudController extends AppCrudController<AppUserRole, AppUserRoleCrudDTO> {

	@Autowired
	public AppUserRoleCrudController(AppUserRoleCrudService service) {
		super.setCrudService(service);
	}

}
