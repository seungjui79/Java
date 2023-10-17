//methods->함수, function => 기능
package ch06;

import java.util.Arrays;

public class MethodsOfString {

    public static void main(String[] args) {
        //대문자를 소문자로, 소문자를 대문자로 바꿔주는 메서드

        String str1 = "Java Study";
        System.out.println(str1.toLowerCase()); //메서드가 있는 이유... String 클래스 안에 정의..?되어있어서
        System.out.println(str1.toUpperCase());

        //문자열 안에 있는 내용을 바꿔주는 메서드
        System.out.println(str1.replace("Study", "공부");

        //문자열을 잘라주는 메서드
        //(0, 5) -> 0 인덱스부터 5-1(4) 인덱스까지 잘라줌
        System.out.println(str1.substring(0, 5));

        //문자열을 구분자를 이용해서 여러개로 나누어주는 메서드(자주 쓴다!!!)
        String[] strArray ="abc/def-ghi jkl".split("/|-| ");
        System.out.println(Arrays.toString(strArray));

        //문자열의 앞 뒤로 공백을 모두 제거해주는 메서드
        System.out.println("          abc          ".trim());

        System.out.println();

        //문자열의 내용 비교
        String str2 = new String("Java");
        String str3 = new String("Java");
        String str4 = new String("java");

        //객체(방)의 주소들을 비교함. 당연히 다 다른 주소니까 false가 뜸.
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);
        System.out.println(str2 == str4);
        System.out.println();

        //객체의 주소를 비교하지말고 객체 안에 있는 내용을 비교하고 싶다면?
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str4));
        //대소문자를 무시하고 안에 있는 내용을 비교하는 메서드(Ignore
        System.out.println(str3.equalsIgnoreCase(str4));

    }
}
