package com.learn.mto.test;

import com.learn.mto.dao.GoldLoanDao;
import com.learn.mto.dao.OrnamentDao;
import com.learn.mto.entities.GoldLoan;
import com.learn.mto.entities.Ornament;

public class MTOHibernateConfigTest {

	public static void main(String[] args) {

		
		/*
		 * GoldLoanDao goldLoanDao = null; OrnamentDao ornamentDao = null;
		 * 
		 * GoldLoan goldLoan = null; Ornament ornament = null;
		 * 
		 * goldLoanDao = new GoldLoanDao(); goldLoan = new GoldLoan();
		 * goldLoan.setDescription("Loan for house purchase");
		 * goldLoan.setIntrestRate(23.45f); goldLoan.setLoanAmount(250000);
		 * goldLoan.setTotalWeight(70); int goldLoanNo =
		 * goldLoanDao.saveGoldLoan(goldLoan);
		 * System.out.println("GoldLoanNo: "+goldLoanNo);
		 * 
		 * ornamentDao = new OrnamentDao(); ornament = new Ornament();
		 * ornament.setDescription("Chain"); ornament.setEstimatedValue(300000);
		 * ornament.setWeight(25); ornament.setGoldLoan(goldLoan);
		 * 
		 * int ornamentId = ornamentDao.saveOrnament(ornament);
		 * System.out.println("Ornament Id:"+ornamentId);
		 * 
		 */
		GoldLoanDao goldLoanDao = new GoldLoanDao();
		OrnamentDao ornamentDao = new OrnamentDao();

		Ornament ornament = ornamentDao.getGoldLoan(1);
		System.out.println(ornament);

		GoldLoan goldLoan = goldLoanDao.getGoldLoan(1);
		System.out.println(goldLoan);
	}
}
