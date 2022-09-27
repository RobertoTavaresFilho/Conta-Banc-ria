package aula43.labs.exerc1;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {

	private int diaRendimento;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [diaRendimento=" + diaRendimento + "  "+ super.toString() +"]";
		
	}
	
	public boolean calcularNovoSalvo(double taxaRendimento) {
		Calendar hoje = Calendar.getInstance();//cmd para obter a data de hoje.
		
		if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH))/*SE O DIA DE HJ FOR IGUAL AO DIA DO RENDIMENTO */ {
			//saldo += saldo* taxaRendimento;
			this.setSaldo(this.getSaldo() + (this.getSaldo()*taxaRendimento));
			return true;
		}
		return false;
		
	}
	
	
	


	
	


	
	
	
}
