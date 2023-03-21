import javax.swing.*;

public class Restaurante {
    public static void main(String[] args) {
        Double valorTotal;

        String opcao = JOptionPane.showInputDialog("Informe o pedido: \n 1.Hamburguer \n 2. Pizza \n 3. Sair");
        if (opcao == "1") {
            Hamburguer hamburguer = new Hamburguer();
            hamburguer.nome = JOptionPane.showInputDialog("Informe o nome:");
            hamburguer.valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor:"));
            String artesanal = JOptionPane.showInputDialog("É artesanal, sim ou não? ");
            if (artesanal == "sim") {
                hamburguer.setArtesanal(true);
            } else {
                hamburguer.setArtesanal(false);
            }
            valorTotal = hamburguer.calculaValor();
        } else if (opcao == "2") {
            Pizza pizza = new Pizza();
            pizza.nome = JOptionPane.showInputDialog("Informe o nome:");
            pizza.valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor:"));
            String borda = JOptionPane.showInputDialog("Possui borda, sim ou não? ");
            if (borda == "sim") {
                pizza.setPossuiBorda(true);
            } else {
                pizza.setPossuiBorda(false);
            }
            valorTotal = pizza.calculaValor();
        } else {
            return;
        }
        JOptionPane.showMessageDialog(null, "O seu pedido ficou no valor de: " + valorTotal, "Resposta", JOptionPane.INFORMATION_MESSAGE);

    }
}
