package atividadefinal;

import java.util.ArrayList;

public class Turma {

    private String codigo;
    private Disciplina disciplina;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Turma() {
        this.alunos = new ArrayList<Aluno>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public void listarAlunos() {
        System.out.println("Listando alunos da turma " + this.getCodigo());
        for (Aluno aluno : this.getAlunos()) {
            System.out.println("\t" + aluno);
        }
    }

    @Override
    public String toString() {
        String retorno = "Turma cód." + this.getCodigo() + ":\n" +
                "\t disciplina=" + this.getDisciplina() + "\n" +
                "\t professor=" + this.getProfessor() + "\n" +
                "\t alunos=";

        for (Aluno aluno : alunos) {
            retorno = retorno.concat("\n\t\t" + aluno.toString());
        }

        retorno = retorno.concat("}\n");

        return retorno;

    }
}
