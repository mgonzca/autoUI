package co.com.taller.automatizacion.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/automatizacion.feature"},
        glue = {"co.com.taller.automatizacion.stepdefinition"},
        tags = "@ValidarPrecioCamara",
        snippets = SnippetType.CAMELCASE
)
public class Automatizacion {
}
