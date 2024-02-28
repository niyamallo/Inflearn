package ref;

//class1.ex.ClassStart3을 클래스를 사용해 리펙토링해보기
public class Method1 {

    public static void main(String[] args) {
        //class1 패키지에도 Student가 있다.
        //class1 패키지의 Student를 쓰고싶을 때는 import class1.Student; 선언하는 과정이 별도로 필요.
        //외부 패키지로부터 import된 것이 없으면 같은 패키지에 있는 ref.Student 클래스를 사용.
        Student student1 = new Student();
        initStudent(student1, "학생1", 15, 90);

        Student student2 = new Student();
        initStudent(student2, "학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }

    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student) {
        System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" + student.grade);
    }
}
