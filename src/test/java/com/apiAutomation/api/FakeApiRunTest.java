package com.apiAutomation.api;

import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport = "target/bdd_report/result.json/cucumber.json",
        overviewReport = true,
        outputFolder = "target")
@CucumberOptions(
        format = "pretty",
        monochrome = true,
        glue = "com.apiAutomation.api.step",
        plugin = {"html:target/bdd_report/result.html",
                "json:target/bdd_report/result.json/cucumber.json"},
        features = "src/test/resources/features"
)
public class FakeApiRunTest {

    @BeforeClass
    public static void setUp() {
        FixtureFactoryLoader.loadTemplates("com.apiAutomation.api.templates");
    }

}

