package ch09;

//A클래스의 정의
class A {
    int m;
    int n;
    //this. 키워드를 사용하면 해당 지역변수가 아닌 필드를 가리키게 된다.
    void init(int m, int n) {  //init = 초기화 시키다.
       this.m = m;
       this.n = n;
    }
}

public class ThisKeyword {

    public static void main(String[] args) {
        A a = new A(); // A클래스의 객체 생성
        a.init(2, 3);

        System.out.println(a.m);
        System.out.println(a.n);
    }
}

