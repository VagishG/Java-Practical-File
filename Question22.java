import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question22 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Controls Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 5, 5));
        
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);
        
        JLabel genderLabel = new JLabel("Gender:");
        JComboBox<String> genderCombo = new JComboBox<>(new String[]{"Male", "Female", "Other"});
        
        JLabel ageLabel = new JLabel("Age:");
        JSpinner ageSpinner = new JSpinner(new SpinnerNumberModel(18, 0, 100, 1));
        
        JLabel addressLabel = new JLabel("Address:");
        JTextArea addressArea = new JTextArea(3, 20);
        JScrollPane scrollPane = new JScrollPane(addressArea);
        
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String gender = (String) genderCombo.getSelectedItem();
                int age = (int) ageSpinner.getValue();
                String address = addressArea.getText();
                
                JOptionPane.showMessageDialog(frame, "Name: " + name + "\nGender: " + gender + "\nAge: " + age + "\nAddress: " + address, "Form Data", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(genderLabel);
        panel.add(genderCombo);
        panel.add(ageLabel);
        panel.add(ageSpinner);
        panel.add(addressLabel);
        panel.add(scrollPane);
        panel.add(new JLabel()); // Empty label for spacing
        panel.add(submitButton);
        
        frame.add(panel);
        frame.setVisible(true);
    }
}
