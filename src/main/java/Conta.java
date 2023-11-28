import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Conta {
	
	/**
	 * @author Nathaly
	 * @param Este e o primeiro parametro
	 * @throws Throwable
	 */

	// Declaracao de variaveis de saldo e valor
	private int saldo;
	private int valor;
	
	// Metodo implementado de saldo -200
	@Given("um cliente especial com saldo atual de {int} reais")
	public void um_cliente_especial_com_saldo_atual_de_reais(int saldo) {
	    saldo = -200;
	    this.saldo = saldo;
	    throw new io.cucumber.java.PendingException();
	}

	// Metodo implementado de valor de saque -100
	@When("for solicitado um saque no valor de {int} reais")
	public void for_solicitado_um_saque_no_valor_de_reais(int valor) {
	    valor = -100;
	    this.valor = valor;
	    throw new io.cucumber.java.PendingException();
	}
	
	// Metodo implementado de atualizacao de valor para -300
	@Then("deve efetuar o saque e atualizar o saldo da conta para {int} reais")
	public void deve_efetuar_o_saque_e_atualizar_o_salto_da_conta_para_reais(int resultado) {
	    this.saldo = this.saldo - this.valor;
		resultado = this.saldo;
	    throw new io.cucumber.java.PendingException();
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	// Metodo implementado de valor -200
	@Given("um cliente comum com saldo atual de {int} reais")
	public void um_cliente_comum_com_saldo_atual_de_reais(int saldo) {
	    saldo = -200;
	    this.saldo = saldo;
	    throw new io.cucumber.java.PendingException();
	}
	
	// Metodo implementado de valor de saque de -200
	@When("solicitar um saque de {int} reais")
	public void solicitar_um_saque_de_reais(int valor) {
	    valor = -200;
	    this.valor = valor;
	    throw new io.cucumber.java.PendingException();
	}
	
	// Metodo implementado com mensagem indicando saldo insuficiente
	@Then("nao deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente")
	public void nao_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() {
		if(this.valor > this.saldo) {
			System.out.print("Saldo insuficiente");
		}
		else {
			this.saldo = this.saldo - valor;
		}
		throw new io.cucumber.java.PendingException();
	}

}
