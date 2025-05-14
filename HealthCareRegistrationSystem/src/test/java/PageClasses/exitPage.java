package PageClasses;

import org.openqa.selenium.By;

import utilities.BaseClass;

public class exitPage extends BaseClass
{
	public static By clickOnEndVisit(){		
		return	By.xpath("//button[@class='-esm-patient-chart__visit-header__startVisitButton___ZgOSy cds--btn cds--btn--primary']");
		}
		public static By clickPopupEndVisit() {
			return By.xpath("//button[@class='cds--btn cds--btn--danger']");
		}
		public static By verifyActiveTitle() {
			return By.xpath("//span[@title='Active Visit']");
		}
		

}
