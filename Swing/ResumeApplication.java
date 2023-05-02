import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResumeApplication extends JFrame {
    private JTextArea resumeText;
    private JTextField nameField;
    private JTextField regNumberField;
    private JTextField emailField;
    private JTextField phoneField;
    private JTextField githubField;
    private JTextField educationField;
    private JTextField cgpaField;
    private JTextField skillsField;
    private JTextField hobbiesField;

    public ResumeApplication() {
        setTitle("Resume Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 600);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        resumeText = new JTextArea();
        resumeText.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resumeText);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(10, 2));

        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Registration Number:"));
        regNumberField = new JTextField();
        inputPanel.add(regNumberField);

        inputPanel.add(new JLabel("Email ID:"));
        emailField = new JTextField();
        inputPanel.add(emailField);

        inputPanel.add(new JLabel("Phone Number:"));
        phoneField = new JTextField();
        inputPanel.add(phoneField);

        inputPanel.add(new JLabel("GitHub Link:"));
        githubField = new JTextField();
        inputPanel.add(githubField);

        inputPanel.add(new JLabel("Education:"));
        educationField = new JTextField();
        inputPanel.add(educationField);

        inputPanel.add(new JLabel("CGPA:"));
        cgpaField = new JTextField();
        inputPanel.add(cgpaField);

        inputPanel.add(new JLabel("Skills:"));
        skillsField = new JTextField();
        inputPanel.add(skillsField);

        inputPanel.add(new JLabel("Hobbies:"));
        hobbiesField = new JTextField();
        inputPanel.add(hobbiesField);

        mainPanel.add(inputPanel, BorderLayout.NORTH);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Event handling code for the submit button
                String name = nameField.getText();
                String regNumber = regNumberField.getText();
                String email = emailField.getText();
                String phone = phoneField.getText();
                String github = githubField.getText();
                String education = educationField.getText();
                String cgpa = cgpaField.getText();
                String skills = skillsField.getText();
                String hobbies = hobbiesField.getText();

                String resume = "Name: " + name + "\n" +
                        "Registration Number: " + regNumber + "\n" +
                        "Email ID: " + email + "\n" +
                        "Phone Number: " + phone + "\n" +
                        "GitHub Link: " + github + "\n\n" +
                        "Education: " + education + "\n" +
                        "CGPA: " + cgpa + "\n\n" +
                        "Skills: " + skills + "\n\n" +
                        "Hobbies: " + hobbies;

                resumeText.setText(resume);
                JOptionPane.showMessageDialog(ResumeApplication.this, "Resume submitted successfully!");
            }
        });
        mainPanel.add(submitButton, BorderLayout.SOUTH);

        add(mainPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
        public void run() {
        ResumeApplication app = new ResumeApplication();
        app.setVisible(true);
        }
        });
        }
        }
