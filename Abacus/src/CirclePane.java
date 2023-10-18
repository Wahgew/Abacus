import javax.swing.*;
import java.awt.*;

public class CirclePane extends JPanel {
    public CirclePane() {
        setOpaque(false);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(50,50);
    }

    public int getRadius() {
        return Math.min(getWidth(), getHeight());
    }

    public Insets getInsets() {
        int radius = getRadius();
        int x = (getWidth() - radius) / 2;
        int y = (getHeight() - radius) / 2;
        return new Insets(radius / 3 ,radius / 3, radius / 3, radius / 3);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();

        int radius = getRadius();
        int x = (getWidth() - radius) / 2;
        int y = (getHeight() - radius) / 2;

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2.fillOval(x,y,radius,radius);
    }
}
