package POM_Package;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Create_Project {
	
	@FindBy(xpath="//div[text()='Menu']")
	public WebElement Menu;
	public void ClickOnMenu()
	{
		Menu.click();
	}
	@FindBy(xpath="//a[@id='ui-id-6']")
	public WebElement ProjectBOM;
	public void ClickOnProjectBOM()
	{
		ProjectBOM.click();
	}
	@FindBy(xpath="//a[@id='project-create-link']")
	public WebElement CreateProject;
	public void ClickOnCreateProject()
	{
		CreateProject.click();
	}
	@FindBy(xpath="//input[@id='project_no' and @class='edit editbox-medium form-control']")
	public WebElement ProjectNumber;
	public void EnterProjectNo()
	{
		ProjectNumber.clear();
		ProjectNumber.sendKeys("1895");
	}
	@FindBy(xpath="//input[@id='project_name' and @class='edit editbox-medium form-control']")
	public WebElement ProjectName;
	public void  EnterProjectName()
	{
		ProjectName.sendKeys("Automation/Project");
	}
	@FindBy(xpath="//input[@id='project-supplier_name']")
	public WebElement Customer;
	public void ClickOnCustomerBox()
	{
		Customer.click();
	}
	@FindBy(xpath="//a[text()='(SGPS) Show Group Production Services Inc.']")
	public WebElement SelectProject;
	public void ClickOnSelectProject()
	{
		SelectProject.click();
	}
	@FindBy(xpath="//select[@id='project_status']")
	public WebElement Status;;
	public void SelectStatus()
	{
		Select s1 = new Select(Status);
		s1.selectByVisibleText("active");
	}
	@FindBy(xpath="//textarea[@id='project_comments']")
	public WebElement Comments;
	public void EnterProjectComments()
	{
		Comments.sendKeys("This is project for Automation");
	}
	@FindBy(xpath="//input[@id='quotation_no']")
	public WebElement QuotationNo;
	public void EnterQuotationNo()
	{
		QuotationNo.clear();
		QuotationNo.sendKeys("845911");
	}
	@FindBy(xpath="//input[@id='project_qtn_send_date']")
	public WebElement QuotationSendDate;
	public void ClickOnQuotationSendDateBox()
	{
		QuotationSendDate.click();
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
	public WebElement SelectMonth;
	public void SelectMonthForQuotationSendDate()
	{
		Select s2 = new Select(SelectMonth);
		s2.selectByVisibleText("Oct");
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
	public WebElement SelectYear;
	public void SelectYearForQuotationSendDate()
	{
		Select s3 = new Select(SelectYear);
		s3.selectByValue("2025");
	}
	@FindBy(xpath="(//a[text()='25'])[4]")
	public WebElement Day;
	public void ClickOnDayForQuotationSendDate()
	{
		Day.click();
	}
	@FindBy(xpath="//input[@id='project_date_created']")
	public WebElement DateCreated;
	public void ClickOnDateCreatedBox()
	{
		DateCreated.click();
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
	public WebElement SelectMonth1;
	public void SelectMonthForDateCreated()
	{
		Select s4 = new Select(SelectMonth1);
		s4.selectByVisibleText("Jun");
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
	public WebElement SelectYear1;
	public void SelectYearForDateCreated()
	{
		Select s5 = new Select(SelectYear1);
		s5.selectByValue("2025");
	}
	@FindBy(xpath="(//a[text()='15'])[4]")
	public WebElement Day1;
	public void ClickOnDayForDateCreated()
	{
		Day1.click();
	}
	@FindBy(xpath="//input[@id='project_date']")
	public WebElement DateModified;
	public void ClickOnDateModifiedBox()
	{
		DateModified.click();
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
	public WebElement SelectMonth2;
	public void SelectMonthForDateModified()
	{
		Select s6 = new Select(SelectMonth2);
		s6.selectByVisibleText("Jul");
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
	public WebElement SelectYear2;
	public void SelectYearForDateModified()
	{
		Select s7 = new Select(SelectYear2);
		s7.selectByValue("2025");
	}
	@FindBy(xpath="(//a[text()='15'])[4]")
	public WebElement Day2;
	public void ClickOnDayForDateModified()
	{
		Day2.click();
	}
	@FindBy(xpath="//input[@id='project_due_date']")
	public WebElement DueDate;
	public void ClickOnDueDate()
	{
		DueDate.click();
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
	public WebElement SelectMonth3;
	public void SelectMonthForDueDate()
	{
		Select s8 = new Select(SelectMonth3);
		s8.selectByVisibleText("Aug");
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
	public WebElement SelectYear3;
	public void SelectYearForDueDate()
	{
		Select s9 = new Select(SelectYear3);
		s9.selectByValue("2025");
	}
	@FindBy(xpath="(//a[text()='15'])[4]")
	public WebElement Day3;
	public void ClickOnDayForDueDate()
	{
		Day3.click();
	}
	@FindBy(xpath="//input[@id='project_date_shipped']")
	public WebElement DateShipped;
	public void ClickOnDateShippedBox()
	{
		DateShipped.click();
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-month'])[2]")
	public WebElement SelectMonth4;
	public void SelectMonthForDateShipped()
	{
		Select s10 = new Select(SelectMonth4);
		s10.selectByVisibleText("Sep");
	}
	@FindBy(xpath="(//select[@class='ui-datepicker-year'])[2]")
	public WebElement SelectYear4;
	public void SelectYearForDateShipped()
	{
		Select s11 = new Select(SelectYear4);
		s11.selectByValue("2025");
	}
	@FindBy(xpath="(//a[text()='15'])[4]")
	public WebElement Day4;
	public void ClickOnDayForDateShipped()
	{
		Day4.click();
	}
	@FindBy(xpath="//input[@class='edit val-extra editbox-medium form-control']")
	public WebElement SalesPerson;
	public void EnterOnSalesPerson()
	{
		SalesPerson.sendKeys("Walekar Atul");
	}
	@FindBy(xpath="//button[@id='project-save-btn']")
	public WebElement SaveProject;
	public void ClickOnSaveProject()
	{
		SaveProject.click();
	}
	
//..................................................................Copy and Create Function
	
	@FindBy(xpath="//button[@id='project-copy-create-btn']")
	public WebElement CopyAndCreate;;
	public void ClickOnCopyAndCreateButton()
	{
		CopyAndCreate.click();
	}
	@FindBy(xpath="//a[text()='test for folder type bom']")
	public WebElement SelectProject1;
	public void ClickOnSelectProject1Button()
	{
		SelectProject1.click();
	}
	public void AcceptAlert(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
	@FindBy(xpath="//input[@id='project_name']")
	public WebElement ProjectName1;
	public void EnterOnProjectName1()
	{
		ProjectName1.sendKeys("1.3");           //change Cpmlsry
	}
	public void DismisAlert(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
	}
	@FindBy(xpath="//button[@id='project-save-bom-btn']")
	public WebElement SaveProject1;
	public void ClickOnSaveProject1()
	{
		SaveProject1.click();
	}
	
//.................................................................Create Project for New customer(Business Entity Field)	
	@FindBy(xpath="(//a[@class='qp-create-new'])[9]")
	public WebElement New;;
	public void ClickOnNewButton()
	{
		New.click();
	}
	@FindBy(xpath="//input[@data-field-name='name']")
	public WebElement Name;
	public void EnterNameForCNC()
	{
		Name.sendKeys("Livingstons12");                           //-----Changes Cmplsry
	}
	@FindBy(xpath="//input[@data-field-name='phone']")
	public WebElement Phone;
	public void EnterPhoneNo()
	{
		Phone.sendKeys("9356346311");
	}
	@FindBy(xpath="//textarea[@data-field-name='comments']")
	public WebElement Comments1;
	public void EnterCommensForNewCustomer()
	{
		Comments1.sendKeys("Mechanical Engineering");
	}
	@FindBy(xpath="(//input[@data-field-name='discount_segment'])[2]")
	public WebElement DiscountBox;
	public void ClikOnDiscountBox()
	{
		DiscountBox.click();
		
	}
	@FindBy(xpath="//a[text()='Vighnahar_disc_seg']")
	public WebElement Discount;
	public void SelectDiscountSegment()
	{
		Discount.click();
	}
	@FindBy(xpath="//select[@data-field-name='entity_type']")
	public WebElement EntityType;;
	public void SelectEntityTypeCNC()
	{
		Select s12 = new Select(EntityType);
	    s12.selectByVisibleText("Supplier");
		
	}
	@FindBy(xpath="//input[@data-field-name='supplier-fax']")
	public WebElement Fax;
	public void EnterFaxCNC()
	{
		Fax.sendKeys("123456");
	}
	@FindBy(xpath="//select[@id='popup-supplier-status']")
	public WebElement Status1;
	public void SelectStatusCNC()
	{
		 Select s13 = new Select(Status1);
		 s13.selectByVisibleText("Inactive");	
	}
	@FindBy(xpath="//input[@data-field-name='supplier-address']")
	public WebElement Address1;
	public void EnterOfficeAddress1CNC()
	{
		Address1.sendKeys("ABC");
	}
	@FindBy(xpath="//input[@data-field-name='supplier-address3']")
	public WebElement Address3;
	public void EnterOfficeAddress3CNC()
	{
		Address3.sendKeys("DEF");
	}
	@FindBy(xpath="//input[@data-field-name='supplier-state']")
	public WebElement State;
	public void EnterStateCNC()
	{
		State.sendKeys("Maharashtra");
	}
	@FindBy(xpath="//input[@data-field-name='supplier-zip']")
	public WebElement Zip;
	public void EnterZipCNC()
	{
		Zip.sendKeys("411039");
	}
	@FindBy(xpath="//input[@data-field-name='supplier-address2']")
	public WebElement Address2;
	public void EnterOfficeAddress2CNC()
	{
		Address2.sendKeys("IGH");
	}
	@FindBy(xpath="//input[@data-field-name='supplier-city']")
	public WebElement City;
	public void EnterCityCNC()
	{
		City.sendKeys("PUNE");
	}
	@FindBy(xpath="//input[@data-field-name='supplier-country']")
	public WebElement Country;
	public void EnterCountryCNC()
	{
		Country.sendKeys("INDIA");
	}
	@FindBy(xpath="//input[@data-field-name='supplier-url']")
	public WebElement URL;
	public void EnterURLCNC()
	{
		URL.sendKeys("www.url123456.com");  //.....................................URL change Everytime
	}
	
	@FindBy(xpath="//input[@data-field-name='supplier-shipping_address']")
	public WebElement Address4;
	public void EnterShippingAddress4CNC()
	{
		Address4.sendKeys("ABC");
	}
	@FindBy(xpath="//input[@data-field-name='supplier-shipping_address3']")
	public WebElement Address5;
	public void EnterShippingAddress5CNC()
	{
		Address5.sendKeys("DEF");
	}
	@FindBy(xpath="//input[@data-field-name='supplier-shipping_state']")
	public WebElement State1;
	public void EnterShippingStateCNC()
	{
		State1.sendKeys("Maharashtra");
	}
	@FindBy(xpath="//input[@data-field-name='supplier-shipping_zip']")
	public WebElement Zip1;
	public void EnterShippingZipCNC()
	{
		Zip1.sendKeys("411040");
	}
	@FindBy(xpath="//input[@data-field-name='supplier-shipping_address2']")
	public WebElement Address6;
	public void EnterShippingAddress6CNC()
	{
		Address6.sendKeys("IGH");
	}
	@FindBy(xpath="//input[@data-field-name='supplier-shipping_city']")
	public WebElement City1;
	public void EnterShippingCityCNC()
	{
		City1.sendKeys("Mumbai");
	}
	@FindBy(xpath="//input[@data-field-name='supplier-shipping_country']")
	public WebElement Country1;
	public void EnterShippingCountryCNC()
	{
		Country1.sendKeys("INDIA");
	}
//.................................................................Create Project for New customer(Extra Field)
	@FindBy(xpath="(//a[text()='Extra Fields'])[10]")
	public WebElement ExtraField;
	public void ClickOnExtraField()
	{
		ExtraField.click();
	}
	@FindBy(xpath="//select[@data-extra_field_name='payment_terms']")
	public WebElement PaymentTerms;
	public void SelectPaymentTermsEF()
	{
		Select s14 = new Select(PaymentTerms);
	    s14.selectByVisibleText("45 Days");
	}
	@FindBy(xpath="//input[@data-extra_field_name='mobile_no']")
	public WebElement MobileNo;
	public void EnterMobileNoEF()
	{
		MobileNo.sendKeys("9659874521");
	}
	@FindBy(xpath="//input[@data-extra_field_name='website']")
	public WebElement Website;
	public void EnterWebsiteEF()
	{
		Website.sendKeys("www.website.com");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_address']")
	public WebElement ContactPersonAddress;
	public void EnterContactPersonAddressEF()
	{
		ContactPersonAddress.sendKeys("Bhosari Pune");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_mail_address']")
	public WebElement ContactPersonMailingAddress;
	public void EnterContactPersonMailingAddressEF()
	{
		ContactPersonMailingAddress.sendKeys("abcdef");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_phone']")
	public WebElement ContactPersonPhone;
	public void EnterContactPersonPhoneEF()
	{
		ContactPersonPhone.sendKeys("9785462512");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_mobile']")
	public WebElement ContactPersonMobile;
	public void EnterContactPersonMobileEF()
	{
		ContactPersonMobile.sendKeys("7857498666");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_email']")
	public WebElement ContactPersonEmail;
	public void EnterContactPersonEmailEF()
	{
		ContactPersonEmail.sendKeys("xyz@gmail.com");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_title']")
	public WebElement ContactPersonTitle;
	public void EnterContactPersonTitleEF()
	{
		ContactPersonTitle.sendKeys("Rutamsoft");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_name2']")
	public WebElement ContactPersonName2;
	public void EnterContactPersonName2EF()
	{
		ContactPersonName2.sendKeys("Sameer");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_address2']")
	public WebElement ContactPersonAddress2;
	public void EnterContactPersonAddress2EF()
	{
		ContactPersonAddress2.sendKeys("Mumbai");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_mail_address2']")
	public WebElement ContactPersonMailAddress2;
	public void EnterContactPersonMailAddress2EF()
	{
		ContactPersonMailAddress2.sendKeys("Dighi");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_phone2']")
	public WebElement ContactPersonPhone2;
	public void EnterContactPersonPhone2EF()
	{
		ContactPersonPhone2.sendKeys("7895694521");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_mobile2']")
	public WebElement ContactPersonMobile2;
	public void EnterContactPersonMobile2EF()
	{
		ContactPersonMobile2.sendKeys("9656325689");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_email2']")
	public WebElement ContactPersonEmail2;
	public void EnterContactPersonEmail2EF()
	{
		ContactPersonEmail2.sendKeys("abcdef@gmail.com");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_title2']")
	public WebElement ContactPersonTitle2;
	public void EnterContactPersonTitle2EF()
	{
		ContactPersonTitle2.sendKeys("Rutamsoft123");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_name3']")
	public WebElement ContactPersonName3;
	public void EnterContactPersonName3EF()
	{
		ContactPersonName3.sendKeys("Anjali");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_address3']")
	public WebElement ContactPersonAddress3;
	public void EnterContactPersonAddress3EF()
	{
		ContactPersonAddress3.sendKeys("Dubai");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_mail_address3']")
	public WebElement ContactPersonMailAddress3;
	public void EnterContactPersonMailAddress3EF()
	{
		ContactPersonMailAddress3.sendKeys("abcdefghi@gmail.com");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_phone3']")
	public WebElement ContactPersonPhone3;
	public void EnterContactPersonPhone3EF()
	{
		ContactPersonPhone3.sendKeys("7548963215");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_mobile3']")
	public WebElement ContactPersonMobile3;
	public void EnterContactPersonMobile3EF()
	{
		ContactPersonMobile3.sendKeys("7456321586");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_email3']")
	public WebElement ContactPersonEmail3;
	public void EnterContactPersonEmail3EF()
	{
		ContactPersonEmail3.sendKeys("pqrst@gmail.com");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_title3']")
	public WebElement ContactPersonTitle3;
	public void EnterContactPersonTitle3EF()
	{
		ContactPersonTitle3.sendKeys("Rutamsoft123");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_name4']")
	public WebElement ContactPersonName4;
	public void EnterContactPersonName4EF()
	{
		ContactPersonName4.sendKeys("Rahul");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_address4']")
	public WebElement ContactPersonAddress4;
	public void EnterContactPersonAddress4EF()
	{
		ContactPersonAddress4.sendKeys("Nagpur");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_mail_address4']")
	public WebElement ContactPersonMailAddress4;
	public void EnterContactPersonMailAddress4EF()
	{
		ContactPersonMailAddress4.sendKeys("uvwxy@gmail.com");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_phone4']")
	public WebElement ContactPersonPhone4;
	public void EnterContactPersonPhone4EF()
	{
		ContactPersonPhone4.sendKeys("9636562145");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_mobile4']")
	public WebElement ContactPersonMobile4;
	public void EnterContactPersonMobile4EF()
	{
		ContactPersonMobile4.sendKeys("7775798422");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_email4']")
	public WebElement ContactPersonEmail4;
	public void EnterContactPersonEmail4EF()
	{
		ContactPersonEmail4.sendKeys("ijkl@gmail.com");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_title4']")
	public WebElement ContactPersonTitle4;
	public void EnterContactPersonTitle4EF()
	{
		ContactPersonTitle4.sendKeys("Rutamsoft567");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_name5']")
	public WebElement ContactPersonName5;
	public void EnterContactPersonName5EF()
	{
		ContactPersonName5.sendKeys("Ajinkya");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_address5']")
	public WebElement ContactPersonAddress5;
	public void EnterContactPersonAddress5EF()
	{
		ContactPersonAddress5.sendKeys("New Delhi");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_mail_address5']")
	public WebElement ContactPersonMailAddress5;
	public void EnterContactPersonMailAddress5EF()
	{
		ContactPersonMailAddress5.sendKeys("abc5@gmail.com");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_phone5']")
	public WebElement ContactPersonPhone5;
	public void EnterContactPersonPhone5EF()
	{
		ContactPersonPhone5.sendKeys("8687954215");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_mobile5']")
	public WebElement ContactPersonMobile5;
	public void EnterContactPersonMobile5EF()
	{
		ContactPersonMobile5.sendKeys("7485961236");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_email5']")
	public WebElement ContactPersonEmail5;
	public void EnterContactPersonEmail5EF()
	{
		ContactPersonEmail5.sendKeys("atul5@gmail.com");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_title5']")
	public WebElement ContactPersonTitle5;
	public void EnterContactPersonTitle5EF()
	{
		ContactPersonTitle5.sendKeys("Rutamsoft8910");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_name6']")
	public WebElement ContactPersonName6;
	public void EnterContactPersonName6EF()
	{
		ContactPersonName6.sendKeys("Divyani");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_address6']")
	public WebElement ContactPersonAddress6;
	public void EnterContactPersonAddress6EF()
	{
		ContactPersonAddress6.sendKeys("Chennai");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_mail_address6']")
	public WebElement ContactPersonMailAddress6;
	public void EnterContactPersonMailAddress6EF()
	{
		ContactPersonMailAddress6.sendKeys("abc6@gmail.com");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_phone6']")
	public WebElement ContactPersonPhone6;
	public void EnterContactPersonPhone6EF()
	{
		ContactPersonPhone6.sendKeys("7584996542");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_mobile6']")
	public WebElement ContactPersonMobile6;
	public void EnterContactPersonMobile6EF()
	{
		ContactPersonMobile6.sendKeys("9656856985");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_email6']")
	public WebElement ContactPersonEmail6;
	public void EnterContactPersonEmail6EF()
	{
		ContactPersonEmail6.sendKeys("atul6@gmail.com");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_title6']")
	public WebElement ContactPersonTitle6;
	public void EnterContactPersonTitle6EF()
	{
		ContactPersonTitle6.sendKeys("Rutamsoft987");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_name7']")
	public WebElement ContactPersonName7;
	public void EnterContactPersonName7EF()
	{
		ContactPersonName7.sendKeys("Rutamsoft987");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_address7']")
	public WebElement ContactPersonAddress7;
	public void EnterContactPersonAddress7EF()
	{
		ContactPersonAddress7.sendKeys("Banglore");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_mail_address7']")
	public WebElement ContactPersonMailAddress7;
	public void EnterContactPersonMailAddress7EF()
	{
		ContactPersonMailAddress7.sendKeys("atul7@gmail.com");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_phone7']")
	public WebElement ContactPersonPhone7;
	public void EnterContactPersonPhone7EF()
	{
		ContactPersonPhone7.sendKeys("7458963215");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_mobile7']")
	public WebElement ContactPersonMobile7;
	public void EnterContactPersonMobile7EF()
	{
		ContactPersonMobile7.sendKeys("9145223659");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_email7']")
	public WebElement ContactPersonEmail7;
	public void EnterContactPersonEmail7EF()
	{
		ContactPersonEmail7.sendKeys("atul7@gmail.com");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_title7']")
	public WebElement ContactPersonTitle7;
	public void EnterContactPersonTitle7EF()
	{
		ContactPersonTitle7.sendKeys("Rutamsoft654");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_name8']")
	public WebElement ContactPersonName8;
	public void EnterContactPersonName8EF()
	{
		ContactPersonName8.sendKeys("Mansi");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_address8']")
	public WebElement ContactPersonAddress8;
	public void EnterContactPersonAddress8EF()
	{
		ContactPersonAddress8.sendKeys("Nashik");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_mail_address8']")
	public WebElement ContactPersonMailAddress8;
	public void EnterContactPersonMailAddress8EF()
	{
		ContactPersonMailAddress8.sendKeys("atul8@gmail.com");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_phone8']")
	public WebElement ContactPersonPhone8;
	public void EnterContactPersonPhone8EF()
	{
		ContactPersonPhone8.sendKeys("9695847458");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_mobile8']")
	public WebElement ContactPersonMobile8;
	public void EnterContactPersonMobile8EF()
	{
		ContactPersonMobile8.sendKeys("9325641253");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_email8']")
	public WebElement ContactPersonEmail8;
	public void EnterContactPersonEmail8EF()
	{
		ContactPersonEmail8.sendKeys("atul8@gmail.com");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_title8']")
	public WebElement ContactPersonTitle8;
	public void EnterContactPersonTitle8EF()
	{
		ContactPersonTitle8.sendKeys("Rutamsoft321");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_name9']")
	public WebElement ContactPersonName9;
	public void EnterContactPersonName9EF()
	{
		ContactPersonName9.sendKeys("Kedar");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_address9']")
	public WebElement ContactPersonAddress9;
	public void EnterContactPersonAddress9EF()
	{
		ContactPersonAddress9.sendKeys("Aurangabad");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_mail_address9']")
	public WebElement ContactPersonMailAddress9;
	public void EnterContactPersonMailAddress9EF()
	{
		ContactPersonMailAddress9.sendKeys("atul9@gmail.com");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_phone9']")
	public WebElement ContactPersonPhone9;
	public void EnterContactPersonPhone9EF()
	{
		ContactPersonPhone9.sendKeys("9863251545");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_mobile9']")
	public WebElement ContactPersonMobile9;
	public void EnterContactPersonMobile9EF()
	{
		ContactPersonMobile9.sendKeys("9323564121");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_email9']")
	public WebElement ContactPersonEmail9;
	public void EnterContactPersonEmail9EF()
	{
		ContactPersonEmail9.sendKeys("abc9@gnail.com");
	}
	@FindBy(xpath="//input[@data-extra_field_name='contact_person_title9']")
	public WebElement ContactPersonTitle9;
	public void EnterContactPersonTitle9EF()
	{
		ContactPersonTitle9.sendKeys("Rutamsoft Technology");
	}
//..............................................................................Save, SaveAndCreateContact and Cancel Function	
	@FindBy(xpath="(//span[text()='Create New'])[2]")
	public WebElement CreateNew;
	public void ClickOnCreateNewBtnEF()
	{
		CreateNew.click();
	}
	@FindBy(xpath="//span[text()='Save and Create Contact']")
	public WebElement SaveAndCreateContact;
	public void ClickOnSaveAndCreateContactBtnEF()
	{
		SaveAndCreateContact.click();
	}
	
	@FindBy(xpath="//input[@data-field-name='contact-first_name']")
	public WebElement ContactFirstName;
	public void EnterContactFirstNameCNCF()
	{
		ContactFirstName.sendKeys("akola12");           //-----Changes Cmplsry
	}
	@FindBy(xpath="//input[@data-field-name='contact-email']")
	public WebElement ContactEmail;
	public void EnterContactEmailCNFC()
	{
		ContactEmail.sendKeys("atul012345@gmail.com");     //-----Changes Cmplsry
	}
	@FindBy(xpath="(//span[text()='Create New'])[3]")
	public WebElement CreateNew1;
	public void ClickOnCreateNew1CNCF()
	{
		CreateNew1.click();
	}
	@FindBy(xpath="(//input[@id='project_name'])[1]")
	public WebElement ProjectName2;
	public void EnterProjectName2CNFC()              //-----Changes Cmplsry
	{
		ProjectName2.sendKeys("Test43210");
	}
	@FindBy(xpath="//button[@id='project-save-btn']")
	public WebElement Save1;
	public void ClickOnSave1CNCF()
	{
		Save1.click();
	}
	@FindBy(xpath="(//span[text()='Cancel'])[17]")
	public WebElement Cancel;
	public void ClickOnCancelBtnEF()
	{
		Cancel.click();
	}

//...............................................................Create New Contact Functionality
	@FindBy(xpath="//a[@id='addnew_project_contact']")
	public WebElement CreateNewButton;
	public void ClickOnCreateNewButtonBtnCNC()
	{
		CreateNewButton.click();
	}
	@FindBy(xpath="//input[@data-field-name='contact-email']")
	public WebElement EmailCNC;
	public void EnterEmailCNC()
	{
		EmailCNC.sendKeys("atul@rutamsoft.com");         // Change Complsry
	}
	@FindBy(xpath="//input[@data-field-name='contact-department']")
	public WebElement Department;
	public void EnterDepartmentCNC()
	{
		Department.sendKeys("Sooftware Testing");
	}
	@FindBy(xpath="//input[@data-field-name='contact-office_phone']")
	public WebElement OfficePhone;
	public void EnterOfficePhoneCNC()
	{
		OfficePhone.sendKeys("9656346311");
	}
	@FindBy(xpath="//input[@data-field-name='contact-mobile']")
	public WebElement Mobile;
	public void EnterMobileCNC()
	{
		Mobile.sendKeys("9356346311");
	}
	@FindBy(xpath="//select[@data-field-name='contact-status']")
	public WebElement Status2;
	public void SelectStatusCNC1()
	{  Select s15 = new Select(Status2);
       s15.selectByVisibleText("Inactive");
	}
	@FindBy(xpath="//input[@data-field-name='contact-first_name']")
	public WebElement FirstName;
	public void EnterFirstNameCNC()
	{
		FirstName.sendKeys("Atul");
	}
	@FindBy(xpath="//input[@data-field-name='contact-last_name']")
	public WebElement LastName;
	public void EnterLastNameCNC()
	{
		LastName.sendKeys("Walekar");
	}
	@FindBy(xpath="//input[@data-field-name='contact-title']")
	public WebElement Designation;
	public void EnterDesignationCNC()
	{
		Designation.sendKeys("Automation Engineer");
	}
	@FindBy(xpath="//input[@data-field-name='contact-phone']")
	public WebElement PrimaryPhone;
	public void EnterPrimaryPhoneCNC()
	{
		PrimaryPhone.sendKeys("9689823654");
	}
	@FindBy(xpath="//input[@data-field-name='contact-fax']")
	public WebElement Fax1;
	public void EnterFax1CNC()
	{
		Fax1.sendKeys("987654321");
	}
	@FindBy(xpath="//textarea[@data-field-name='contact-comments']")
	public WebElement Comments2;
	public void EnterCommentsCNC()
	{
		Comments2.sendKeys("Create New Contacts");
	}
//...............................................................Create New Contact Extra Field Functionality
	@FindBy(xpath="(//a[text()='Extra Fields'])[11]")
	public WebElement ExtraField2;
	public void EnterExtraField2CNCEF()
	{
		ExtraField2.click();
	}
	@FindBy(xpath="//input[@data-extra_field_name='street']")
	public WebElement StreetCNCEF;
	public void EnterStreetCNCEF()
	{
		StreetCNCEF.sendKeys("MG Street, Pune");
	}
	
	@FindBy(xpath="(//input[@data-extra_field_name='city'])[2]")
	public WebElement CityCNCEF;
	public void EnterCityCNCEF()
	{
		CityCNCEF.sendKeys("Pune");
	}
	@FindBy(xpath="//input[@data-extra_field_name='state_province']")
	public WebElement StateProvince;
	public void EnterStateProvinceCNCEF()
	{
		StateProvince.sendKeys("Maharashtra");
	}
	@FindBy(xpath="//input[@data-extra_field_name='zip_postalcode']")
	public WebElement PostalCode;
	public void EnterPostalCodeCNCEF()
	{
		PostalCode.sendKeys("411039");
	}
	@FindBy(xpath="(//input[@data-extra_field_name='country'])[2]")
	public WebElement CuntryCNCEF;
	public void EnterCuntryCNCEF()
	{
		CuntryCNCEF.sendKeys("INDIA");
	}
	@FindBy(xpath="//input[@data-extra_field_name='mailing_street']")
	public WebElement maillingstreet;
	public void EntermaillingstreetCNCEF()
	{
		maillingstreet.sendKeys("12 Laxmi Nagar Street");
	}
	@FindBy(xpath="//input[@data-extra_field_name='mailing_city']")
	public WebElement maillingcity;
	public void EntermaillingcityCNCEF()
	{
		maillingcity.sendKeys("Bhosari");
	}
	@FindBy(xpath="//input[@data-extra_field_name='mailing_state_province']")
	public WebElement MaillingStateProvince;
	public void EnterMaillingStateProvinceCNCEF()
	{
		MaillingStateProvince.sendKeys("Maharashtra");
	}
	@FindBy(xpath="//input[@data-extra_field_name='mailing_zip_postalcode']")
	public WebElement MaillingPostalCode;
	public void EnterMaillingPostalCodeCNCEF()
	{
		MaillingPostalCode.sendKeys("411045");
	}
	@FindBy(xpath="//input[@data-extra_field_name='mailing_country']")
	public WebElement MaillingCountry;
	public void EnterMaillingCountryCNCEF()
	{
		MaillingCountry.sendKeys("INDIA");
	}
	@FindBy(xpath="(//span[text()='Create New'])[3]")
	public WebElement CreateNewEF;
	public void ClickOnCreateNewCNCEF()
	{
		CreateNewEF.click();
	}
	@FindBy(xpath="(//span[text()='Cancel'])[18]")
	public WebElement CancelEF;
	public void ClickOnCancelEFCNCEF()
	{
		CancelEF.click();
	}
	
	
	public Create_Project(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
