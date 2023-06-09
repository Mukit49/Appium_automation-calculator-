package testrunner;

import org.testng.Assert;
import org.testng.annotations.Test;
import screens.Calculate;
import setup.Setup;

public class CalTestRunner extends Setup {
    Calculate calscrn = new Calculate(driver);
    @Test(priority = 1)
    public void check_sum() throws InterruptedException {
        Calculate calscrn = new Calculate(driver);
        String final_result = calscrn.sum();
        Assert.assertEquals(final_result,"12");
        System.out.println("Success");
        Thread.sleep(4000);


    }
    @Test(priority = 2)
    public  void check_substruct(){
        Calculate calscrn = new Calculate(driver);
        String f_res = calscrn.substruct();
        Assert.assertEquals(f_res,"2");

    }


}
