import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        UIDefaults defaults = UIManager.getDefaults();
        defaults.put("Slider.thumbHeight" , 100);
        defaults.put("Slider.thumbWidth", 100);

        SliderGridLayout s1 = new SliderGridLayout();
        SliderDriverForm Abacus = new SliderDriverForm();

        //SliderTest s1 = new SliderTest();
        //SwingAlignment ss1 = new SwingAlignment();
        //SliderDemo p1 = new SliderDemo();
    }
}