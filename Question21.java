import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Question21 extends JFrame implements ChangeListener {

    private JScrollBar redBar, greenBar, blueBar;
    private JPanel colorPanel;

    public Question21() {
        setTitle("RGB Color Picker");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        redBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 256);
        greenBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 256);
        blueBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 256);
        
        redBar.addAdjustmentListener(new ScrollBarListener());
        greenBar.addAdjustmentListener(new ScrollBarListener());
        blueBar.addAdjustmentListener(new ScrollBarListener());
        
        colorPanel = new JPanel();
        colorPanel.setBackground(Color.BLACK);
        
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(3, 2));
        controlPanel.add(new JLabel("Red:"));
        controlPanel.add(redBar);
        controlPanel.add(new JLabel("Green:"));
        controlPanel.add(greenBar);
        controlPanel.add(new JLabel("Blue:"));
        controlPanel.add(blueBar);
        
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(controlPanel, BorderLayout.NORTH);
        getContentPane().add(colorPanel, BorderLayout.CENTER);
    }

    class ScrollBarListener implements AdjustmentListener {
        public void adjustmentValueChanged(AdjustmentEvent e) {
            int red = redBar.getValue();
            int green = greenBar.getValue();
            int blue = blueBar.getValue();
            Color color = new Color(red, green, blue);
            colorPanel.setBackground(color);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Question21 rgbColorPicker = new Question21();
                rgbColorPicker.setVisible(true);
            }
        });
    }

    @Override
    public void stateChanged(ChangeEvent e) {
    }
}
