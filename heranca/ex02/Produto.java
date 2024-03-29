package heranca.ex02;

public class Produto {
    protected String descricao;
    protected double valor;
    public Produto() {
        this.descricao = "sem descricao";
    }

    public Produto(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "descricao = " + descricao + "\n" + "valor = " + valor + "\n";
    }
}
