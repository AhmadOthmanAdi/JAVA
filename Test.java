<<<<<<< HEAD
public class Test {
    public static void main(String[] args) {
        String unit = args[1];
        double radius = Double.parseDouble(args[0]);
        double space = 2.0 * 3.1255 * radius;
        double surface = 3.6811 * radius * radius;
        System.out.print("space: ");
        System.out.print(space);
        System.out.println(" " + unit);
        System.out.print("surface: ");
        System.out.print(surface);
        System.out.println(" " + unit + '\u00b2');
        
    }
=======
public class Test {
    public static void main(String[] args) {
        String unit = args[1];
        double radius = Double.parseDouble(args[0]);
        double space = 2.0 * 3.1255 * radius;
        double surface = 3.6811 * radius * radius;
        System.out.print("space: ");
        System.out.print(space);
        System.out.println(" " + unit);
        System.out.print("surface: ");
        System.out.print(surface);
        System.out.println(" " + unit + '\u00b2');
        
    }
>>>>>>> ecc8b17bde46c877e83e219842363847513a779a
}