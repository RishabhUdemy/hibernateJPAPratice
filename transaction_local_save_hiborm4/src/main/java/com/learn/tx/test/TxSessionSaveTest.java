package com.learn.tx.test;

import com.learn.tx.dao.LoanAccountDao;
import com.learn.tx.entities.LoanAccount;
import com.learn.tx.helper.SessionFactoryRegistry;

public class TxSessionSaveTest {

	public static void main(String[] args) {
		
		LoanAccountDao loanAccountDao = null;
		LoanAccount loanAccount = null;
		
		loanAccountDao = new LoanAccountDao();
		loanAccount = new LoanAccount();
		loanAccount.setLoanNo(84578);
		loanAccount.setLoanAccountHolderName("Smith");
		loanAccount.setLoanAmount("78452");
		loanAccount.setLoanType("Personal Loan");
		try {
			loanAccountDao = new LoanAccountDao();
			loanAccountDao.getLoanAccountDetail(loanAccount);
		}finally {
			SessionFactoryRegistry.closeSessionFactory();
		}
	}
}
