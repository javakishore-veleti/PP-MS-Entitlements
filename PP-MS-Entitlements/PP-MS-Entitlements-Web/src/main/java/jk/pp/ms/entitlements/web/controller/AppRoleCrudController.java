package jk.pp.ms.entitlements.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jk.pp.engg.foundations.common.controller.core.AppCrudController;
import jk.pp.engg.foundations.common.domain.core.entitlements.AppRole;
import jk.pp.engg.foundations.common.domain.core.entitlements.AppRoleCrudDTO;
import jk.pp.ms.entitlements.service.AppRoleCrudService;

@RestController
@RequestMapping(name = "/api/services/entitlements/approle/crud", produces = "application/json")
public class AppRoleCrudController extends AppCrudController<AppRole, AppRoleCrudDTO> {

	@Autowired
	public AppRoleCrudController(AppRoleCrudService service) {
		super.setCrudService(service);
	}

}
