package people;

public class StudentIml1 extends People implements Student {

    public StudentIml1(String name, int are, boolean gender) {
        super(name, are, gender);
    }

    @Override
    public void eat() {
        System.out.println("ádasdada");
    }
    @Override
    public void sleep() {
        System.out.println("ko ngu duoc");
    }
    @Override
    public void registerCourse(String course) {
        System.out.println("sadasdsadsdadasdasdad");
    }

    @Override
    public void attendClass() {
        System.out.println("sdsadasda");;
    }
}
