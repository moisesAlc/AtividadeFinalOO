package atividadefinal;

public class Visitante extends Pessoa {
    @Override
    public String toString() {
        return "Visitante{" +
                "cpf='" + this.getCpf() + '\'' +
                ", nome='" + this.getNome() + '\'' +
                ", idade=" + this.getIdade() +
                '}';
    }
}
