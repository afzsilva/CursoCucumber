import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import cucumber.api.Transform;
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
		// throw new PendingException();
	}

	@When("^executá-lo$")
	public void executáLo() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Then("^a especificação deve finalizar com sucesso$")
	public void aEspecificaçãoDeveFinalizarComSucesso() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
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
		// this.contador = arg1;
//		System.out.println(arg1);
//		System.out.println(contador);
//		System.out.println(contador == arg1);
		Assert.assertTrue(contador == arg1);
		// throw new RuntimeException();

	}

//*************************DATA

	Date entrega = new Date();

	@Dado("^que a entrega é dia (.*)")
	public void queAEntregaÉDia(@Transform(DateConverter.class) Date data) throws Throwable {
		this.entrega = data;
		//System.out.println(" >>> "+ entrega);//teste saida
	}

	@Quando("^quando a entrega atrasar em (\\d+) dias$")
	public void quandoAEntregaAtrasarEmDias(int arg1) throws Throwable {
		Calendar cal = Calendar.getInstance();// instância
		cal.setTime(entrega);// transforma de entrega em calendar
		cal.add(Calendar.DAY_OF_MONTH, arg1); // adiciona dias
		entrega = cal.getTime();

	}

	@Então("^a entrega sera efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void aEntregaSeraEfetuadaEm(String data) throws Throwable {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dataFormatada = format.format(entrega);
		Assert.assertEquals(data, dataFormatada);
	}
	
	
	@Dado("^que o prazo é dia (\\d+)/(\\d+)/(\\d+)$")
	public void queOPrazoÉDia(int dia, int mes, int ano) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, dia);
		cal.set(Calendar.MONTH, mes - 1);
		cal.set(Calendar.YEAR, ano);
		entrega = cal.getTime();
	}

	@Quando("^a entrega atrasar em (\\d+) (dia|dias|mes|meses)$")
	public void aEntregaAtrasarEmMeses(int arg1, String tempo) throws Throwable {
		Calendar cal = Calendar.getInstance();// instância
		cal.setTime(entrega);// transforma de entrega em calendar
		if(tempo.equals("dias")) {
			cal.add(Calendar.DAY_OF_MONTH, arg1);
		}
		
		if(tempo.equals("meses")) {
			cal.add(Calendar.MONTH, arg1); // adiciona dias			
		}
		
		entrega = cal.getTime();
		
	}

	@Então("^a entrega é efetuada em (\\d{2}/\\d{2}/\\d{4})$")
	public void aEntregaÉEfetuadaEm(String data) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dataFormatada = format.format(entrega);
		Assert.assertEquals(data, dataFormatada);
		
	}
	
//	******************DESAFIO******************
	

//CENARIO 1
@Dado("^que o ticket( especial)? é (A.\\d{3})$")
public void queOTicketÉAF(String tipo, String arg1) throws Throwable {
}

@Dado("^que o valor da passagem é R\\$ (.*)$")
public void queOValorDaPassagemÉR$(Double numero) throws Throwable {
	//System.out.println("Numero === "+numero);//teste saida
}

@Dado("^que o nome do passageiro é \"(.{5,20})\"$")
public void queONomeDoPassageiroÉ(String arg1) throws Throwable {
}

@Dado("^que o telefone do passageiro é (9\\d{3}-\\d{4})$")
public void queOTelefoneDoPassageiroÉ(String telefone) throws Throwable {
}

@Quando("^criar os steps$")
public void criarOsSteps() throws Throwable {
}

@Então("^o teste vai funcionar$")
public void oTesteVaiFuncionar() throws Throwable {
}


}// class
