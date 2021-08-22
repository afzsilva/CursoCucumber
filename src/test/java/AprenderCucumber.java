import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class AprenderCucumber {

	@Given("^que criei o arquivo corretamente$")
	public void queCrieiOArquivoCorretamente() throws Throwable {
		System.out.println("Faça alguma coisa");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^executá-lo$")
	public void executáLo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^a especificação deve finalizar com sucesso$")
	public void aEspecificaçãoDeveFinalizarComSucesso() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	
	
	int contador = 0;
	@Dado("^que o valor do contador é (\\d+)$")
	public void queOValorDoContadorÉ(int arg1) throws Throwable {	    
	    this.contador = arg1;
	}

	@Quando("^quando eu incrementar em (\\d+)$")
	public void quandoEuIncrementarEm(int arg1) throws Throwable {
	    this.contador = contador + arg1;
	}

	@Então("^o valor do contador é (\\d+)$")
	public void oValorDoContadorÉ(int arg1) throws Throwable {	    
		//this.contador = arg1;
//		System.out.println(arg1);
//		System.out.println(contador);
//		System.out.println(contador == arg1);
		Assert.assertTrue(contador == arg1);
		//throw new RuntimeException();
		
	}
	
}
