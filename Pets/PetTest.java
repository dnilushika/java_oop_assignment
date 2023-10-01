import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class PetTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] catBreeds = { "Persian", "Tabby", "Siamese", "Maine Coon", "Bengal" };
        String[] dogBreeds = { "Spaniel", "Terrier", "Labrador", "Poodle", "Bulldog" };
        Map<String, String> sounds = new HashMap<String, String>();
        sounds.put("dog", "woof");
        sounds.put("cat", "Meow");

        String[] pets = new String[5];

        for (int i = 0; i < pets.length; i++) {

            System.out.print("Do you want to add a cat or dog? (Enter c for cat and d for Dog)");
            String petType = scanner.next().toLowerCase();

            switch (petType) {
                case "c":
                    int catAge = random.nextInt(10) + 1;
                    String catBreed = catBreeds[random.nextInt(catBreeds.length)];
                    scanner.nextLine();
                    System.out.println("Enter a name for the cat: ");
                    String catName = scanner.nextLine();
                    pets[i] = new Cat(catName, catAge, sounds.get("cat"), catBreed).speak();
                    break;
                case "d":
                    int dogAge = random.nextInt(10) + 1;
                    String dogBreed = dogBreeds[random.nextInt(catBreeds.length)];
                    scanner.nextLine();
                    System.out.println("Enter a name for the dog: ");
                    String dogName = scanner.nextLine();
                    pets[i] = new Dog(dogName, dogAge, sounds.get("dog"), dogBreed).speak();
                    break;

                default:
                    System.out.println("Invalid pet type: " + petType + ". Please select correct pet type");
                    i--;
                    break;
            }

        }

        System.out.println('\n');
        // printing pets
        for (String pet : pets) {
            System.out.println(pet);
        }

    }
}
