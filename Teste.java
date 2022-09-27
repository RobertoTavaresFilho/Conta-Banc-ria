package aula43.labs.exerc1;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		ContaBancaria contaSimples = new ContaBancaria();
		System.out.println("--------Conta Simples-------------");
		contaSimples.setNomeCliente("roberto tavares");
		contaSimples.setNumConta("11111");
		contaSimples.setSaldo(100);
		
		System.out.println(contaSimples);
		
		realizarSaque(contaSimples, 50);
		realizarSaque(contaSimples, 70);

		ContaPoupanca contaPoupanca = new ContaPoupanca();
		System.out.println("--------Conta poupança-------------");
		contaPoupanca.setNomeCliente("roberto tavares poupança");
		contaPoupanca.setNumConta("22222");
		contaPoupanca.setSaldo(100);
		contaPoupanca.setDiaRendimento(26);
		System.out.println(contaPoupanca);
		
		realizarSaque(contaPoupanca, 50);
		realizarSaque(contaPoupanca, 70);
					
		if(contaPoupanca.calcularNovoSalvo(0.5)) {
			System.out.println("rendimento aplicado, Novo saldo é de = "+ contaPoupanca.getSaldo());
		}else {
			System.out.println("Hoje não é dia de rendimento, Novo saldo não calculado.");
		}
		
		ContaEspecial contaEspecial = new ContaEspecial();
		System.out.println("--------Conta Especial -------------");
		contaEspecial.setNomeCliente("roberto tavares especial");
		contaEspecial.setNumConta("33333");
		contaEspecial.setSaldo(100);
		contaEspecial.setLimite(200);
		
		System.out.println(contaEspecial);
		
		realizarSaque(contaEspecial, 50);
		realizarSaque(contaEspecial, 70);
		
	}
	
	public static void realizarSaque(ContaBancaria conta, double valor){
		if (conta.sacar(valor)) {
			System.out.println("saque efetuado com sucess,novo saldo é = "+conta.getSaldo());
		}else {
			System.out.println("saldo insuficente para saque de = "+ valor + " O saldo é = "+conta.getSaldo());
		}
	}
}
