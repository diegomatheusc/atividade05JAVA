package atividade;

import java.util.ArrayList;

public class professor extends humano {
	
	
	private int total_cursos;
	private ArrayList<String> cursos = new ArrayList<String>();
	
	
	public professor(String nome, String endereco) {
		super(nome, endereco);
		
	}
	
	public ArrayList<String> list_cursos() {
		return this.total_cursos;
	}
	
	
	public boolean adicionar_curso (String curso) {
		
		if(adicionar_curso) {			
			numCursos++;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean delete_curso (String curso) {
		
	  for(int i = 0; i< cursos.size(); i++) {
		  
		  if(total_curso.get(i).compareTo(total_curso.toLowerCase()) == 0) {
			  curso.remove(i);
			  return true;
		  }
	  }
	  return false;
	}
	
	public String toString() {
		
		String str = "Nome:"+this.getNome()+"Morador no local:"+this.getEndereco();
		
		for(int i =0; i < cursos.size(); i++) {
			
			str += "Curso: "+cursos.get(i)+;
		}
		return str;
				
	}

}
