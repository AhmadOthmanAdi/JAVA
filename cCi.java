import javax.swing.JOptionPane;

public class cCi {
    public static void main(String[] args) {

        boolean mtC = true;
        boolean nmpC = false;
        int einwohnerzahl = 100000;
        int moNeyinc = 3000000;
        String usInput = JOptionPane.showInputDialog("Enter name of City : ");

        System.out.println("lets check");
        usInput = JOptionPane.showInputDialog("Count of Citizinse : ");
        int usgInput = Integer.parseInt(usInput);

        if (usgInput == einwohnerzahl) {
            JOptionPane.showMessageDialog(null, mtC + " '\n' Qualifide");
        } else {
            JOptionPane.showMessageDialog(null,  " '\n' Next step");
        }

        usInput = JOptionPane.showInputDialog("Enter Yearly money Income : ");
        int mncnt = Integer.parseInt(usInput);

        if (mncnt == moNeyinc) {
            JOptionPane.showMessageDialog(null, mtC + " '\n' Metropoles");

        }

        else {
            JOptionPane.showMessageDialog(null, nmpC + " '\n' Not Metropoles");

        }

    }

}