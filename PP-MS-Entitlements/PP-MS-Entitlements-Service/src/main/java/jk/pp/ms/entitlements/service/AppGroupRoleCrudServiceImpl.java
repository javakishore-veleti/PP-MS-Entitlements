package jk.pp.ms.entitlements.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jk.pp.engg.foundations.common.domain.core.entitlements.AppGroupRole;
import jk.pp.engg.foundations.common.domain.core.entitlements.AppGroupRoleCrudDTO;
import jk.pp.engg.foundations.common.service.core.AppCrudServiceImpl;
import jk.pp.ms.entitlements.dao.AppGroupRoleCrudDAO;

@Service
public class AppGroupRoleCrudServiceImpl extends AppCrudServiceImpl<AppGroupRole, AppGroupRoleCrudDTO>
		implements AppGroupRoleCrudService {

	public static final String BEAN_ID = AppGroupRoleCrudServiceImpl.class.getCanonicalName();

	@Autowired
	public AppGroupRoleCrudServiceImpl(AppGroupRoleCrudDAO crudDAO) {
		super.setCrudServiceImplRefId(BEAN_ID);
		super.setCrudDAO(crudDAO);
	}

}
