package Ex3;

public class Ex3 {

        public static void main(String[] args) {

            LinkedQueue<Integer> Q1 = new LinkedQueue<Integer>();
            LinkedQueue<Integer> Q2 = new LinkedQueue<Integer>();

            Q1.enqueue(1);
            Q1.enqueue(2);
            Q1.enqueue(3);

            Q2.enqueue(4);
            Q2.enqueue(5);
            Q2.enqueue(6);

            //before
            System.out.println(Q1);
            System.out.println(Q2);

            Q1.concatenate(Q2);

            //after
            System.out.println(Q1);
            System.out.println(Q2);
        }
    }

