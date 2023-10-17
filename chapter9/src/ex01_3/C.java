package ex01_3;

import ex01_1.A;

public class C {
    public void print(){
        A a = new A();
        System.out.print(a.a + " ");
        //아하! 다른 클래스에서는 protected, defalut, private 모두 사용 불가능!
//      System.out.print(a.b + " ");
//      System.out.print(a.c + " ");
//      System.out.print(a.d + " ");
        System.out.println();
    }


}
