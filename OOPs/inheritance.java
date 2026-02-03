package OOPs;
class School{//parent class
    private String name;
    School(){
        name="DPS";
    }
    void printSchoolname(){
        System.out.println("School Name"+name);
    }
    void demo(){
        System.out.println("Demo by the school");
    }
}
class Student extends School{//middlelclass
    private String name;
    Student(String name){//if it lets say we have to pass paramter in the school name so we can simply write super("dps")
        this.name=name;
    }
    void printstudentname(){
        System.out.println("Student name"+name);
    }
    @Override
    void demo(){
        super.demo();
        System.out.println("demo by the student");

    }//for inheritance the access specifier the return type the function name and the number of paramteres and type of para has to be same to do inheritance
    
}

class Parent extends Student{//child class
    private String name;
    Parent(String name,String studentname){
        super(studentname);
        this.name=name;
    }
    void printparentname(){
        System.out.println("Parentname:"+ name);
    }
}
class Teacher extends School{
    private String name;
    private String subjectname;
    Teacher(String name,String subjectname){
        this.name=name;
        this.subjectname=subjectname;
    }
    void printTeacherinfo(){
        System.out.println("Name :"+name);
        System.out.println("Subject name"+subjectname);
    }
}
public class inheritance {
    public static void main(String[] args) {
        // School school=new School();
        // Student student=new Student("Kunal");
        Parent parent=new Parent("Dad","Kunal");
        Teacher teacher=new Teacher("Ram","Maths");
        parent.printstudentname();
        parent.printSchoolname();
        teacher.printTeacherinfo();
        parent.demo();

    }

    
    
}
