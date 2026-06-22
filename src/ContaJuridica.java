public class ContaJuridica implements Conta {

    private CorrentistaJuridico correntista;
    private double saldo;
    public static final double I = 0.05; // Taxa de juros

    public ContaJuridica(CorrentistaJuridico correntista) {
        this.correntista = correntista;
        this.saldo = 0.0;
    }

    public ContaJuridica(double v) {
        this.saldo = v;
    }

    @Override
    public synchronized void extrato() {
        System.out.println("Extrato da conta jurídica de " + correntista.getNome() + ":");
        System.out.println("Saldo: R$ " + saldo);
    }

    @Override
    public synchronized void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public synchronized void saque(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }
    public double simulaEmpréstimo(double cf, int n) {
        return I/(1-1/Math.pow(1+I,n))*cf;
    }

}
