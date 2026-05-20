public class Carro {
    String modelo, marca, cor;
    int ano;

    public Carro(String mo, String ma, int a, String c) {
        this.modelo = mo;
        this.marca = ma;
        this.ano = a;
        this.cor = c;
    }

    public void mostrar() {
        System.out.println(this.modelo);
        System.out.println(this.marca);
        System.out.println(this.ano);
        System.out.println(this.cor);
        System.out.println("\n");
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String novoModelo) {
        this.modelo = novoModelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String novaMarca) {
        this.marca = novaMarca;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int novoAno) {
        this.ano = novoAno;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String novaCor) {
        this.cor = novaCor;
    }

}
