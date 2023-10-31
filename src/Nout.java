public class Nout {
    String name;
    int age;

    public Nout(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Nout{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
