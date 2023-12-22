import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.beans.PropertyChangeListener;
import java.util.Hashtable;

public class SliderDriverForm extends JFrame implements ChangeListener {
    private JPanel mainPanel;
    private JPanel panel1;
    private JSlider topSlider;
    private JSlider topSlider2;
    private JSlider topSlider3;
    private JSlider topSlider4;
    private JSlider topSlider5;
    private JSlider topSlider6;
    private JSlider topSlider7;
    private JSlider bottomSlider;
    private JSlider bottomSlider2;
    private JSlider bottomSlider3;
    private JSlider bottomSlider4;
    private JSlider bottomSlider5;
    private JSlider bottomSlider6;
    private JSlider bottomSlider7;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label7;
    private JLabel label6;
    private JPanel centerCircle;

    public static void main(String[] args) {
        new SliderDriverForm();
    }

    public SliderDriverForm() {
        setContentPane(mainPanel);
        setTitle("Abacus");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700,500);
        setLocationRelativeTo(null);
        setVisible(true);

        //Custom side labels
        Hashtable<Integer,JComponent> sideLables = new Hashtable<>();
        sideLables.put(0, new JLabel("0"));
        sideLables.put(1, new JLabel("5"));
        topSlider.setLabelTable(sideLables);
        topSlider2.setLabelTable(sideLables);
        topSlider3.setLabelTable(sideLables);
        topSlider4.setLabelTable(sideLables);
        topSlider5.setLabelTable(sideLables);
        topSlider6.setLabelTable(sideLables);
        topSlider7.setLabelTable(sideLables);

        //Slider Change Listeners
        topSlider.addChangeListener(this);
        topSlider2.addChangeListener(this);
        topSlider3.addChangeListener(this);
        topSlider4.addChangeListener(this);
        topSlider5.addChangeListener(this);
        topSlider6.addChangeListener(this);
        topSlider7.addChangeListener(this);
        bottomSlider.addChangeListener(this);
        bottomSlider2.addChangeListener(this);
        bottomSlider3.addChangeListener(this);
        bottomSlider4.addChangeListener(this);
        bottomSlider5.addChangeListener(this);
        bottomSlider6.addChangeListener(this);
        bottomSlider7.addChangeListener(this);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        int ts = topSlider.getValue() * 5;
        int bs = bottomSlider.getValue();
        label1.setText(String.valueOf(ts + bs));

        int ts2 = topSlider2.getValue() * 5;
        int bs2 = bottomSlider2.getValue();
        label2.setText(String.valueOf(ts2 + bs2));

        int ts3 = topSlider3.getValue() * 5;
        int bs3 = bottomSlider3.getValue();
        label3.setText(String.valueOf(ts3 + bs3));

        int ts4 = topSlider4.getValue() * 5;
        int bs4 = bottomSlider4.getValue();
        label4.setText(String.valueOf(ts4 + bs4));

        int ts5 = topSlider5.getValue() * 5;
        int bs5 = bottomSlider5.getValue();
        label5.setText(String.valueOf(ts5 + bs5));

        int ts6 = topSlider6.getValue() * 5;
        int bs6 = bottomSlider6.getValue();
        label6.setText(String.valueOf(ts6 + bs6));

        int ts7 = topSlider7.getValue() * 5;
        int bs7 = bottomSlider7.getValue();
        label7.setText(String.valueOf(ts7 + bs7));
    }
}
