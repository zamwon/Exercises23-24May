package PrezentacjaZadania.klasaPies;

public class Pies {

    private String name;
    private int age;

    public Pies() {
    }

    public Pies(String name) {
        this.name = name;
    }

    public Pies(int age) {
        this.name = name;
        this.age = age;
    }

    public Pies(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pies{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


