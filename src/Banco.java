import java.util.ArrayList;

import java.util.List;
public class Banco {

    public static void main(String[] args) {
        ArrayList<Correntista> listaDeClientes = new ArrayList<Correntista>();

        CorrentistaFisico c1 = new CorrentistaFisico( "João da Silva", new ContaFisica( 1000.0 ));
        listaDeClientes.add(c1);
        CorrentistaFisico c2 = new CorrentistaFisico( "Maria Oliveira", new ContaFisica ( 1500.0 ));
        listaDeClientes.add(c2);
        CorrentistaFisico c3 = new CorrentistaFisico( "Carlos Souza", new ContaFisica( 2000.0 ));
        listaDeClientes.add(c3);
        CorrentistaFisico c4 = new CorrentistaFisico( "Ana Santos", new ContaFisica( 2500.0 ));
        listaDeClientes.add(c4);

        CorrentistaJuridico cJuridico = new CorrentistaJuridico("Empresa XYZ", "Pedro Almeida", new ContaJuridica( 5000.0 ));
        listaDeClientes.add(cJuridico);

        c1.exibeIdentificacao();
        c2.exibeIdentificacao();
        c3.exibeIdentificacao();
        c4.exibeIdentificacao();
        cJuridico.exibeIdentificacao();
    }


}
