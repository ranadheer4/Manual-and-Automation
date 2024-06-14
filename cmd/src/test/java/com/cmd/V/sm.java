package com.cmd.V;

import org.testng.annotations.Test;

import com.cps.genericUtility.BaseClass;
import com.cps.genericUtility.IConstants;

public class sm extends BaseClass {
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}


	
	@Test
	public void m1()
	{
		
	}
}
