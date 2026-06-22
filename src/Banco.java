public class Banco {

    public static void main(String[] args) {

        Correntista c = new Correntista( 1001, "João da Silva");
        System.out.println("Código: " + c.getCodigo());
        System.out.println("Nome: " + c.getNome());
    }


}
