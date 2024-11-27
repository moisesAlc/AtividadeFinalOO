package atividadefinal;

public class Regular extends Aluno{

    @Override
    public void pagarMensalidade() {
        super.pagarMensalidade();
        System.out.println("\tAluno regular, sem desconto de bolsa aplicado.");
    }
}
