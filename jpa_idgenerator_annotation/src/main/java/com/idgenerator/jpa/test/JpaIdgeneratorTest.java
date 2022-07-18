package com.idgenerator.jpa.test;

import java.util.Date;

import com.idgenerator.jpa.dao.BillDao;
import com.idgenerator.jpa.entities.Bill;

public class JpaIdgeneratorTest {

	public static void main(String[] args) {
		
		BillDao dao = new BillDao();
		Bill bill = new Bill();
		bill.setAmount(2358.23);
		bill.setBillDate(new Date());
		bill.setCustomerName("Smith");
		bill.setDescription("By the Grocery");
		int id = dao.getBillNo(bill);
		System.out.println("Bill id generated:"+id);
	}
}
