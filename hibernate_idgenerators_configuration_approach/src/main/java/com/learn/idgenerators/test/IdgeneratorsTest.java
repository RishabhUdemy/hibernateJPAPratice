package com.learn.idgenerators.test;

import com.learn.idgenerators.dao.OutletDao;
import com.learn.idgenerators.entities.Outlet;

public class IdgeneratorsTest {

	public static void main(String[] args) {
		OutletDao dao = new OutletDao();
		
		Outlet outlet = new Outlet();
		outlet.setCapacity(200);
		outlet.setContactNo("85478934");
		outlet.setDescription("near to bus stand");
		outlet.setInChargeName("smith");
		outlet.setLocation("Kondapur");
		outlet.setOutletName("Kondapur shopping");
		
		/* int id = dao.getOutletId(outlet); */
		String id = dao.getOutletId(outlet);
		System.out.println("Detail id of Outlet:"+id);
	}
}
