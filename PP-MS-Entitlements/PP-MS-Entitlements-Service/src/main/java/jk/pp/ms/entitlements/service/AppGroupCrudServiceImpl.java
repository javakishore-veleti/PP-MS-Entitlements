package jk.pp.ms.entitlements.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jk.pp.engg.foundations.common.domain.core.entitlements.AppGroup;
import jk.pp.engg.foundations.common.domain.core.entitlements.AppGroupCrudDTO;
import jk.pp.engg.foundations.common.service.core.AppCrudServiceImpl;
import jk.pp.ms.entitlements.dao.AppGroupCrudDAO;

@Service
public class AppGroupCrudServiceImpl extends AppCrudServiceImpl<AppGroup, AppGroupCrudDTO>
		implements AppGroupCrudService {

	public static final String BEAN_ID = AppGroupCrudServiceImpl.class.getCanonicalName();

	@Autowired
	public AppGroupCrudServiceImpl(AppGroupCrudDAO crudDAO) {
		super.setCrudServiceImplRefId(BEAN_ID);
		super.setCrudDAO(crudDAO);
	}

}
