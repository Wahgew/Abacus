import java.awt.Font;
import javax.swing.*;
public class SwingAlignment {
    public SwingAlignment() {
        JFrame frame = new JFrame("Label Demo");
        JLabel label;
        label = new JLabel("Right aligned!", JLabel.CENTER);
        label.setFont(new Font("Monospace", Font.PLAIN, 13));
        frame.add(label);
        frame.setSize(500,300);
        frame.setVisible(true);
    }

}
