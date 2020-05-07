package POO;

class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(1, "Cachorro");
        System.out.println(animal.toString());
        System.out.println(animal.hashCode());
    }
}
