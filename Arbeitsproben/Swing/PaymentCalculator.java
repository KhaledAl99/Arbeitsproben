import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.awt.event.ActionEvent;

public class PaymentCalculator {

    private JFrame frame;
    private JTextField invoiceDateField;
    private JTextField amountField;
    private JTextField discountField;
    private JTextField dueDaysField;
    private JTextField dueDateField;
    private JTextField payableAmountField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                PaymentCalculator window = new PaymentCalculator();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the application.
     */
    public PaymentCalculator() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // Input fields and labels
        JLabel lblInvoiceDate = new JLabel("Rechnungsdatum (yyyy-mm-dd):");
        lblInvoiceDate.setBounds(20, 20, 200, 25);
        frame.getContentPane().add(lblInvoiceDate);

        invoiceDateField = new JTextField();
        invoiceDateField.setBounds(250, 20, 200, 25);
        frame.getContentPane().add(invoiceDateField);

        JLabel lblAmount = new JLabel("Rechnungsbetrag:");
        lblAmount.setBounds(20, 60, 200, 25);
        frame.getContentPane().add(lblAmount);

        amountField = new JTextField();
        amountField.setBounds(250, 60, 200, 25);
        frame.getContentPane().add(amountField);

        JLabel lblDiscount = new JLabel("Skonto (%):");
        lblDiscount.setBounds(20, 100, 200, 25);
        frame.getContentPane().add(lblDiscount);

        discountField = new JTextField();
        discountField.setBounds(250, 100, 200, 25);
        frame.getContentPane().add(discountField);

        JLabel lblDueDays = new JLabel("Zahlungsfrist (Tage):");
        lblDueDays.setBounds(20, 140, 200, 25);
        frame.getContentPane().add(lblDueDays);

        dueDaysField = new JTextField();
        dueDaysField.setBounds(250, 140, 200, 25);
        frame.getContentPane().add(dueDaysField);

        // Output fields and labels
        JLabel lblDueDate = new JLabel("Fälligkeitsdatum:");
        lblDueDate.setBounds(20, 180, 200, 25);
        frame.getContentPane().add(lblDueDate);

        dueDateField = new JTextField();
        dueDateField.setBounds(250, 180, 200, 25);
        dueDateField.setEditable(false);
        frame.getContentPane().add(dueDateField);

        JLabel lblPayableAmount = new JLabel("Zuzahlender Betrag:");
        lblPayableAmount.setBounds(20, 220, 200, 25);
        frame.getContentPane().add(lblPayableAmount);

        payableAmountField = new JTextField();
        payableAmountField.setBounds(250, 220, 200, 25);
        payableAmountField.setEditable(false);
        frame.getContentPane().add(payableAmountField);

        // Calculate button
        JButton calculateButton = new JButton("Berechnen");
        calculateButton.setBounds(150, 280, 200, 50);
        frame.getContentPane().add(calculateButton);

        // Add event listener to the button
        calculateButton.addActionListener(e -> calculatePayment());
    }

    /**
     * Perform the payment calculation.
     */
    private void calculatePayment() {
        try {
            // Parse inputs
            LocalDate invoiceDate = LocalDate.parse(invoiceDateField.getText());
            double amount = Double.parseDouble(amountField.getText());
            double discount = Double.parseDouble(discountField.getText()) / 100;
            int dueDays = Integer.parseInt(dueDaysField.getText());

            // Calculate due date and payable amount
            LocalDate dueDate = invoiceDate.plusDays(dueDays);
            double payableAmount = amount * (1 - discount);

            // Set output fields
            dueDateField.setText(dueDate.toString());
            payableAmountField.setText(String.format("%.2f", payableAmount));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, "Bitte überprüfen Sie Ihre Eingaben!", "Fehler", JOptionPane.ERROR_MESSAGE);
        }
    }
}
