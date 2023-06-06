public class Task4 {
    public static void main(String[] args) {
        int length = 5;
        int width = 7;
        int perimeter = 0;
        int area = 1;
        perimeter += 2 * length;
        perimeter += 2 * width;
        area *= length;
        area *= width;
        System.out.println("PERIMETER: " + perimeter + " " + "AREA: " + area);
        int a = 2;
        int b = 3;
        int c = 5;
        perimeter = 0;
        perimeter += a;
        perimeter += b;
        perimeter += c;
        System.out.println("PERIMETER " + perimeter);
    }
}
