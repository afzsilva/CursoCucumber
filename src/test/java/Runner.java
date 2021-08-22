import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = "pretty", //// Melhor exibição das mensagens do console
		monochrome = true, // Melhor exibição das mensagens do console
		snippets = SnippetType.CAMELCASE, //Define os passos em camel case 
		dryRun = false, //
		strict = false
		)
public class Runner {

}
