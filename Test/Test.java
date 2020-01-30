package Test;

import java.awt.*;
import javax.swing.*;

public class Test extends JFrame {
    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private static final int EXITE_ON_CLOSE = 0;

	public Test(){
        super("Hello");

        JLabel label1 = new JLabel("fun cong", JLabel.CENTER);
        JLabel label2 = new JLabel("Do iT with Java", JLabel.CENTER);
        JLabel label3 = new JLabel("icon");
        Font fonttype = new Font ("SansSerif", Font.BOLD, 24);
        label1.setFont(fonttype);
        label1.setForeground(Color.red);
        label2.setFont(fonttype);
        label2.setForeground(Color.red);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.lightGray);
        c.add(label1);
        c.add(label2);
        c.add(label3);
        setDefaultCloseOperation(EXITE_ON_CLOSE);
        setSize(300,250);
        setVisible(true);
    }
        public static void main(String[] args) {
            new Test();
        

}
}