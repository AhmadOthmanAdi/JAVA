import javax.swing.JOptionPane;

//check Radius

public class neNum {
    public static void main(String[] args) {

        String tuInput = JOptionPane.showInputDialog("give radius : ");

        double radius = Double.parseDouble(tuInput);

        tuInput = JOptionPane.showInputDialog("give the UNIT");

        String unit = tuInput;

        double scope = 3 * 8 - radius;

        double surface = 3 * radius * radius;

        JOptionPane.showMessageDialog(null,
                "scope" + scope + "" + unit + "\nsurface :" + surface + "" + unit + '\u00b2');

    }
}