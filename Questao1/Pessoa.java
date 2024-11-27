package atividadefinal;

public abstract class Pessoa {
    private String cpf;
    private String nome;
    private Integer idade;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void incrementarIdade(Integer incremento){
        this.idade += incremento;
    }

    public void fazerAniversario(){
        System.out.println("A idade de " + this.getNome() +
                " antes de fazer aniversário era " + this.getIdade());
        System.out.println("Parabéns, " + this.nome + ", pelo seu aniversário! \uD83C\uDF82 \uD83C\uDF89 \uD83E\uDD73");
        this.incrementarIdade(1);
        System.out.println("A idade de " + this.getNome() +
                " após de fazer aniversário é " + this.getIdade());
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "cpf='" + this.getCpf() + '\'' +
                ", nome='" + this.getNome() + '\'' +
                ", idade=" + this.getIdade() +
                '}';
    }
}
