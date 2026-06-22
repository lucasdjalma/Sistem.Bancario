public class Correntista {

    private int Codigo;
    private String nome;

    public Correntista() {
        this.Codigo = 0;
        this.nome = "";
    }

    public Correntista(int Codigo, String nome) {
        this.Codigo = Codigo;
        this.nome = nome;
    }


    // Getters and setters
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
