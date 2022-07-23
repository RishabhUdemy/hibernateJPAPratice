package com.learn.cpkjpa.test;

import com.learn.cpkjpa.dao.GurageDao;
import com.learn.cpkjpa.entities.Gurage;
import com.learn.cpkjpa.entities.GuragePk;

public class GurageTest {

	public static void main(String[] args) {
		
		/*
		 * GuragePk guragePk = new GuragePk();
		 * guragePk.setGurageClubRegNo("CG-83kD352");
		 * guragePk.setGurageName("Smith Gurage"); Gurage gurage = new Gurage();
		 * gurage.setGuragePk(guragePk); gurage.setContactNo("741258965");
		 * gurage.setLocation("Kondapur"); gurage.setProprietorName("Smith");
		 * 
		 * GurageDao dao = new GurageDao(); dao.gurageDetailInsertion(gurage);
		 */
		
		GurageDao dao = new GurageDao();
		Gurage gurage = dao.getGurageDetail("Smith Gurage", "CG-83kD352");
		System.out.println(gurage);
	}
}
