package class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1;
        student1 = new Student(); //설계도(클래스)를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라고 한다.
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;
        //student1, student2를 객체 또는 인스턴스라고 한다.

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);

        System.out.println(student1); //class1.Student@66a29884
        System.out.println(student2); //class1.Student@4769b07b
        //@ 뒷 부분이 참조값
    }
}
