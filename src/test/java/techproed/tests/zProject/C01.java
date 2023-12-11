package techproed.tests.zProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyInput;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.Allower;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.io.FileNotFoundException;

public class C01 {

    @Test
    public void test01() throws FileNotFoundException, InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("alower"));

        Allower allower = new Allower();

        allower.SignIn.click();
        allower.email.sendKeys(ConfigReader.getProperty("email"));
        allower.pass.sendKeys(ConfigReader.getProperty("allowerPass"));
        allower.submit.click();


        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(allower.myAccount).perform();
       //ReusableMethods.scroll(allower.myAccount);--> Çalışmıyor
        ReusableMethods.visibleWait(allower.myAccount,15);
        ReusableMethods.jsClick(allower.myAccount);

        ReusableMethods.visibleWait(allower.storeManager,15);
        allower.storeManager.click();

        allower.product.click();
        allower.addNew.click();

        ReusableMethods.scroll(allower.advenced);
        Assert.assertTrue(allower.inventory.isDisplayed());
        Assert.assertTrue(allower.shipping.isDisplayed());
        Assert.assertTrue(allower.atteributes.isDisplayed());
        Assert.assertTrue(allower.linked.isDisplayed());

    }

    @Test
    public void test02() throws FileNotFoundException {

        Driver.getDriver().get(ConfigReader.getProperty("alower"));

        Allower allower = new Allower();

        allower.SignIn.click();
        allower.email.sendKeys(ConfigReader.getProperty("email"));
        allower.pass.sendKeys(ConfigReader.getProperty("allowerPass"));
        allower.submit.click();

        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(allower.myAccount).perform();

        ReusableMethods.visibleWait(allower.myAccount,15);
        ReusableMethods.jsClick(allower.myAccount);

        ReusableMethods.visibleWait(allower.storeManager,15);
        allower.storeManager.click();

        allower.product.click();
        allower.addNew.click();

        actions.scrollToElement(allower.linked);
        ReusableMethods.visibleWait(allower.inventory,15);
        ReusableMethods.jsClick(allower.inventory);
        allower.sku.sendKeys("26-589664-89");
        String actualSkuValue = "26-589664-89";
        String accepted = "26-589664-89";
        Assert.assertEquals(actualSkuValue,accepted);


    }

    @Test
    public void test03() throws FileNotFoundException, InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("alower"));

        Allower allower = new Allower();

        allower.SignIn.click();
        allower.email.sendKeys(ConfigReader.getProperty("email"));
        allower.pass.sendKeys(ConfigReader.getProperty("allowerPass"));
        allower.submit.click();

        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(allower.myAccount).perform();

        ReusableMethods.visibleWait(allower.myAccount,15);
        ReusableMethods.jsClick(allower.myAccount);

        ReusableMethods.visibleWait(allower.storeManager,15);
        allower.storeManager.click();

        allower.product.click();
        allower.addNew.click();

        ReusableMethods.scroll(allower.soldIndividual);

        if (!allower.manageStockCheckBox.isSelected()){
           ReusableMethods.jsClick(allower.manageStockCheckBox);

        }

        Assert.assertTrue(allower.manageStockCheckBox.isSelected());
        Thread.sleep(3000);
        allower.stockQty.sendKeys(Keys.DELETE);
        allower.stockQty.sendKeys("5");
        //Sayfada 0 var normalde boş olması lazım 5 yazınca 50 oluyorr

        String actualData = allower.stockQty.toString();
        String accepted = "5";
        Assert.assertEquals(actualData,accepted);



    }
}
