import javax.swing.*;
import javax.swing.plaf.basic.BasicSliderUI;
import java.awt.*;

public class SliderExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Slider Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JSlider slider = new JSlider();
        slider.setMinimum(0);
        slider.setMaximum(100);
        slider.setValue(50);

        // Create a custom implementation of the BasicSliderUI class
        BasicSliderUI sliderUI = new BasicSliderUI(slider) {
            @Override
            public void paintThumb(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

//                Rectangle thumbBounds = thumbRect;

//                int thumbWidth = thumbBounds.width;
//                int thumbHeight = thumbBounds.height;
//                int thumbX = thumbBounds.x;
//                int thumbY = thumbBounds.y;

                g2d.setColor(new Color(100,100,100));
                g2d.fillOval(thumbRect.x, thumbRect.y, thumbRect.width, thumbRect.height);
            }
        };

        // Set the custom sliderUI to the JSlider
        slider.setUI(sliderUI);

        frame.getContentPane().add(slider, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
