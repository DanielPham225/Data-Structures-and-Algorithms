package Ex2;

import java.util.Stack;

public class Ex2 {

    public static void main(String[] args) {

        Stack<Integer> S = new Stack<>();
        Stack<Integer> T = new Stack<>();

        S.push(1);
        S.push(2);
        S.push(3);
        S.push(4);
        S.push(5);

        //before
        System.out.println(S);
        System.out.println(T);


        transfer(S, T);

        //after
        System.out.println(S);
        System.out.println(T);
    }

    //transfer
    public static <E> void transfer(Stack<E> S, Stack<E> T) {
        while (!S.isEmpty()) {
            T.push(S.pop());
        }
    }
}

