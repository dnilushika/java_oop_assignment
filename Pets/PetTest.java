public class PetTest {
    public static void main(String[] args) {
        Cat persian = new Cat("Kianu", 6, "Miaow", "Tabby");
        String talkingCat = persian.speak();
        System.out.println(talkingCat);

        Dog terrier = new Dog("Rex", 4, "Woof", "terrier");
        String talkingDog = terrier.speak();
        System.out.println(talkingDog);
    }
}
