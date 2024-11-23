package atividadefinal;

public class Professor extends Pessoa{

    private String centro;

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public void darAula(){
        System.out.println("Professor " + this.getNome() + " dando aula no centro " + this.getCentro() + " \uD83D\uDC68\u200D\uD83C\uDFEB");
    }

    @Override
    public String toString() {
        return "Professor{" +
                "cpf='" + this.getCpf() + '\'' +
                ", nome='" + this.getNome() + '\'' +
                ", idade=" + this.getIdade() + '\'' +
                "centro='" + this.getCentro() + '\'' +
                '}';
    }
}
