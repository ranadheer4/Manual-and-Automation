package com.cps.prakash;
import org.testng.annotations.Test;
import com.cps.genericUtility.IConstants;
import com.prakash.genericUtility.BaseClass;

public class SmokeTestCase_tc_01 extends BaseClass {
	
	static {
		System.setProperty(IConstants.chromeKey, IConstants.chromeValue);
	}
	
	
	@Test
	public void TestTaskPermissionWithDifferentTask() {
	
	}
	
}
