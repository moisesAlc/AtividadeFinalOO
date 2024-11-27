package atividadefinal;

public class Aluno extends Pessoa{
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void pagarMensalidade(){
        System.out.println("Aluno " + this.getNome() + ", com a Matrícula" +
                this.getMatricula() + ", pagou a mensalidade");
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "cpf=" + this.getCpf() + '\'' +
                ", nome='" + this.getNome() + '\'' +
                ", idade=" + this.getIdade() + '\'' +
                ", matricula='" + this.getMatricula() + '\'' +
                '}';
    }
}
