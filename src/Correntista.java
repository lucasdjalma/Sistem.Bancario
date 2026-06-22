public class Correntista {

    private static int proxCodigo = 1;
    // Variável estática para gerar códigos únicos

    private int Codigo;
    private String nome;

    public static int getProxCodigo() {
        return proxCodigo++;
    }

    public Correntista(String nome) {
        this.nome = nome;
        this.Codigo = getProxCodigo();

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
