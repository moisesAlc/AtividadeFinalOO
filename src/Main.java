import atividadefinal.*;

public class Main {
    public static void main(String[] args) {

        /* Instanciações */

        Disciplina disciplina1 = new Disciplina();
        Disciplina disciplina2 = new Disciplina();
        Disciplina disciplina3 = new Disciplina();

        // Utilizando polimorfismo
        Aluno aluno1 = new Regular();
        Aluno aluno2 = new Regular();
        Aluno aluno3 = new Bolsista();

        Professor professor = new Professor();

        Visitante visitante1 = new Visitante();
        Visitante visitante2 = new Visitante();

        Turma turma1 = new Turma();
        Turma turma2 = new Turma();
        Turma turma3 = new Turma();

        /* Configuração das Disciplinas */

        disciplina1.setCodigo("DISC_A_2024");
        disciplina1.setNome("Disciplina A");
        disciplina1.setSemestre(1.1); // deixamos double pela possibilidade de trimestres 

        disciplina2.setCodigo("DISC_B_2024");
        disciplina2.setNome("Disciplina B");
        disciplina2.setSemestre(1.1); // deixamos double pela possibilidade de trimestres

        disciplina3.setCodigo("DISC_C_2024");
        disciplina3.setNome("Disciplina C");
        disciplina3.setSemestre(1.2); // deixamos double pela possibilidade de trimestres

        /* Configuração dos Professores */

        professor.setNome("Rubens");
        professor.setCentro("MATRIZ");
        professor.setCpf("123.456.789-89");
        professor.setIdade(30);

        /* Configuração dos Alunos */

        aluno1.setMatricula("100000");
        aluno1.setNome("Alan");
        aluno1.setCpf("111.111.111-11");
        aluno1.setIdade(20);

        aluno2.setMatricula("200000");
        aluno2.setNome("Bia");
        aluno2.setCpf("222.222.222-22");
        aluno2.setIdade(30);

        aluno3.setMatricula("300000");
        aluno3.setNome("Carlos");
        aluno3.setCpf("333.333.333-33");
        aluno3.setIdade(40);

        /* Configuração dos visitantes */

        visitante1.setCpf("555.555.555-55");
        visitante1.setNome("Vivian");
        visitante1.setIdade(50);

        visitante2.setCpf("666.666.666-66");
        visitante2.setNome("Valéria");
        visitante2.setIdade(60);

        /* Configuração das Turmas */

        turma1.setCodigo(1);
        turma1.setDisciplina(disciplina1);
        turma1.setProfessor(professor);
        turma1.adicionarAluno(aluno1);
        turma1.adicionarAluno(aluno2);
        turma1.adicionarAluno(aluno3);

        turma2.setCodigo(2);
        turma2.setDisciplina(disciplina2);
        turma2.setProfessor(professor);
        turma2.adicionarAluno(aluno1);
        turma2.adicionarAluno(aluno2);
        turma2.adicionarAluno(aluno3);

        turma3.setCodigo(3);
        turma3.setDisciplina(disciplina3);
        turma3.setProfessor(professor);
        turma3.adicionarAluno(aluno1);
        turma3.adicionarAluno(aluno2);
        turma3.adicionarAluno(aluno3);

        /* Exibindo valores */

        System.out.println("\nMostrando as turmas e seus atributos...");
        System.out.println(turma1);
        System.out.println(turma2);
        System.out.println(turma3);

        System.out.println("-------------------------------------------------\n");

        /* Alguns aniversários para comemorar a vida ;) */

        System.out.println("Comemorando aniversários...");
        aluno1.fazerAniversario();

        System.out.println("\n-------------------------------------------------\n");

        /* Adicionando e retirando um aluno a mais na turma... */

        System.out.println("Verificando adição, listagem e remoção de alunos de turma...\n");

        turma1.listarAlunos();

        Regular intercambista = new Regular();
        intercambista.setMatricula("234234");
        intercambista.setNome("James Bond");
        intercambista.setCpf(null);
        intercambista.setIdade(27);
        turma1.adicionarAluno(intercambista);

        turma1.listarAlunos();

        turma1.removerAluno(intercambista);

        turma1.listarAlunos();

        System.out.println("\n-------------------------------------------------\n");

        System.out.println("Aula do professor...");
        System.out.println(professor);
        professor.darAula();

        System.out.println("\n-------------------------------------------------\n");

        System.out.println("Recebemos visitas de:\n");

        System.out.println(visitante1);

        System.out.println(visitante2);

        System.out.println("\n-------------------------------------------------\n");
    }
}
