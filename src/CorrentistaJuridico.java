public class CorrentistaJuridico {

    private static int proxCodigo = 1;
    // Variável estática para gerar códigos únicos

    private int Codigo;
    private String nome;
    private String nomeResponsavel;


    public CorrentistaJuridico(String nome, String nomeResponsavel) {
        this.nome = nome;
        this.nomeResponsavel = nomeResponsavel;
        this.Codigo = getProxCodigo();
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

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }
}
