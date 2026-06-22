public class Banco {

    public static void main(String[] args) {

        Correntista c1 = new Correntista( "João da Silva");
        Correntista c2 = new Correntista( "Maria Oliveira");
        Correntista c3 = new Correntista( "Carlos Souza");
        Correntista c4 = new Correntista( "Ana Santos");

        System.out.println("Código: " + c1.getCodigo());
        System.out.println("Nome: " + c1.getNome());
        System.out.println("Código: " + c2.getCodigo());
        System.out.println("Nome: " + c2.getNome());
        System.out.println("Código: " + c3.getCodigo());
        System.out.println("Nome: " + c3.getNome());
        System.out.println("Código: " + c4.getCodigo());
        System.out.println("Nome: " + c4.getNome());
    }


}
