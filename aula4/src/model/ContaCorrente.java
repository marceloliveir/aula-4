package model;

public class ContaCorrente extends Conta{
	private  double ValorTaxa;
	
	ContaCorrente (String email, double ValorTaxa) {
		super (email);
		this.ValorTaxa = ValorTaxa; 
	}
	
public String Saque (double ValorSaque) {
	if (ValorSaque +ValorTaxa <= saldo) {
		saldo =- ValorTaxa;
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
