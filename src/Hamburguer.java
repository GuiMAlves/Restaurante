public class Hamburguer extends Produto {
    private Boolean artesanal;

    public void setArtesanal(Boolean artesanal) {
        this.artesanal = artesanal;
    }

    public Double calculaValor() {
        if (artesanal) {
            return valor + 8.00;
        } else {
            return valor;
        }
    }
}
