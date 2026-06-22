public class Correntista {

    private static int proxCodigo = 1;
    // Variável estática para gerar códigos únicos

    private int Codigo;
    private String nome;

    public Correntista(String nome) {
        this.nome = nome;
        this.Codigo = proxCodigo;
        proxCodigo++;

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
