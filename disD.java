import javax.swing.JOptionPane;

//Discriminant D 
public class disD {
    public static void main(String[] args) {

        String disD = JOptionPane.showInputDialog("give A value");

        int fv = Integer.parseInt(disD);

        disD = JOptionPane.showInputDialog("give B value");

        int sv = Integer.parseInt(disD);
        
        disD = JOptionPane.showInputDialog("give c value");

        int tv = Integer.parseInt(disD);

        double theDis = fv + sv + tv;

        if (theDis == 0){
            JOptionPane.showMessageDialog(null,"Correct");
        }
        else {
            if (theDis < 0){
                JOptionPane.showMessageDialog(null,"Correct");
            }

            else {
                JOptionPane.showMessageDialog(null,"Not Correct");
            }
        }
        

    }
}