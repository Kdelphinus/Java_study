package variable;

public class Var4 {
    public static void main(String[] args) {
        // 정수(기본 int)
        byte b = 127; // -128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647
        // long 타입은 뒤에 L을 붙여 줘야 한다.(소문자 l은 1과 혼동이 있을 수 있어 권장 안 함)
        long l = 9223372036854775807L; // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807


        // 실수(기본 double)
        // float 타입은 뒤에 f를 붙여 줘야 한다.
        float f = 10.0f;
        double d = 10.0; // float 보다 정밀도가 높다.
        
        
        /*
        실무에서 사용하는 타입은 거의 고정 되어 있다.
        - 정수: int (java는 4byte를 효율적으로 계산하도록 설계되어 있다.)
        - 실수: double (float은 정밀도가 너무 낮다.)
        - 참, 거짓: boolean (조건문에서 많이 사용 한다.)
        - 문자: String (char처럼 문자 하나를 표현할 일이 거의 없다.)
         */
    }
}
