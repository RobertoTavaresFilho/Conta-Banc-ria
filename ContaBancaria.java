package aula43.labs.exerc1;

public class ContaBancaria {

	private String nomeCliente;
	private String numConta;
	private double saldo;


	public ContaBancaria() {

	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean sacar(double quantiaASacar) {
		if ((saldo - quantiaASacar)>= 0) {

			saldo -= quantiaASacar;
			return true;
		} 
				
				return false;
			

		}

	

	public void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}

	
	public String toString() {
		return "ContaBancaria [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + "]";
	}

	
	
	
}
