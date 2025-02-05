import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.UIManager;

public class RentCalculator implements ActionListener {

    private int splitRent = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JSpinner spinner;
    private JSpinner totalRentCostJSpinner;
    private JLabel rentCostLabel;
    private JLabel splitRentCostLabel;

    public RentCalculator() {
        frame = new JFrame();

        spinner = new JSpinner();
        totalRentCostJSpinner = new JSpinner();

        button = new JButton("Calculate");
        button.addActionListener(this);

        label = new JLabel("# Of People");
        rentCostLabel = new JLabel("Total Rent Cost");
        splitRentCostLabel = new JLabel("Split Rent: ");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
        panel.setLayout(new GridLayout(0, 2));
        panel.add(label);
        panel.add(spinner);
        panel.add(rentCostLabel);
        panel.add(totalRentCostJSpinner);
        panel.add(button);
        panel.add(splitRentCostLabel);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Rent Calculator");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        try { 
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel"); 
    } catch(Exception ignored){}
        new RentCalculator();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        splitRent = totalRentCostJSpinner.getValue().hashCode() / spinner.getValue().hashCode();
        splitRentCostLabel.setText("Split Rent: " + splitRent);
    }
}