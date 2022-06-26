package com.learn.ha.test;

import com.learn.ha.dao.MerchantDao;
import com.learn.ha.entities.Merchant;

public class HibAnnotationTest {

	public static void main(String[] args) {
		MerchantDao dao = null;
		Merchant merchant = null;
		
		dao = new MerchantDao();
		merchant = dao.getMerchantDetail();
		System.out.println(merchant);
	}
}
