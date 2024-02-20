package variable;

public class Var8 {
    public static void main(String[] args) {
        //정수. 기본적으로 int 사용
        byte b = 127; //-128 ~ 127 파일 전송, 파일 복사 등에 사용
        short s = 32767; //-32,768 ~ 32,767 실무에서 쓸일 없다고 봐도 됨.
        int i = 2147483647; //-2,147,483,648 ~ 2,147,483,647 (약 21억)
        //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        long l = 9223372036854775807L; //끝에 L이나 l 붙여야하는데 대문자 L 권장

        //실수. 기본적으로 double 사용
        float f = 10.0f; //끝에 f 붙여야 함. 정밀도가 너무 떨어져서 실무에서 거의 안 씀.
        double d = 10.0; //float 보다 더 큰 실수 범위(더 정밀도가 높음)

        //기타
        boolean bo = true; //true, false (1byte)
        char c = 'A'; //문자 하나(1byte) 거의 안 씀. 그냥 String c = "A"를 사용
        String St = "Hello"; //문자 길이에 따라 메모리 사용량이 동적으로 변함.

    }
}
