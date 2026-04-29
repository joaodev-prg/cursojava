package exercicio_poo;

public class programa {

    public String nome;
    public double preço;
    public int quantidade;

    public double valortotaldoestoque() {
        return preço * quantidade;

    }

    public void addproduto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerproduto(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return nome
                + ", $ "
                + String.format("%.2f", preço)
                + ", "
                + quantidade
                + " units, Total: $ "
                + String.format("%.2f", valortotaldoestoque());

    }

}
