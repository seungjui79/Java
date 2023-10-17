package ex06;


public class ToString {
    //외부에서 m과 n을 직접적으로 접근하지 못하도록 방어적인 코드를 작성할 필요가 있다.
    private int m;
    private int n;
    //간접적으로 메서드를 통해서 필드(데이터)에 접근하도록 코드를 짜야 안전한 코드가 된다.

    //m 필드에서 값을 가져오는 메서드
    public int getM() {
        //안전한 사용자인지 확인하는 코드
        // ...
        // ..
        return m;
    }
    //m 필드에 값을 저장하는 메서드
    public void setM(int m) { //외부에서 숫자를 줘야함
        this.m = m;
    }

    //n 필드에서 값을 가져오는 메서드
    public int getN() {
        return n;
    }

    //n 필드에 값을 저장하는 메서드 //
    public void setN(int n) {
        this.n = n;
    }


    public static void main(String[] args) {

    }
}
