package jk.pp.ms.entitlements.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jk.pp.engg.foundations.common.domain.core.entitlements.AppUser;
import jk.pp.engg.foundations.common.domain.core.entitlements.AppUserCrudDTO;
import jk.pp.engg.foundations.common.service.core.AppCrudServiceImpl;
import jk.pp.ms.entitlements.dao.AppUserCrudDAO;

@Service
public class AppUserCrudServiceImpl extends AppCrudServiceImpl<AppUser, AppUserCrudDTO> implements AppUserCrudService {

	public static final String BEAN_ID = AppUserCrudServiceImpl.class.getCanonicalName();

	@Autowired
	public AppUserCrudServiceImpl(AppUserCrudDAO crudDAO) {
		super.setCrudServiceImplRefId(BEAN_ID);
		super.setCrudDAO(crudDAO);
	}

}
