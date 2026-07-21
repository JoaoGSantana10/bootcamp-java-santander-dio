package Modulo02.Orientação_Objetos.Exercicio_Pet_Shop;

public class PetMachine {

    private boolean limpo = true;
    private int agua = 30;
    private int shampoo = 10;

    private Pet pet;


    public void banhoNoPet(){
        if (this.pet == null){
            System.out.println("Coloque o pet na máquina para iniciar o banho");
            return;
        }
        this.agua -= 10;
        this.shampoo -= 2;
        pet.setLimpo(true);
        System.out.println("O pet" + pet.getNome() + " está limpo");
    }
    public void addAgua(){
        if (agua == 30){
            System.out.println("A capacidade de água da máquina está no máximo");
            return;
        }

        agua += 2;

    }

    public void addShampoo(){
        if (shampoo == 10){
            System.out.println("A capacidade de shampoo da máquina está no máximo");
            return;
        }

        shampoo += 1;
    }

    public int getAgua() {
        return agua;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet(){
        return pet!= null;
    }

    public void setPet(Pet pet){
        if (!this.limpo){
            System.out.println("A máquina está suja para colocar o pet é necessário limpa-la");
            return;
        } else if (hasPet()){
            System.out.println("o pet " + this.pet.getNome() + " está na máquina nesse momento");
            return;
        }
        this.pet = pet;
        System.out.println("O pet " + pet.getNome() + " foi colocado na máquina");
    }

    public void removerPet(){
        this.limpo = this.pet.getlimpo();
        System.out.println("O pet " + this.pet.getNome() + " foi retirado da máquina");
        this.pet = null;
    }

    public void limpMaquina(){
       this.agua -= 3;
       this.shampoo -= 2;
       this.limpo = true;
       System.out.println("A máquina foi limpa");
    }
}
