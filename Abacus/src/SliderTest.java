import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
public class SliderTest implements ChangeListener {
    private JFrame frame = new JFrame();
//    private JPanel panel = new JPanel(new GridLayout(2,2));
    private JPanel panel;
    private JLabel label;
    private JLabel label2;
    private JSlider slider;
    private JSlider miniSlider;

    private JSlider slider2;


    public SliderTest() {
        //frame = new JFrame("Abacus Slider");
        frame.setLayout(new GridLayout(2,2));
        panel = new JPanel();
        panel.setLayout(new GridLayout(2,2));
        label = new JLabel();
        label2 = new JLabel();
        miniSlider = new JSlider(0,1,0);
        slider = new JSlider(0,4,0);
        slider2 = new JSlider(0,4,0);

        slider.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        slider.setPreferredSize(new Dimension(400,250)); // actual size of the slider
        slider.setOrientation(SwingConstants.VERTICAL);

        slider2.setPreferredSize(new Dimension(400,250));
        slider2.setOrientation(SwingConstants.VERTICAL);

        miniSlider.setPreferredSize(new Dimension(75, 75));
        miniSlider.setOrientation(SwingConstants.VERTICAL);
        //slider.setBackground(Color.black);

//        slider.setPaintTicks(true);
//        slider.setMinorTickSpacing(2);
//        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(1);
        slider.setPaintLabels(true);

        slider2.setMajorTickSpacing(1);
        slider2.setPaintLabels(true);

        //label.setVerticalTextPosition(50);
        label.setFont(new Font("Monospace", Font.BOLD, 30));

        label2.setFont(new Font("Monospace", Font.BOLD, 30));
        //label.setText("Amount: " + slider.getValue());
        slider.addChangeListener(this);
        slider2.addChangeListener(this);

        frame.add(panel);
        panel.add(miniSlider);
        panel.add(slider);
        panel.add(slider2);
        panel.add(label);
        panel.add(label2);
        frame.setSize(500,500); //centered at 420, 420
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText(String.valueOf(slider.getValue()));
        label2.setText(String.valueOf(slider2.getValue()));

    }
}
