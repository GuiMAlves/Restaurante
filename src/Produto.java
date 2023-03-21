public class Produto {
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    protected String nome;

    protected Double valor;

    public String getNome() {
        return nome;
    }
}
