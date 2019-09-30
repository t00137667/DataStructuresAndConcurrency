public class FactorialMain {
    public static void main(String[] args) {
        int number = Factorial.factorial(5);
        System.out.println(number);

        Factorial factor = new Factorial();

        System.out.println(factor.smallest());
    }
}
