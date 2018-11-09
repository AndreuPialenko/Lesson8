public class Student {
    public String name;
    public static String university;
    public Student(String name){
        this.name = name;}
    public static void printInfo(Student student){
            System.out.println(student.name);
        }
    public void printName(){
        System.out.println(name);
    }


    public static void main(String[] args) {
        Student ivan = new Student("Ivan");
        Student igor = new Student("Igor");
        Student.university = "BSUIR"; //через точку обращаемся к переменной через имя класса

        System.out.println(ivan.name);
        System.out.println(ivan.university);//через точку обращаемся к переменной через объект класса

        System.out.println(igor.name);
        System.out.println(ivan.university);

        ivan.printName();
        Student.printInfo(ivan);
        igor.printInfo(igor);
        igor.printName();
    }
}
