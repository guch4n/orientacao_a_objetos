public class Cliente {
    protected String nome, CPF;

    public Cliente(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCPF(){
        return this.CPF;
    }
}
