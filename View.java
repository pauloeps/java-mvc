import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

public class View extends JFrame {

    private JLabel invLabel = new JLabel("Investment: ");
    private JTextField invField = new JTextField(10);

    private JLabel intLabel = new JLabel(" Interest Rate (% Annually): ");
    private JTextField intField = new JTextField(10);

    private JLabel cmpLabel = new JLabel("Compound Frequency: ");
    private String[] cmpOptions = {"Monthly", "Annually"};
    private JComboBox cmpCombo = new JComboBox(cmpOptions);

    private JLabel yrsLabel = new JLabel("Years: ");
    private JTextField yrsField = new JTextField(10);

    private JButton calcButton = new JButton("Calculate");

    View() {

        //Closes the application when user click on "X".
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setTitle("Compound Interest Calculator");

        invLabel.setHorizontalAlignment(JLabel.RIGHT);
        intLabel.setHorizontalAlignment(JLabel.RIGHT);
        cmpLabel.setHorizontalAlignment(JLabel.RIGHT);
        yrsLabel.setHorizontalAlignment(JLabel.RIGHT);

        JPanel fieldsPanel = new JPanel();
        fieldsPanel.setLayout(new GridLayout(5,2));
        fieldsPanel.add(invLabel);
        fieldsPanel.add(invField);
        fieldsPanel.add(intLabel);
        fieldsPanel.add(intField);
        fieldsPanel.add(cmpLabel);
        fieldsPanel.add(cmpCombo);
        fieldsPanel.add(yrsLabel);
        fieldsPanel.add(yrsField);
        fieldsPanel.add(calcButton);

        this.add(fieldsPanel);
        this.pack();
    }

    public double getInvestment() {
        return Double.parseDouble(invField.getText());
    }
    public double getInterest() {
        return Double.parseDouble(intField.getText());
    }
    public String getCompFreq() {
        return cmpCombo.getSelectedItem()+"";
    }
    public int getYears() {
        return Integer.parseInt(yrsField.getText());
    }

    void addCalculationListener(ActionListener listenForCalcButton) {
        calcButton.addActionListener(listenForCalcButton);
    }

    void displayErrorMessage() {
        JOptionPane.showMessageDialog(this, "Please enter the values correctly!");
    }

    void showResult(double result, int years) {
        String resultStr = String.format("$%.2f", result);
        String message = "In " + years + " years, you will have " + resultStr;
        JOptionPane.showMessageDialog(this, message);
    }
}
