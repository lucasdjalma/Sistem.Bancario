public class ContaFisica implements Conta {

    private CorrentistaFisico correntista;
    private double saldo;
    private static final double I = 0.03; // Taxa de juros

    public ContaFisica(CorrentistaFisico correntista) {
        this.correntista = correntista;
        this.saldo = 0.0;
    }

    public ContaFisica(double v) {
        this.saldo = v;
    }

    @Override
    public void extrato() {
        System.out.println("Extrato da conta física de " + correntista.getNome() + ":");
        System.out.println("Saldo: R$ " + saldo);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    @Override
    public void saque(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    @Override
    public double simulaEmpréstimo(double cf, int n) {
        return I/(1-1/Math.pow(1+I,n))*cf;
    }
}
