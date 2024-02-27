package model;

public class ContaPoupanca extends Conta {
	private static final double Valor = 0;
	private double rendimento;
	ContaPoupanca(String email, double rendimento) {
		super(email);
		this.rendimento = rendimento;
	}
	public String Saque (double ValorSaque) {
		if (ValorSaque +Valor<= saldo) {
			saldo =- Valor;
			saldo =- ValorSaque;
			return (
					"Valor sacado" + ValorSaque
					+"\nValor saldo Após o saque; "
					+ saldo
		    );
		} else {
			return "Saldo insuficiente";
		}
	}
	    public String Deposito(double ValorDeposito) {
	    	saldo += ValorDeposito;
	    	return ("Valor Sacado;" + ValorDeposito
	    			+"\nValor Saldo Após o Saque; "
	    			+ saldo);
	    }
	    public double getsaldo() {
	    	return saldo;
	    }
	}




