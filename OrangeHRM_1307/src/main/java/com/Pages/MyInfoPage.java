package com.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Base.Base;
//import com.orangehrm.base.ScreenshotCapture;
//import com.orangehrm.pages.MyinfoPage;

public class MyInfoPage extends Base{
	public void PersonalDetailsispresent() {
		driver.findElement(By.xpath("//a[normalize-space()='Personal Details']")).click();
//		By firstname=By.xpath("//input[@name='firstName']");
		
	}
	
	public void firstname() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act = new Actions(driver);
		WebElement fname=driver.findElement(By.xpath("//input[@name='firstName']"));
		fname.click();
		act.moveToElement(fname).doubleClick(fname).sendKeys(fname, Keys.CONTROL,"a",Keys.BACK_SPACE)
		.build().perform();
		fname.sendKeys(prop.getProperty("firstname"));
		
	}
	public void middlename() {
		Actions act = new Actions(driver);
		WebElement mname=driver.findElement(By.xpath("//input[@placeholder='Middle Name']"));
		mname.click();
		act.moveToElement(mname).doubleClick(mname).sendKeys(mname, Keys.CONTROL,"a",Keys.BACK_SPACE)
		.build().perform();
		mname.sendKeys(prop.getProperty("middlename"));
		
	}
	public void lastname() {
		Actions act = new Actions(driver);
		WebElement lname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lname.click();
		act.moveToElement(lname).doubleClick(lname).sendKeys(lname, Keys.CONTROL,"a",Keys.BACK_SPACE)
		.build().perform();
		lname.sendKeys(prop.getProperty("lastname"));
		
	}
	public void nickname() {
		Actions act = new Actions(driver);
		WebElement nname=driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//following::label[text()='Nickname']//following::input[1]"));
		nname.click();
		act.moveToElement(nname).doubleClick(nname).sendKeys(nname, Keys.CONTROL,"a",Keys.BACK_SPACE)
		.build().perform();
		nname.sendKeys(prop.getProperty("nickname"));
		
	}	
	public void employeeid() {
		Actions act = new Actions(driver);
		WebElement empid=driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//following::label[text()='Employee Id']//following::input[1]"));
		empid.click();
		act.moveToElement(empid).doubleClick(empid).sendKeys(empid, Keys.CONTROL,"a",Keys.BACK_SPACE)
		.build().perform();
		empid.sendKeys(prop.getProperty("employeeid"));
		
	}	
	public void otherid() {
		Actions act = new Actions(driver);
		WebElement otherid=driver.findElement(By.xpath("//label[text()='Other Id']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//descendant::input"));
		otherid.click();
		act.moveToElement(otherid).doubleClick(otherid).sendKeys(otherid, Keys.CONTROL,"a",Keys.BACK_SPACE)
		.build().perform();
		otherid.sendKeys(prop.getProperty("otherid"));
		
	}
	public void drivlicno() {
		Actions act = new Actions(driver);
		WebElement dlic=driver.findElement(By.xpath("//label[text()=\\\"Driver's License Number\\\"]//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//descendant::input"));
		dlic.click();
		act.moveToElement(dlic).doubleClick(dlic).sendKeys(dlic, Keys.CONTROL,"a",Keys.BACK_SPACE)
		.build().perform();
		dlic.sendKeys(prop.getProperty("drivlicno"));
		
	}	
	
	public void licexdate() {
		Actions act = new Actions(driver);
		WebElement ledate = driver.findElement(By.xpath("//label[text()='License Expiry Date']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//descendant::input"));
		ledate.click();
		act.moveToElement(ledate).doubleClick(ledate).sendKeys(ledate, Keys.CONTROL,"a",Keys.BACK_SPACE)
		.build().perform();
		ledate.sendKeys(prop.getProperty("licensceExpiry"));
		
	}	
	
	public void ssnnumber() {
		Actions act = new Actions(driver);
		WebElement ssn = driver.findElement(By.xpath("//label[text()='SSN Number']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//descendant::input"));
		ssn.click();
		act.moveToElement(ssn).doubleClick(ssn).sendKeys(ssn, Keys.CONTROL,"a",Keys.BACK_SPACE)
		.build().perform();
		ssn.sendKeys(prop.getProperty("SSNNumber"));
		
	}
	public void sinnumber() {
		Actions act = new Actions(driver);
		WebElement sin = driver.findElement(By.xpath("//label[text()='SIN Number']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//descendant::input"));
		sin.click();
		act.moveToElement(sin).doubleClick(sin).sendKeys(sin, Keys.CONTROL,"a",Keys.BACK_SPACE)
		.build().perform();
		sin.sendKeys(prop.getProperty("SINNumber"));
		
	}	
	
	public void nationality() {
		Actions act = new Actions(driver);
		WebElement nation = driver.findElement(By.xpath("//div[@clear='false'][normalize-space()='-- Select --']"));
		nation.click();
		act.moveToElement(nation).doubleClick(nation).sendKeys(nation, Keys.CONTROL,"a",Keys.BACK_SPACE)
		.build().perform();
		nation.sendKeys(prop.getProperty("Nationality"));
		
	}	
	
	public void maritalstatus() {
		Actions act = new Actions(driver);
		WebElement mstat = driver.findElement(By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]"));
		mstat.click();
		act.moveToElement(mstat).doubleClick(mstat).sendKeys(mstat, Keys.CONTROL,"a",Keys.BACK_SPACE)
		.build().perform();
		mstat.sendKeys(prop.getProperty("MaritalStatus"));
		
	}		

	public void dateofbirth() {
		Actions act = new Actions(driver);
		WebElement dob = driver.findElement(By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[1]//div[1]//div[2]//div[1]//div[1]//input[1]]"));
		dob.click();
		act.moveToElement(dob).doubleClick(dob).sendKeys(dob, Keys.CONTROL,"a",Keys.BACK_SPACE)
		.build().perform();
		dob.sendKeys(prop.getProperty("DOB"));
		
	}

	public void gender() {
		Actions act = new Actions(driver);
		WebElement gen = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
		gen.click();
//		act.moveToElement(gen).doubleClick(gen).sendKeys(gen, Keys.CONTROL,"a",Keys.BACK_SPACE)
//		.build().perform();
//		gen.sendKeys(prop.getProperty("Gender"));
		
	}
	
	public void militaryservice() {
		Actions act = new Actions(driver);
		WebElement mser = driver.findElement(By.xpath("//div[4]//div[1]//div[1]//div[1]//div[2]//input[1]"));
		mser.click();
		act.moveToElement(mser).doubleClick(mser).sendKeys(mser, Keys.CONTROL,"a",Keys.BACK_SPACE)
		.build().perform();
		mser.sendKeys(prop.getProperty("MilitaryService"));
		
	}
	
	public void smoker() {
		Actions act = new Actions(driver);
		WebElement smoke = driver.findElement(By.xpath("//label[normalize-space()='Yes']"));
		smoke.click();
//		act.moveToElement(smoke).doubleClick(smoke).sendKeys(smoke, Keys.CONTROL,"a",Keys.BACK_SPACE)
//		.build().perform();
//		smoke.sendKeys(prop.getProperty("Smoker"));
		
	}
	public void save() {
		WebElement S = driver.findElement(By.xpath("//div[@class='orangehrm-attachment']//descendant::button[@type='submit"));
		S.click();				
		
	}

	public void bloodtype() {
		Actions act = new Actions(driver);
		WebElement blood = driver.findElement(By.xpath("//div[contains(text(),'-- Select --')]"));
		blood.click();
		act.moveToElement(blood).doubleClick(blood).sendKeys(blood, Keys.CONTROL,"a",Keys.BACK_SPACE)
		.build().perform();
		blood.sendKeys(prop.getProperty("BloodType"));
}
	public  void addattachment() {
	    WebElement add =driver.findElement(By.xpath("//button[text()=' Add ']"));
		Actions act = new Actions(driver);
		act.moveToElement(add).click().build().perform();		
		
	}

public void viewattachment() {
	//System.out.println(driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span']")).getText());
	String actresult= new String(driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span']")).getText());
	 System.out.println(actresult);
		String excpresult= new String("No Record Found");

		 if(excpresult.equals(actresult) ) {
				System.out.println("Failed :NO Record Found");
		 }
		 else {
				System.out.println("Passed: "+actresult);
		 }

}


public void browseattachment() {
		
	WebElement browse  = driver.findElement(By.xpath("//input[@type='file']"));
	browse.sendKeys(prop.getProperty("browsefile"));
	
}
	
public void attacmentsubmit() {
	Actions act = new Actions(driver);
	WebElement savesub = driver.findElement(By.xpath("//div[@class='orangehrm-attachment']//descendant::button[@type='submit']"));

	act.moveToElement(savesub).click().build().perform();
	
	
}
}