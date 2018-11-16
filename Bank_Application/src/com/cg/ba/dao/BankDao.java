package com.cg.ba.dao;

import com.cg.ba.bean.BankDetails;
import com.cg.ba.bean.CustomerDetails;
import com.cg.ba.exception.BankException;

public interface BankDao {
	public int createAccount(CustomerDetails cd,BankDetails bank) throws BankException;
	public BankDetails showBalance(int cusAccNum) throws BankException;
	public BankDetails deposit(int cusAccNum,int bal) throws BankException;
	public BankDetails withdraw(int cusAccNum,int bal) throws BankException;
	public BankDetails fundTransfer(int AccNum,int transferAccNum, int bal)throws BankException;
}
