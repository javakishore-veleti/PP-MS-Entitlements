package jk.pp.ms.entitlements.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jk.pp.engg.foundations.common.domain.core.entitlements.AppUserRole;
import jk.pp.engg.foundations.common.domain.core.entitlements.AppUserRoleCrudDTO;
import jk.pp.engg.foundations.common.service.core.AppCrudServiceImpl;
import jk.pp.ms.entitlements.dao.AppUserRoleCrudDAO;

@Service
public class AppUserRoleCrudServiceImpl extends AppCrudServiceImpl<AppUserRole, AppUserRoleCrudDTO>
		implements AppUserRoleCrudService {

	public static final String BEAN_ID = AppUserRoleCrudServiceImpl.class.getCanonicalName();

	@Autowired
	public AppUserRoleCrudServiceImpl(AppUserRoleCrudDAO crudDAO) {
		super.setCrudServiceImplRefId(BEAN_ID);
		super.setCrudDAO(crudDAO);
	}
}
