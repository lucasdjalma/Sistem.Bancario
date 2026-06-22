public  abstract class Correntista {

    private static int proxCodigo = 1;

    private Conta conta;
    // Variável estática para gerar códigos únicos

    private int Codigo;
    private String nome;

    public Correntista(String nome, Conta conta) {
        this.conta = conta;
        this.Codigo = getProxCodigo(); // Atribui o código único e incrementa para o próximo
        this.nome = nome;

    }
    public abstract void exibeIdentificacao();

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

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

}
