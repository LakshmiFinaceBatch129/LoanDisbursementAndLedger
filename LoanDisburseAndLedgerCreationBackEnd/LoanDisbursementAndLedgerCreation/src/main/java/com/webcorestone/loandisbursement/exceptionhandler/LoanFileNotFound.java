package com.webcorestone.loandisbursement.exceptionhandler;

public class LoanFileNotFound extends RuntimeException 

{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public LoanFileNotFound()
	{
		
	}
	public LoanFileNotFound(String msg)
	{
		super(msg);
	}

}
