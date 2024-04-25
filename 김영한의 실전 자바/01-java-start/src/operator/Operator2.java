package operator;

public class Operator2 {
    public static void main(String[] args) {
        // 문자열에 다른 타입을 더하면 다 문자열로 변환 된다.
        String result = "Hello " + "Java";
        System.out.println(result);

        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        String result3 = "a + b = " + 10;
        System.out.println(result3);

        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);

        boolean bool = true;
        System.out.println(str + bool);
    }
}
