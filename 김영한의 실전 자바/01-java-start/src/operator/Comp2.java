package operator;

public class Comp2 {
    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello".equals("hello");
        boolean result2 = str1.equals("문자열1");
        boolean result3 = str1.equals(str2);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        // 객체를 파고 들면 항상 true가 안 나오기에 equals를 사용 해야 한다.
        System.out.println(str1 == str1);
    }
}
