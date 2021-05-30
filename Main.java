package atividade;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		
		ArrayList<Pessoa> alunos = new ArrayList<Pessoa>();
		
			Aluno aluno1 = new alunos("Maria", "Recife");
			aluno1.addCursoNota("Lógica de Programação", 7);
			aluno1.addCursoNota("Java", 9);
			
			Aluno aluno2 = new alunos("João", "Jaboatão dos Guararapes");
			aluno2.addCursoNota("Lógica de Programação", 10);
			aluno2.addCursoNota("Java", 9);
			aluno2.addCursoNota("Redes", 4);
			
			Aluno aluno3 = new alunos("José", " Barro");
			aluno3.addCursoNota("Lógica de Programção", 10);
			aluno3.addCursoNota("Java", 6);
			aluno3.addCursoNota("Redes", 7);
			aluno3.addCursoNota("Pascal", 5);
			alunos.add(aluno1);
			alunos.add(aluno2);
			alunos.add(aluno3);

			Professor  professor = new professor("Leandro", "Recife");
			professor01.addCurso("Lógica de Programação");
			professor01.addCurso("Java");
			
			pessoas.add(professor01);
			
			
	
			for(int i = 0; i<pessoas.size(); i++) {
				String str = pessoas.get(i).toString();
				System.out.println(str);
			}
			
			String test = pessoasData(pessoas);
			System.out.println(test);
	}
	
	private static String pessoasData(ArrayList<Pessoa> pessoas) {
		
		Professor professor = new Professor(null, null);
		Estudante estudante = new Estudante(null, null);
		String str = "";
		
			
			for(int i = 0; i< pessoas.size(); i++) {
					
				 if(professor.getClass() == pessoas.get(i).getClass()) {
					 Professor teacher = (Professor) pessoas.get(i);
					 
					 for(int y = 0; y < teacher.getCursos().size(); y++) {
						str += "Curso: "+ teacher.getCursos().get(y)+"\n";
						str += "Professor: " + teacher.getNome()+"\n";
						str += "Alunos: \n";
								
							for(int z = 0; z < pessoas.size(); z++) {
								
								if(estudante.getClass() == pessoas.get(z).getClass()) {
									Estudante student = (Estudante) pessoas.get(z);
									
									for(int x = 0; x < student.getCursos().size(); x++) {
										
										if(student.getCursos().get(x).equals(teacher.getCursos().get(y))) {
											str += student.getNome()+"\n";
										}
									}
								}
							}
							str +="------------------------- \n";
					 }
				 }
			}
			
			return str;
	}

}
