public class Book extends Product implements Printable {
    public void print() {
        System.out.print("This is an implementation of Printable Interface");
    }

    private static void prinMultiple(Printable p,
            int count) {
        for (int i = 0; i < count; i++)
            p.print();
    }

}
