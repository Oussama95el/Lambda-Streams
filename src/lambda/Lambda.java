package lambda;

public class Lambda {
    public static void main(String[] args) {

                //avec la déclaration de type
                Operation addition = (int x, int y) -> x + y;

                //sans déclaration de type
                Operation soustraction = (x, y) -> x - y;

                //avec 'return' et les accolades
                Operation multiplication = (int x, int y) -> {
                    return x * y;
                };

                //sans 'return' et sans les accolades
                Operation division = (int x, int y) -> x / y;


        System.out.println("8 + 2 = " + calculer(8, 2, addition));
        System.out.println("8 - 2 = " + calculer(8, 2, soustraction));
        System.out.println("8 x 2 = " + calculer(8, 2, multiplication));
        System.out.println("8 / 2 = " + calculer(8, 2, division));


        Cat myCat = new Cat();
        printable(System.out::println);

    }

    private static int calculer(int x, int y, Operation op) {
        return op.calc(x, y);
    }
    @FunctionalInterface
    public interface Printable{
        void print(String msg);
    }

    public static void printable(Printable thing){
        thing.print("Hello");
    }
}
