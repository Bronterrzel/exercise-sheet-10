package de.unistuttgart.iste.rss.pse.exercise10.override;

public class OverloadedUsageTest {

    public static void main(final String[] args) {
        // Create an entity paule and willi of type Hamster and Dog and reference a new hamster and dog respectively
        
        // Call this class' static print animal info and pass paule and willi
        
        // Create entities animal1 and animal2 of type Animal and let them reference paule and willi
        // Call this class' static print animal info and pass each of the animal entities
    }
    
    private static void printAnimalInfo(final Animal animal) {
        System.out.format("My type is Animal\n");
        System.out.format("My name is %s\n", animal.getAnimalName());        
    }

    private static void printAnimalInfo(final Hamster aHamster) {
        System.out.format("My type is Hamster\n");
        System.out.format("My name is %s\n", aHamster.getAnimalName());        
    }

    private static void printAnimalInfo(final Dog aDog) {
        System.out.format("My type is Dog\n");
        System.out.format("My name is %s\n", aDog.getAnimalName());        
    }
}
