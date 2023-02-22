public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

	for (int x=0; x<alunos.length; x++) {
		System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
    }
    for (String aluno: alunos){
        System.out.println(aluno);
    }
    int vetor[]={0,1,2,3,4,5,6,};
    for (int mostrar: vetor){
        System.out.println(mostrar);
    }
    }   
}