public class CorrentistaGold {

    private static int proxCodigo = 1;
    // Variável estática para gerar códigos únicos

    private int Codigo;
    private String nome;
    private double limiteCredito;

    public CorrentistaGold(String nome, double limiteCredito) {
        this.nome = nome;
        this.limiteCredito = limiteCredito;
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

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
}
