import javax.swing.JOptionPane;

//List of vokal letters 
public class tRain {
    public static void main(String[] args) {

        String tuINPUT;
        boolean istVOKAL;
        char uiletter;

        tuINPUT = JOptionPane.showInputDialog("check letter");

        uiletter = tuINPUT.charAt(3);
        if (uiletter== 'U') {
            istVOKAL = true;
        }

        else {
            if (uiletter == 'O') {
                istVOKAL = true;

            } else {
                if (uiletter == 'A') {
                    istVOKAL = true;

                } else {
                    istVOKAL = false;
                }
            }
        }

        if (istVOKAL == true) {

            JOptionPane.showMessageDialog(null, uiletter + "Is Vokal");
        }

        else {

            JOptionPane.showMessageDialog(null, uiletter + "Is Not Vokal");

        }
    }

}