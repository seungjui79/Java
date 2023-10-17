package ex01_2;

import ex01_1.A;
import ex01_1.B;
import ex01_3.C;
import ex01_3.D;

// 실제 개발할 때는 protected와 defalut는 잘 사용하지 않고
// private와 public은 자주 사용한다.

public class AccessModifierOfMember {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        a.print();
        b.print();
        c.print();
        d.print();

    }
}
