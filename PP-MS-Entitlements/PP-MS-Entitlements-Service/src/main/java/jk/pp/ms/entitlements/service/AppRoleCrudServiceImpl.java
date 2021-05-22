package jk.pp.ms.entitlements.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jk.pp.engg.foundations.common.domain.core.entitlements.AppRole;
import jk.pp.engg.foundations.common.domain.core.entitlements.AppRoleCrudDTO;
import jk.pp.engg.foundations.common.service.core.AppCrudServiceImpl;
import jk.pp.ms.entitlements.dao.AppRoleCrudDAO;

@Service
public class AppRoleCrudServiceImpl extends AppCrudServiceImpl<AppRole, AppRoleCrudDTO> implements AppRoleCrudService {

	public static final String BEAN_ID = AppRoleCrudServiceImpl.class.getCanonicalName();

	@Autowired
	public AppRoleCrudServiceImpl(AppRoleCrudDAO crudDAO) {
		super.setCrudServiceImplRefId(BEAN_ID);
		super.setCrudDAO(crudDAO);
	}
}
