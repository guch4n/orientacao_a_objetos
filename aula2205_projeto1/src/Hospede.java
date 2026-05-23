public class Hospede {
    private String nome, cpf, telefone;

    public Hospede(String n, String c, String t){
        this.nome = n;
        this.cpf = c;
        this.telefone = t;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getTelefone(){
        return this.telefone;
    }
}
