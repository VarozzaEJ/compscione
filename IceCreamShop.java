import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;

public class IceCreamShop implements ActionListener {

    
    private double vanilla = 2.98;
    private double chocolate = 3.49;
    private double mint = 4.14;
    private double totalMoney = 10.00;


    private JFrame frame;

    private JPanel panel;

    private JLabel vanillaLabel;
    private JLabel chocolateLabel;
    private JLabel mintLabel;
    private JLabel totalMoneyLabel;
    private JLabel youBoughtLabel;

    private JButton addVanillaButton;
    private JButton addChocolateButton;
    private JButton addMintButton;
    private JButton resetMoney;


    public IceCreamShop() {
        frame = new JFrame();

        addChocolateButton = new JButton("Add Chocolate");
        addChocolateButton.addActionListener(this);
        addVanillaButton = new JButton("Add Vanilla");
        addVanillaButton.addActionListener(this);
        addMintButton = new JButton("Add Mint");
        addMintButton.addActionListener(this);
        resetMoney = new JButton("Reset");
        resetMoney.addActionListener(this);

        vanillaLabel = new JLabel("Vanilla: " + vanilla);
        chocolateLabel = new JLabel("Chocolate: " + chocolate);
        mintLabel = new JLabel("Mint: " + mint);
        totalMoneyLabel = new JLabel("You have: " + "$" + totalMoney);
        youBoughtLabel = new JLabel("");

        
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
        panel.setLayout(new GridLayout(0, 3));

        panel.add(vanillaLabel);
        panel.add(mintLabel);
        panel.add(chocolateLabel);
        panel.add(addVanillaButton);
        panel.add(addMintButton);
        panel.add(addChocolateButton);
        panel.add(totalMoneyLabel);
        panel.add(resetMoney);


        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Ice Cream Shop");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new IceCreamShop();
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        if(e.toString().contains("Reset")) {
            totalMoney = 10;
            totalMoneyLabel.setText("You have: " + "$" + totalMoney);
        }
        if(totalMoney <= 0) return;
        if(e.toString().contains("Add Vanilla")) {
            if(totalMoney < vanilla) return;
            totalMoneyLabel.setText("You have: " + "$" + Math.round(((totalMoney - vanilla) * 100d)) / 100d);
            youBoughtLabel.setText("You bought: Vanilla");
            totalMoney = totalMoney - vanilla;
        }
        if(e.toString().contains("Add Chocolate")) {
            if(totalMoney < chocolate) return;
            totalMoneyLabel.setText("You have: " + "$" + Math.round(((totalMoney - chocolate) * 100d)) / 100d);
            youBoughtLabel.setText("You bought: Chocolate");
            totalMoney = totalMoney - chocolate;
        }
        if(e.toString().contains("Add Mint")) {
            if(totalMoney < mint) return;
            totalMoneyLabel.setText("You have: " + "$" + Math.round(((totalMoney - mint) * 100d)) / 100d);
            youBoughtLabel.setText("You bought: Mint");
            totalMoney = totalMoney - mint;
        }
    }
}