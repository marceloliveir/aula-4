package model;

import java.util.ArrayList;
import java.util.UUID;

public class Banco {
	private String nome_banco;
	private String certificado_autorizacao;
	private ArrayList<Usuario>usuario;
	
 public Banco(String nome) {                                                                   
		 this.nome_banco = nome;
		 this.certificado_autorizacao 
		 = UUID.randomUUID().toString();
}
   public String CriarUsuario(String nome,
    	   String Cpf,String Email,
    	   String Celular,String Senha) {
    	Usuario usuarionovo = new Usuario(nome,Cpf,Email,Celular,Senha);
    	usuario.add(usuarionovo);
    	
    	return "Usuario cadastrado com sucesso";
    	
   }
   public String getBanco() {
	   return 
 "\"nNome do banco;" + this.nome_banco
 +"\ncertificado; " + this.certificado_autorizacao 
     
   }
	   
}
