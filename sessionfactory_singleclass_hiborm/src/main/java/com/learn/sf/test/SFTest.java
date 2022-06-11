package com.learn.sf.test;

import com.learn.sf.dao.AddressDao;
import com.learn.sf.entities.Address;
import com.learn.sf.helper.SessionFactoryRegistry;

public class SFTest {

	public static void main(String[] args) {
		try {
		AddressDao addressDao = null;
		
		addressDao = new AddressDao();
		Address address = addressDao.getAddressDetail(1);
		
		System.out.println(address);
		}finally {
			SessionFactoryRegistry.closeSessionFactory();
		}
	}
}
