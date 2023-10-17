package ch04;

import java.util.Arrays;

public class ReadArray {

    public static void main(String[] args) {
        int[] array = new int[] {3, 4, 5, 6, 7};

        //출력하기 1.
        System.out.print(array[0]+" ");
        System.out.print(array[1]+" ");
        System.out.print(array[2]+" ");
        System.out.print(array[3]+" ");
        System.out.print(array[4]+" ");
        System.out.println();

        //출력하기 2. for문을 써서 출력
        //for문을 쓸 때 배열의 길이 바뀌면 최대 길이값을 일일이 수정해야하니 좋지 않은 코드가 됨.
        //따라서 .length를 사용할 필요가 있다.
        for(int i = 0; i<array.length; i++)
            System.out.print(array[i]+" ");
        System.out.println();

        //출력하기 3. each-for문을 활용하기(int k가 국룰!!!)
        for(int k: array) //3, 4, 5, 6, 7이 하나씩 빠져나옴, 부분적으로 출력할 수는 없음
            System.out.print(k +" ");
        System.out.println();

        //출력하기 4.
        System.out.println(Arrays.toString(array)); //제일 깔끔한 방법
    }
}
