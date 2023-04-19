package people;

public abstract class People {
    public String name;
    public int age;
    public boolean gender;

    public People(String name, int are, boolean gender) {
        this.name = name;
        this.age = are;
        this.gender = gender;
    }


    public abstract void eat();
    public abstract void sleep();

}
