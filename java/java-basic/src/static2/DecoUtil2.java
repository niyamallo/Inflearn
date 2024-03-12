package static2;

public class DecoUtil2 {
    
    //클래스 메서드
    public static String deco(String str) {
        String result = "*" + str + "*";
        return result;
    }
    //메서드 앞에 static을 붙여서 정적 메서드를 만들 수 있다.
    //정적 변수처럼 인스턴스 생성 없이 클래스 명을 통해서 바로 호출할 수 있다.
}
