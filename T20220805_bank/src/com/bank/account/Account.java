package com.bank.account;

import java.sql.Date; // (년/월/일)

import lombok.Data;



//import java.util.Date;(년/월/일/시/분/초)

@Data

public class Account {
//	ACCOUNT_ID 	NOT NULL  VARCHAR2(20 BYTE)
//	MEMBER_ID 	NOT NULL  VARCHAR2(20 BYTE)
//	BALANCE 			  NUMBER
//	CREDATE				  DATE
	
	private String accountId;
	private String memberId;
	private int balance;
	private Date credate;

}
