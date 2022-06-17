public class Gorilla extends Mammal{
    
    public Gorilla(int energyLevel) {
        super(energyLevel);
    }

    public void throwSomething(){
        System.out.println("Wow! The gorilla just threw something.");
        this.energyLevel -= 5;
    }

    public void eatBananas(){
        System.out.println("The gorilla must be hungry. It just ate a bananas.");
        this.energyLevel += 10;
    }
    public void climb(){
        System.out.println("Look at that! The gorilla is climbing the tree.");
        this.energyLevel -= 10;
    }
}