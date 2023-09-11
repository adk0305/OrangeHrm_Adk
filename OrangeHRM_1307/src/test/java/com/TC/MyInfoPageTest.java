package com.TC;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pages.DashboardPage;
import com.Pages.LoginPage;
import com.Pages.MyInfoPage;

public class MyInfoPageTest {
LoginPage lp;
DashboardPage dp;
MyInfoPage mip;


	@BeforeMethod
	public void browserSetup() {
		lp = new LoginPage();
		lp.initialization();	
}
	@Test
	public void MyInfoPage () {
		dp = lp.login();
		mip = dp.getMyInfoPage();
		
	}
	@Test
	public void PersonalDetailsisPresent() {
		dp= lp.login();
		mip=dp.getMyInfoPage();
//		Assert.assertTrue(mip.);
		
	}
	@Test
	public void validate_fill_personaldetails() {
	
		dp = lp.login();
		mip = dp.getMyInfoPage();
		mip.firstname();
		mip.middlename();
		mip.lastname();
		mip.nickname();
		mip.employeeid();
		mip.otherid();
		mip.licexdate();
		mip.ssnnumber();
		mip.sinnumber();
		mip.maritalstatus();
		mip.dateofbirth();
		mip.gender();
		mip.militaryservice();
		mip.smoker();
		mip.nationality();
		mip.drivlicno();
		mip.save();
	}
//	@Test
//	public void firstname() {
//		dp = lp.login();
//		mip = dp.getMyInfoPage();
//		mip.firstname();
//	}
//
//@Test
//public void middlename() {
//	dp = lp.login();
//	mip = dp.getMyInfoPage();
//	mip.middlename();
//}	
//@Test
//public void lastname() {
//	dp = lp.login();
//	mip = dp.getMyInfoPage();
//	mip.lastname();
//}
//@Test
//public void nickname() {
//	dp = lp.login();
//	mip = dp.getMyInfoPage();
//	mip.nickname();
//}
//@Test
//public void employeeid() {
//	dp = lp.login();
//	mip = dp.getMyInfoPage();
//	mip.employeeid();
//}
//
//@Test
//public void otherid() {
//	dp = lp.login();
//	mip = dp.getMyInfoPage();
//	mip.otherid();
//}
//@Test
//public void drivlicno() {
//	dp = lp.login();
//	mip = dp.getMyInfoPage();
//	mip.drivlicno();
//}
//@Test
//public void licexdate() {
//	dp = lp.login();
//	mip = dp.getMyInfoPage();
//	mip.licexdate();
//}
//@Test
//public void ssnnumber() {
//	dp = lp.login();
//	mip = dp.getMyInfoPage();
//	mip.ssnnumber();
//}
//
//@Test
//public void sinnumber() {
//	dp = lp.login();
//	mip = dp.getMyInfoPage();
//	mip.sinnumber();
//}
//
//@Test
//public void nationality() {
//	dp = lp.login();
//	mip = dp.getMyInfoPage();
//	mip.nationality();
//}
//
//@Test
//public void maritalstatus() {
//	dp = lp.login();
//	mip = dp.getMyInfoPage();
//	mip.maritalstatus();
//}
//
//@Test
//public void dateofbirth() {
//	dp = lp.login();
//	mip = dp.getMyInfoPage();
//	mip.dateofbirth();
//}
//
//@Test
//public void gender() {
//	dp = lp.login();
//	mip = dp.getMyInfoPage();
//	mip.gender();
//}
//
//@Test
//public void militaryservice() {
//	dp = lp.login();
//	mip = dp.getMyInfoPage();
//	mip.militaryservice();
//}
//
//@Test
//public void smoker() {
//	dp = lp.login();
//	mip = dp.getMyInfoPage();
//	mip.smoker();
//}
//
//@Test
//public void save() {
//	dp = lp.login();
//	mip = dp.getMyInfoPage();
//	mip.save();
//	
//}
@Test
public void bloodtype() {
	dp = lp.login();
	mip = dp.getMyInfoPage();
	mip.bloodtype();
	
}
@Test
public void addattachment()  {
	dp = lp.login();
	mip = dp.getMyInfoPage();
	mip.addattachment();
	mip.browseattachment();
	mip.attacmentsubmit();
	mip.viewattachment();
}
@AfterMethod
public void closeSetup() {
	//lp.tearDown();
}


}

