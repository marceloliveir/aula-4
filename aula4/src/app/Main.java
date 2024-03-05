package app;

import model.Banco;
import model.Usuario;
import view.Mensagens;

public class Main {

	public static void main(String[] args) {
		Mensagens mensagem = new Mensagens (); 
		String Nome,CPF,Celular,Email,Senha;
		String opcao;
		int opcaonum;
		
	    mensagem.mostrarInformacao("seja bem vindo");
			
	do {
		opcao = mensagem.solicitarEntrada("Sistema Bancario"
		      +"\ndigite a opcao desejada"
		      +"\n1. Cadastrar Banco"
		      + "n2. Cadastrar Usuario"
	);
		      opcaonum = Integer.parseInt(opcao);
		    		  
		      switch(opcaonum) {
		      case 1:
		      String nomeBanco;
		      nomeBanco = mensagem
		    		   .solicitarEntrada("Digite o nome do banco");
		    		   Banco novoBanco = new Banco(nomeBanco);
		    		   mensagem.mostrarMensagemDeSucesso(
		    				   "banco Cadastrado com sucesso"
		    				  + novoBanco.getBanco()
		    				   );
		         break;
		    	 
		      
		      }
		 Nome = mensagem.solicitarEntrada("digite o seu nome");
		 CPF = mensagem.solicitarEntrada("digite o seu CPF");
		 Celular = mensagem.solicitarEntrada("digite o seu Celular");
		 Email = mensagem.solicitarEntrada("digite o seu Email");
		 Senha = mensagem.solicitarEntrada("digite a Senha");
		 Usuario usuario = new Usuario (Nome,CPF,Celular,Email,Senha);
		 mensagem.mostrarMensagemDeSucesso(usuario.getUsuario());
		 opcao = "ok";
		} while(opcao == "ok");
	}

}
		

