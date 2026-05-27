public class Cachorro extends Animal{
    
    public Cachorro (String nomeAnimal, int idadeAnimal){
        super(nomeAnimal, idadeAnimal);
    }

    public void latir(){
        System.out.println("Au! au!");
    }
}