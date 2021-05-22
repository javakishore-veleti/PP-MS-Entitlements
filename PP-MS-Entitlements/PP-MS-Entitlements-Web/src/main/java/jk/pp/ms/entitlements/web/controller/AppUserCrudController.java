package jk.pp.ms.entitlements.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jk.pp.engg.foundations.common.controller.core.AppCrudController;
import jk.pp.engg.foundations.common.domain.core.entitlements.AppUser;
import jk.pp.engg.foundations.common.domain.core.entitlements.AppUserCrudDTO;
import jk.pp.ms.entitlements.service.AppUserCrudService;

@RestController
@RequestMapping(name = "/api/services/entitlements/appuser/crud", produces = "application/json")
public class AppUserCrudController extends AppCrudController<AppUser, AppUserCrudDTO> {

	@Autowired
	public AppUserCrudController(AppUserCrudService service) {
		super.setCrudService(service);
	}

}
