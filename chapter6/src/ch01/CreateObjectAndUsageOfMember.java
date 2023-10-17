package ch01;

//A라는 클래스 정의
//클래스 안에는 필드와 메서드들을 정의할 수 있다.
class A {
    int m = 3;
    void print() {
        System.out.println("객체의 생성과 활용");
    }

}



public class CreateObjectAndUsageOfMember{
    public static void main(String[] args) {
        //클래스를 활요하여 객체(실제 붕어빵 생성)
        A a = new A();

        //객체 안에 있는 m이라는 필드에 5를 저장 및 출력
        a.m = 5;
        System.out.println(a.m);

        //객체 안에 있는 print()라는 메서드를 호출
        a.print();

    }
}

