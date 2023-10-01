public class Cat extends Pet {

    private String breed;
    private String sound;

    public Cat(String name, int age, String sound, String breed) {
        super(name, age);
        this.sound = sound;
        this.breed = breed;
    }

    public String speak() {
        return this.sound + "! " + "I am " + this.getName() + ", a " + this.getAge() + " old " + this.breed;
    }

}
