package atividadefinal;

public class AlunoRegular extends Aluno{

    @Override
    public void pagarMensalidade() {
        super.pagarMensalidade();
        System.out.println("\tAluno regular, sem desconto de bolsa aplicado.");
    }
}
