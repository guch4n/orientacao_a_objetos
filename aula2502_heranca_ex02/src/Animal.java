public class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nomeAnimal, int idadeAnimal){
        this.nome = nomeAnimal;
        this.idade = idadeAnimal;
    }

    public void dormir(){
        System.out.println("O animal está dormindo!");
    }
}
