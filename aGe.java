import javax.swing.JOptionPane;

//ifLoop
public class aGe {
    public static void main(String[] args) {
        int uAGE;
        String tuINPUT;

        tuINPUT = JOptionPane.showInputDialog("what do u wanna say to Kevin Dath:");

        uAGE = Integer.parseInt(tuINPUT);

        if (uAGE < 100) {
            JOptionPane.showMessageDialog(null, "i wish u a great day G imma call u to hang soon, see u soon :)");

        }

        else {
            JOptionPane.showMessageDialog(null,"welcome G!");
        }


        System.out.println("Guten Tag G");
    }

}