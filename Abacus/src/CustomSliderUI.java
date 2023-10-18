import javax.swing.*;
import javax.swing.plaf.basic.BasicSliderUI;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class CustomSliderUI extends BasicSliderUI {
    private static final int TRACK_HEIGHT = 8;
    private static final int TRACK_WIDTH = 8;
    private static final int TRACK_ARC = 5;
    private static final Dimension THUMB_SIZE = new Dimension(10,10);
    private final RoundRectangle2D.Float trackShape = new RoundRectangle2D.Float();

    public CustomSliderUI(final JSlider s) {
        super(s);
    }
}
