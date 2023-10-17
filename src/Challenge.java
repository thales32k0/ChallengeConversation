public class C {

    public static void main(String[] args) {

        double numA = Math.pow(6 * (3 + 2), 2);
        double denA = 3 * 2;

        double numB = (1 - 5) * (2 - 7);
        double denB = 2;

        double higherA = numA / denA;
        double higherB = Math.pow(numB / denB, 2);

        double higher = Math.pow(higherA - higherB, 3);
        double bottom = Math.pow(10, 3);

        double result = higher / bottom;

        System.out.println("The result is: " + result);

    }
}
