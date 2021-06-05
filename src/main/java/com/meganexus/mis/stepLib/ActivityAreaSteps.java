package com.meganexus.mis.stepLib;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.meganexus.mis.pageObjectLib.ActivityAreaPage;

import net.thucydides.core.annotations.Step;


public class ActivityAreaSteps extends GenericStep{

	
	ActivityAreaPage acti;
	
		@Step
		public void clickActivityAreaTopTab() throws Exception{
			acti.NavigateToActivityAREAMainPage();
		}
	
		@Step
		public void clickActivityAreaSIDETab() throws Exception{
			acti.clickActivityAreaSIDETAB();
			acti.verifySidetabs();
		}
	
		@Step
		public void intialVerificationForm() throws Exception{
			acti.verifyForm();
		}
		
		@Step
		public void clickADDActivityAreaSIDETAB() throws Exception{
			acti.clickADDActivityAreaSIDETAB();
		}
		
		@Step
		public void FillAddForm() throws Exception{
			acti.verifyADDEDITForm();
			acti.FillAddEditActivityAreaForm(acti.ADDActiArea, acti.ADDCap, acti.ADDStartDate, acti.ADDSpeciReq, acti.ADDEndDate);
		}
		
		@Step
		public void VerifyARecordAfterAddorEdit(String AddOrEdit) throws Exception{
			acti.clickVIEWButton();
			if(AddOrEdit =="Add"){
				acti.VerifyVIEWActivityAreaPage(acti.ADDActiArea, acti.ADDCap, acti.ADDStartDate, acti.ADDSpeciReq, acti.ADDEndDate);
			}
			else if(AddOrEdit =="Edit"){
				acti.VerifyVIEWActivityAreaPage(acti.EDITActiArea, acti.EDITCap, acti.EDITStartDate, acti.EDITSpeciReq, acti.EDITEndDate);
			}
		}
		
		@Step
		public void FillEditForm() throws Exception{
			acti.clickEDITButton();
			acti.FillAddEditActivityAreaForm(acti.EDITActiArea, acti.EDITCap, acti.EDITStartDate, acti.EDITSpeciReq, acti.EDITEndDate);
		}
		
		@Step
		public void verifyTable(String AddorEdit) throws Exception{
			if(AddorEdit == "Add"){
				acti.VerifyActivityAreaList("Add");	
			}
			else if(AddorEdit == "Edit"){
			acti.VerifyActivityAreaList("Edit");
		}
			}
		
		@Step
		public void clickOnJMESA() throws Exception{
			acti.clickOnJMESA(1);
		}
		
		@Step
		public void clickAddReturnToHomePage() throws Exception{
			acti.clickADDActivityAreaSIDETAB();
			waitABit(2000);
			acti.returnToHomePage();
			System.out.println("click Add Return To HomePage Successful !!");
		}
		
		@Step
		public void clickEditReturnToHomePage() throws Exception{
			acti.clickEDITButton();
			waitABit(2000);
			acti.returnToHomePage();
			System.out.println("click Edit Return To HomePage Successful !!");
		}
		
		@Step
		public void clickViewReturnToHomePage() throws Exception{
			acti.clickVIEWButton();
			waitABit(2000);
			acti.returnToHomePage();
			System.out.println("click View Return To HomePage Successful !!");
		}
}
