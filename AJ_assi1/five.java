import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class five implements ActionListener {
    private JFrame frame;
    private JPanel panel;

    public static void main(String[] args) {
        five example = new five();
        example.run();
    }

    public void run() {
        frame = new JFrame("Question 5");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        // Create the JPanel and set its properties
        panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Create the JButton for the file chooser and set its properties
        JButton fileChooserButton = new JButton("Choose a File");
        fileChooserButton.addActionListener(this);

        // Create the JButton for the color chooser and set its properties
        JButton colorChooserButton = new JButton("Choose a Color");
        colorChooserButton.addActionListener(this);

        // Add the components to the JPanel
        panel.add(fileChooserButton);
        panel.add(colorChooserButton);

        // Add the JPanel to the JFrame
        frame.getContentPane().add(panel);

        // Display the JFrame
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent event) {
        // Check which button was clicked
        if (event.getActionCommand().equals("Choose a File")) {
            // Create a new JFileChooser and show it
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                // Get the selected file and display its path
                String filePath = fileChooser.getSelectedFile().getAbsolutePath();
                JOptionPane.showMessageDialog(frame, "You chose the file: " + filePath);
            }
        } else if (event.getActionCommand().equals("Choose a Color")) {
            // Create a new JColorChooser and show it
            Color initialColor = panel.getBackground();
            Color color = JColorChooser.showDialog(frame, "Choose a Color", initialColor);
            if (color != null) {
                // Set the background color of the JPanel to the selected color
                panel.setBackground(color);
            }
        }
    }
}
