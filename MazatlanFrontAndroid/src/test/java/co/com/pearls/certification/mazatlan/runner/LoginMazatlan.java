package co.com.pearls.certification.mazatlan.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "co.com.pearls.certification.mazatlan.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class LoginMazatlan {
}
