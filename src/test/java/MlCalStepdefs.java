import com.mycompany.TestBase;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

/*public class MlCalStepdefs  extends TestBase{*/
    /*TestBase testBase;
    String total;
    @Before
    public void hooks(){
        System.out.println("before opening the page......");
    }
    @Given("I  am on MlCal web Page")
    public void iAmOnMlCalWebPage() {
        testBase.setUp();
    }

    @When("I send value to PP")
    public void iSendValueToPP() {
        mlCalHome.fillDetails("600000");
    }

    @When("I click on Calculate")
    public void iClickOnCalculate() {
        total=result.getMonthlyPayment();
        System.out.println(total);
    }

    @Then("{string} should be Greater than two thousands")
    public void shouldBeGreaterThan(String arg0) {
        String payment = arg0.replaceAll("[^a-zA-Z0-9]", "");
        double stringToDoublePayment = Double.parseDouble(payment);
        double amount = 2000.000;
        if (stringToDoublePayment < amount) {
            Assert.assertTrue(stringToDoublePayment < amount);
        } else {
            Assert.assertFalse(stringToDoublePayment < amount);
        }
    }
}*/
