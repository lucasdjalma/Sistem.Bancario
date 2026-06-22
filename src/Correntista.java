public class Correntista {

    private static int proxCodigo = 1;
    // Variável estática para gerar códigos únicos

    private int Codigo;
    private String nome;

    public Correntista(String nome) {
        this.Codigo = getProxCodigo(); // Atribui o código único e incrementa para o próximo
        this.nome = nome;

    }
    public void exibeIdentificacao() {
        System.out.println("Eu sou um correntista" + getCodigo()  + " - " + getNome());

    }

    public static int getProxCodigo() {
        return proxCodigo++;
    }

    // Getters and setters
    public int getCodigo() {
        return Codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
