package Hw6_ObjectContainers;

public class Persoana {
    private int age;
    private String name;


    public Persoana(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
