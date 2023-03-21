public class Pizza extends Produto {
    private Boolean possuiBorda;

    public void setPossuiBorda(Boolean possuiBorda) {
        this.possuiBorda = possuiBorda;
    }

    public Double calculaValor() {
        if (possuiBorda) {
            return valor + 5.00;
        } else {
            return valor;
        }
    }
}
