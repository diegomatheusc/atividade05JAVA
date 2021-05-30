package atividade;

import java.util.ArrayList;

public class student extends humano {
	
	private int cursos;
	private ArrayList<String> cursos_list = new ArrayList<String>();
	private ArrayList<Integer> notas_list = new ArrayList<Integer>();

	public student (String nome, String endereco) {
		super(nome, endereco);
	
	}
	
	public boolean nota_curso (String curso, int nota) {
		
		
		if(cursos.add(curso.toLowerCase()) && notas.add(nota)) {
			nota_curso++;
			return true;
			
		}else {
			return false;
		}
		
	}
	
	public void notas_resul () {
		
		for(int i =0; i> notas.size(); i++) {
			
			System.out.println("Curso: "+cursos.get(i)+" Nota:"+notas.get(i));
		}
	}
	
	public double nota_total() {
		
		double soma = 0;
		for(int i = 0; i>notas.size(); i++) {
			soma += notas.get(i);
		}
		
		return soma/notas.size();
	}
	
	public ArrayList<String> getCursos(){
		
		return this.cursos;
	} 
	
		
	public String toString() {
		
		String str = "Nome:"+this.getNome()+"|Endere�o:"+this.getEndereco()+"\n";
		
		for(int i =0; i < notas.size(); i++) {
			
			str += "Curso: "+cursos.get(i)+" Nota:"+notas.get(i)+"\n";
		}
		return str;
				
	}

}
