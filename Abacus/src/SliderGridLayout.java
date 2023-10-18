import java.awt.*;
import java.util.Hashtable;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.event.*;
import javax.swing.plaf.basic.BasicGraphicsUtils;
import javax.swing.plaf.basic.BasicSliderUI;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class SliderGridLayout implements ChangeListener {
    private JSlider miniSlider = new JSlider(0,1,0);
    private JSlider miniSlider2 = new JSlider(0,1,0);
    private JSlider slider = new JSlider(0,4,0);
    private JSlider slider2 = new JSlider(0,4,0);
    private JLabel label = new JLabel(String.valueOf(slider.getValue()), SwingConstants.CENTER);
    private JLabel label2 = new JLabel(String.valueOf(slider.getValue()), SwingConstants.CENTER);
        public SliderGridLayout() {
            UIDefaults defaults = UIManager.getDefaults();
            defaults.put("Slider.thumbHeight" , 100);
            defaults.put("Slider.thumbWidth", 100);

            JFrame frame = new JFrame("Japanese Slider Abacus (Soroban)");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500,500);
            frame.getContentPane().setBackground((new Color(164,116,73)));
            frame.setLayout(new GridLayout(3,2,-100,50));
            //.getContentPane().setBackground((new Color(164,116,73)));

//            JSlider miniSlider = new JSlider(0,1,0);
//            JSlider miniSlider2 = new JSlider(0,1,0);
//            JSlider slider = new JSlider(0,4,0);
//            JSlider slider2 = new JSlider(0,4,0);

            // Number labels the amount the slider moves
            label.setFont(new Font("Monospace", Font.BOLD, 30));
            label2.setFont(new Font("Monospace", Font.BOLD, 30));

            // Bottom sliders.
//            slider.setPreferredSize(new Dimension(100,100));
//            slider2.setPreferredSize(new Dimension(100,100));
            slider.setFont(new Font("Monospace", Font.BOLD, 15));
            slider2.setFont(new Font("Monospace", Font.BOLD, 15));

            // Bottom slider color.
            slider.setBackground(new Color(164,116,73));
            slider2.setBackground(new Color(164,116,73));
            slider.setFocusable(false);
            slider2.setFocusable(false);
            slider.setUI(sliderUI);
            //slider2.setUI(sliderUI);

            // Top sliders.
            miniSlider.setPreferredSize(new Dimension(50,50));
            miniSlider2.setPreferredSize(new Dimension(50,50));

            // Top slider color.
            miniSlider.setBackground(new Color(164,116,73));
            miniSlider2.setBackground(new Color(164,116,73));

            miniSlider.setInverted(true);
            miniSlider2.setInverted(true);
            miniSlider.setOrientation(SwingConstants.VERTICAL);
            miniSlider2.setOrientation(SwingConstants.VERTICAL);

            Hashtable<Integer,JComponent> sideLables = new Hashtable<>();
            sideLables.put(0, new JLabel("0"));
            sideLables.put(1, new JLabel("5"));
            miniSlider.setLabelTable(sideLables);
            miniSlider2.setLabelTable(sideLables);
            miniSlider.setPaintLabels(true);
            miniSlider2.setPaintLabels(true);

            slider.setOrientation(SwingConstants.VERTICAL);
            slider2.setOrientation(SwingConstants.VERTICAL);
            slider.setMajorTickSpacing(1);
            slider2.setMajorTickSpacing(1);
            slider.setPaintLabels(true);
            slider2.setPaintLabels(true);

            slider.addChangeListener(this);
            slider2.addChangeListener(this);
            miniSlider.addChangeListener(this);
            miniSlider2.addChangeListener(this);

            frame.add(miniSlider);
            frame.add(miniSlider2);
            frame.add(slider);
            frame.add(slider2);
            frame.add(label);
            frame.add(label2);

            frame.setVisible(true);
        }

    @Override
    public void stateChanged(ChangeEvent e) {
           int slide = slider.getValue();
           int miniSlide = miniSlider.getValue() * 5;

           int slide2 = slider2.getValue();
           int minSlide2 = miniSlider2.getValue() * 5;

        label.setText(String.valueOf(slide + miniSlide));
        //label.setText(String.valueOf(miniSlider.getValue() * 5) + slider.getValue());
        label2.setText(String.valueOf(slide2 + minSlide2));
    }

    BasicSliderUI sliderUI = new BasicSliderUI(slider) {
        @Override
        public void paintFocus(Graphics g){
//            BasicGraphicsUtils.drawDashedRect(g, focusRect.x, focusRect.y,
//                    focusRect.width, focusRect.height);
        }

        @Override
        public void paintThumb(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

           //Rectangle thumbBounds = thumbRect;

//            int thumbWidth = thumbBounds.width;
//            int thumbHeight = thumbBounds.height;
//            int thumbX = thumbBounds.x;
//            int thumbY = thumbBounds.y;
            g2d.setColor(new Color(100,100,100));
            g2d.fillOval(thumbRect.x, thumbRect.y, thumbRect.width, thumbRect.height);
        }
    };
}