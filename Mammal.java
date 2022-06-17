public class Mammal {
    protected int energyLevel;

    public Mammal(int energyLevel){
        this.energyLevel = energyLevel;
    }

    public int displayEnergyLevel(){
        System.out.println("Energy Level is" + this.energyLevel);
        return this.energyLevel;
    }
}