import java.util.ArrayList;

import java.util.List;
public class Banco {

    public static void main(String[] args) {
        ArrayList<Correntista> listaDeClientes = new ArrayList<Correntista>();

        CorrentistaFisico c1 = new CorrentistaFisico( "João da Silva");
        listaDeClientes.add(c1);
        CorrentistaFisico c2 = new CorrentistaFisico( "Maria Oliveira");
        listaDeClientes.add(c2);
        CorrentistaFisico c3 = new CorrentistaFisico( "Carlos Souza");
        listaDeClientes.add(c3);
        CorrentistaFisico c4 = new CorrentistaFisico( "Ana Santos");
        listaDeClientes.add(c4);

        CorrentistaJuridico cJuridico = new CorrentistaJuridico("Empresa XYZ", "Pedro Almeida");
        listaDeClientes.add(cJuridico);

        for (Correntista cliente : listaDeClientes) {
            System.out.println("Código: " + cliente.getCodigo());
            System.out.println("Nome: " + cliente.getNome());
        }
    }


}
