import java.io.*;
import java.util.ArrayList;

import java.util.Collection;
import java.util.List;
public class Banco {

    private ArrayList<Correntista> listaDeClientes;

    public Banco() {
        listaDeClientes = new ArrayList<Correntista>();
    }

    public void salvaClientela() throws IOException {
        File file = new File("database.dat");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for(Correntista c : listaDeClientes) {
            oos.writeObject(c);
        }
        oos.close();
    }

    public void leClientela() throws IOException, ClassNotFoundException {
        File file = new File("database.dat");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object obj = null;
        try {
        while ((obj = ois.readObject()) != null) {
            this.listaDeClientes.add((Correntista) obj);
            }
        }
        catch (EOFException e) {
            // Fim do arquivo alcançado, não faz nada
        } finally {
            ois.close();
        }

    }

    public Collection<Correntista> getListaDeClientes() {
        return listaDeClientes;
    }

    public void setListaDeClientes(ArrayList<Correntista> c) {
        this.listaDeClientes =  new ArrayList<>(c);
    }

    public static void main(String[] args) {
        Banco banco = new Banco();

        CorrentistaFisico c1 = new CorrentistaFisico( "João da Silva", new ContaFisica( 1000.0 ));
            banco.getListaDeClientes().add(c1);
        CorrentistaFisico c2 = new CorrentistaFisico( "Maria Oliveira", new ContaFisica ( 1500.0 ));
            banco.getListaDeClientes().add(c2);

        CorrentistaFisico c3 = new CorrentistaFisico( "Carlos Souza", new ContaFisica( 2000.0 ));
            banco.getListaDeClientes().add(c3);

        CorrentistaFisico c4 = new CorrentistaFisico( "Ana Santos", new ContaFisica( 2500.0 ));
            banco.getListaDeClientes().add(c4);

        CorrentistaJuridico cJuridico = new CorrentistaJuridico("Empresa XYZ", "Pedro Almeida", new ContaJuridica( 5000.0 ));
            banco.getListaDeClientes().add(cJuridico);

            try{
                banco.salvaClientela();
            } catch (IOException e) {
                System.out.println("Erro ao salvar clientela: " + e.getMessage());
            }

            try {
                banco.leClientela();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Erro ao ler clientela: " + e.getMessage());
            }
        c1.exibeIdentificacao();
        c2.exibeIdentificacao();
        c3.exibeIdentificacao();
        c4.exibeIdentificacao();
        cJuridico.exibeIdentificacao();

       double valor = c1.getConta().simulaEmpréstimo(1000.0, 12);
       System.out.println("Valor simulado para empréstimo: R$ " + valor);
    }


}
