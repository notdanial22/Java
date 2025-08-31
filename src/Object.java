public class Object {
    public static  void main(String[] args){
        Student student =  new Student("Danial", 21 , 5.11 ,
                true);
//        student.isStudying = true;

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.height);
        System.out.println(student.isStudying);

        student.eating();
    }
}
