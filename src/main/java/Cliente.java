public class Cliente {
    private double valorEmprestimo;
    private int parcelas;

    public double getValorEmprestimo() {
        return valorEmprestimo;
    }

    public void setValorEmprestimo(double valorEmprestimo) {
        this.valorEmprestimo = valorEmprestimo;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public double calcularValorParcelaEmprestimo() {
        return Banco.calcularValorParcelaEmprestimo(this.valorEmprestimo, this.parcelas);
    }
}
