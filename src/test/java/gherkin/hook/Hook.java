package gherkin.hook;

import driver.AppWeb;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;

import static driver.Drivers.getDriver;
import static driver.Drivers.testScenario;

public class Hook {

    @Before
    public void init(Scenario scenario) {
        AppWeb appWeb = new AppWeb();
        appWeb.setUpDriver();
        getDriver().manage().window().maximize();
        getDriver().get("https://qastoredesafio.lojaintegrada.com.br/");
        testScenario.set(scenario);
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            saveScreenshotOnFailure(scenario);
        }
        saveScreenshotOnFailure(scenario);
        getDriver().quit();
    }

    public void saveScreenshotOnFailure(Scenario scenario) {
        byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment(scenario.getName() + "_screenshot", new ByteArrayInputStream(screenshot));
    }
}
