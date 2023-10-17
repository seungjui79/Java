package ex03;


//클래스 A는 부모가 없는 것처럼 보이지만 자동으로 extends Object가 붙으면서 최상위 클래스인
//Object의 자식이 된다.
class A{
    int m = 3;
    void abc() {
        System.out.println("A클래스");
    }
    //toString은 클래스(클래스로 만든 필트를설명하는 용도로 사용한다.
    @Override
    public String toString() {
        return "안녕 나는 클래스 A야 필드 m과 메서드 abc()를 가지고 있지"; //super는 Object
    }
}

class B extends A {
    int n = 4;
    void bcd() {
        System.out.println("B클래스");
    }


    @Override
    public String toString(){
        return "안녕 나는 클래스 B야 필드 n과 메서드 bcd()를 가지고 있지";
    }
    void abc() {
        System.out.println("A클래스를 재정의함.");
    }
}

public class TypeCasting{
    public static void main(String[] args) {
        //작은 풍선만 만들고 작은 풍선을 가리키는 경우
        A aa = new A();
        //toString()은 Object 클래스로부터 상속 받은 메서드이다.
        System.out.println(aa.toString());
        System.out.println(aa.m);
        aa.abc();

        //큰 풍선과 작은 풍선을 둘 다 만들고 작은 풍선을 가리키는 경우
        A bb =new A();
        System.out.println(bb.toString());
        System.out.println(bb.m);
        bb.abc();
        //bb가 가리키는 작은 풍선 안에 n이 없기 때문에 사용 불가.
        //System.out.println(bb.n);
        //A였던 bb를 B로 다운캐스팅했다. 즉 큰 풍선을 가리키는 것으로 바꿈.
        System.out.println(((B)bb).n);
        ((B)bb).bcd();
        bb.abc();

        //큰 풍선과 작은 풍선을 둘 다 만들고 큰 풍선을 가리키는 경우
        B cc = new B();
        System.out.println(cc.m);
        System.out.println(cc.n);
        cc.abc();
        cc.bcd();
    }
}









