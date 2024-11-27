package atividadefinal;

public class Bolsista extends Aluno{
    public void pagarMensalidade() {
        super.pagarMensalidade();
        System.out.println("\tComo é um aluno bolsista, vai ter o desconto devido.");
    }
}
