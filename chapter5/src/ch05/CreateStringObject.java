package ch05;

public class CreateStringObject {

    public static void main(String[] args) {
        //new~ 키워드
        //배열의 경우 배열의 실제'방'을 만드는 명령어다.
        //배열이라는 참조변수에 방의 주소가 들어감
        //이처럼 new~로 만든 실제'방'을 우리는 '객체'라고 부른다.

        //String 객체 생성 1.
        //배열을 제외하고 '제일 앞글자가 대문자로 시작하는 자료형'은 모두 참조변수 자료형이다.(우리는 '클래스'라고 부른다.)
        //new로 객체를 만들었고 그 객체의 주소가 str1에 담긴다. 왜? str1이 참조변수니까.
        //String이라는 클래스로 만든 변수는 전부 참조 변수다.
        String str1 = new String("안녕"); //방을 만드려면 무조건 new를 사용해야함, 주소를 str1에 넣음, String은 클래스
        System.out.println(str1);

        //String 객체 생성 2.
        //String 객체를 만들 때에도 배열 객체를 만들 때처럼 new 키워드를 생략가능하다.
        //다만, new 키워드가 없다고해서 객체가 안 만들어지는 것이 아니다.
        String str2 = "안녕하세요"; //new String 생략
        System.out.println(str2);

    }
}
