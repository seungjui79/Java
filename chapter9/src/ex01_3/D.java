package ex01_3;

import ex01_1.A;

// D extends를 했다는 것은 A가 부모 클래스, D가 A의 자식클래스로 사용하겠다.
// D가 A의 자식이 되는 순간 A의 필드, 메서드가 D에 모두 복사가 된다.
public class D extends A {
    public void print() {
        //자식 클래스에서는 public과 더불어 protected까지 사용할 수 있다.
        System.out.print(a + " ");
        System.out.print(b + " ");
        //System.out.print(c + " ");  //c와 d는 자식클래스이지만 사용할 수 없다.
        //System.out.print(d + " ");
        System.out.println();
    }
}
