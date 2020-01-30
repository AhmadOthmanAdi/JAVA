import javax.swing.JOptionPane;

//if number negative or positive
public class nNum {
    public static void main(String[] args) {

        String tuInpu = JOptionPane.showInputDialog("give your number");

        int checkif = Integer.parseInt(tuInpu);

        if (checkif < 0) {
            JOptionPane.showMessageDialog(null, "hellow");
        }

        else {
            JOptionPane.showMessageDialog(null, "number is positive");
        }

    }
}