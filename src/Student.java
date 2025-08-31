public class Student {
    String name;
    int age;
    double height;
    boolean isStudying;

    Student(String name, int age , double height, boolean isStudying) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.isStudying = isStudying;
    }

    void eating() {
        if (isStudying) {
            System.out.println( name + " is not eating right now. ");
        }else {
            System.out.println(name + " is currently eating.");
        }
    }
}
