package Ex1;

public class Driver {

    public static void main(String[] args) {

        PositionalList<Integer> list = new LinkedPositionalList<>();

        Position<Integer> p1 = list.addLast(1);
        Position<Integer> p2 = list.addLast(2);
        Position<Integer> p3 = list.addLast(33);


        System.out.println(indexOf(list, p1));
        System.out.println(indexOf(list, p2));
        System.out.println(indexOf(list, p3));
    }

   //indexOf
    public static <E> int indexOf(PositionalList<E> list, Position<E> p) {
        int index = 0;
        Position<E> walk = list.first();

        while (walk != null) {
            if (walk == p) {
                return index;
            }
            walk = list.after(walk);
            index++;
        }
        return -1;
    }
}
