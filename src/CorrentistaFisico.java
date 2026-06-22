public class CorrentistaFisico extends Correntista {


    public CorrentistaFisico(String nome) {
        super(nome);
    }

    @Override
    public void exibeIdentificacao() {
        System.out.println("Eu sou um correntista físico " + getCodigo() + " - " + getNome());
    }
}
