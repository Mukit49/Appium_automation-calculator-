package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Calculate {

    public Calculate(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    @FindBy(id = "com.google.android.calculator:id/digit_7")
    WebElement btn_7;

    @FindBy(id = "com.google.android.calculator:id/digit_5")
    WebElement btn_5;

    @FindBy(id = "com.google.android.calculator:id/op_add")
    WebElement plus_btn;


    @FindBy(id = "com.google.android.calculator:id/result_preview")
    WebElement result;

    @FindBy(id = "com.google.android.calculator:id/op_sub")
    WebElement minus;

    @FindBy(id = "com.google.android.calculator:id/clr")
    WebElement clear_all;


  public String sum(){
      btn_7.click();
      plus_btn.click();
      btn_5.click();
      String res = result.getText();
      return res;

  }
  public String substruct(){
      clear_all.click();

      btn_7.click();
      minus.click();
      btn_5.click();
      String res2 = result.getText();
      return res2;

  }


}
