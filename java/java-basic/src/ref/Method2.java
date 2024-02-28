package ref;

//class1.ex.ClassStart3을 클래스를 사용해 리펙토링해보기2
public class Method2 {

    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90);
        System.out.println("student1=" + student1); //x001
        Student student2 = createStudent("학생2", 16, 80);
        System.out.println("student2=" + student2); //x002

        printStudent(student1);
        printStudent(student2);
    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        System.out.println("student=" +student); //x001 (student2만들 때는 x002)
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student; //x001
    }

    static void printStudent(Student student) {
        System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" + student.grade);
    }
}
