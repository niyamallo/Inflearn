package final1;

public class Member {

    private final String ID; //final 키워드 사용
    private String name;

    public Member(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    /*
    public void changeData(String ID, String name) {
        this.ID = ID; //컴파일 에러
        this.name = name;
    }
     */

    public void changeData(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("id:" + ID + ", name:" + name);
    }
}
