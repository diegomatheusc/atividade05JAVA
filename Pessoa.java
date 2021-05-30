package atividade;

import java.util.ArrayList;

public abstract class humano {
	
	private String nome;
	private String endereco;
	
	public  Pessoa (String nome, String local) {
		this.nome = nome;
		this.local = local;
	}

	public  String var_nome() {
		return this.var_nome;
	};

	public  String local() {
		return this.local;
	}

	public String toString() {
		String str = "Nome:"+this.var_nome()+"|Morador no local:"+this.local();
		return str;
	};
	
	public abstract ArrayList<String> cursos_list();

}
