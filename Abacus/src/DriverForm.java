import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class DriverForm implements ChangeListener {
    private JPanel panel1;
    private JSlider slider1;
    private JSlider slider2;
    private JSlider slider3;
    private JSlider slider4;
    private JLabel lable1;
    private JLabel lable2;


    public static void main(String[] args) {
        JFrame frame = new JFrame("DriverForm");
        frame.setContentPane(new DriverForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void stateChanged(ChangeEvent e) {
        lable1.setText("Amount: " + slider1.getValue());

    }

}
