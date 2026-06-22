import java.io.Serializable;

public interface Conta extends Serializable {

    public void extrato();
    public void depositar(double valor);
    public void saque(double valor);
    public void sacar(double valor);
    public double simulaEmpréstimo(double cf, int n);
}
