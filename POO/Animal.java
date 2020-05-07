package POO;

public class Animal extends Mammal{
    private int id;
    private String name;

    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        System.out.println(super.toString());
        return "Id: "+ this.id+" | Name: " + this.name;
    }

    @Override
    public String noise() {
       return "Raugh";
    }
}
