import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = "pretty", //// Melhor exibição das mensagens do console
		monochrome = true, // Melhor exibição das mensagens do console
		snippets = SnippetType.CAMELCASE, //Define os passos em camel case 
		dryRun = false,// false:default e true para apenas validar o mapeamento sem executar os testes 
		strict = false // uma forma de monitorar os passos default false se true ele monitora se algum metodo falta implementar
		)
public class Runner {

}
