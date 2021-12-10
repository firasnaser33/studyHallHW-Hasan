package SmartBear.Steps_Definitions;

import SmartBear.Util.ConfigurationsReader;
import SmartBear.Util.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(Scenario scenario){
        Driver.getDriver().get(ConfigurationsReader.getProperty("url"));
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    @After
    public void closing(){

        //Driver.closeDriver();

    }
}
