public interface Conta {

    public void extrato();
    public void depositar(double valor);
    public void saque(double valor);
    public void sacar(double valor);
    public double simulaEmpréstimo(double cf, int n);
}
