package jk.pp.ms.entitlements.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jk.pp.engg.foundations.common.controller.core.AppCrudController;
import jk.pp.engg.foundations.common.domain.core.entitlements.AppGroup;
import jk.pp.engg.foundations.common.domain.core.entitlements.AppGroupCrudDTO;
import jk.pp.ms.entitlements.service.AppGroupCrudService;

@RestController
@RequestMapping(name = "/api/services/entitlements/appgroup/crud", produces = "application/json")
public class AppGroupCrudController extends AppCrudController<AppGroup, AppGroupCrudDTO> {

	@Autowired
	public AppGroupCrudController(AppGroupCrudService service) {
		super.setCrudService(service);
	}

}
