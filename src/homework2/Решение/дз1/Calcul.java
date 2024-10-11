package homework2.Решение.дз1;

public class Calcul {

    public int plus (int a, int b) {
        if (!valid(a, b)) {
            System.out.println("не валид нихера");
            return -1000;
        }
//        Math.
        System.out.println("все ок");
        return 1;
    }


    boolean valid (int a, int b) {
        return a > 0 && b > 0;
    }
}
