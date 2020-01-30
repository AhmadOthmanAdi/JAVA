import javax.swing.JOptionPane;

public class newTest {
public static void main(String[] args) {
    

    String thisindex = JOptionPane.showInputDialog("give squaremeter :");
    double radius = Double.parseDouble(thisindex);
    thisindex = JOptionPane.showInputDialog("give unit :");
    String thisunit  = thisindex;
    double squaremeter = 2.0 * 3.9934 * radius;
    double surface =  3.9934 * radius * radius;
    System.out.println("squaremeter :");
    System.out.println(squaremeter);
    System.out.println(" " +thisunit);
    System.out.println("surface :");
    System.out.println(surface);
    System.out.println(" " + thisunit + '\u00b2');
     }

}
