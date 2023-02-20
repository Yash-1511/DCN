import javax.swing.*;

public class four {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Question 4");
        frame.setSize(500, 500);

        // create tabbed pane
        JTabbedPane pane = new JTabbedPane();

        // create first panel with components
        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel("This is Panel1");
        JTextField textField1 = new JTextField("Write something about me");
        panel1.add(label1);
        panel1.add(textField1);

        // Create the second panel with some components
        JPanel panel2 = new JPanel();
        JLabel label2 = new JLabel("This is panel 2");
        JCheckBox checkBox1 = new JCheckBox("Check me");
        panel2.add(label2);
        panel2.add(checkBox1);

        // Create the third panel with some components
        JPanel panel3 = new JPanel();
        JLabel label3 = new JLabel("This is panel 3");
        JTextArea textArea1 = new JTextArea("Type something here", 10, 30);
        panel3.add(label3);
        panel3.add(textArea1);

        // Create the fourth panel with some components
        JPanel panel4 = new JPanel();
        JLabel label4 = new JLabel("This is panel 4");
        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        panel4.add(label4);
        panel4.add(radioButton1);
        panel4.add(radioButton2);

        // Create the fifth panel with some components
        JPanel panel5 = new JPanel();
        JLabel label5 = new JLabel("This is panel 5");
        JTree tree1 = new JTree();
        panel5.add(label5);
        panel5.add(tree1);

        // adding panel to the tabbedpane
        pane.addTab("Tab1", panel1);
        pane.addTab("Tab2", panel2);
        pane.addTab("Tab3", panel3);
        pane.addTab("Tab4", panel4);
        pane.addTab("Tab5", panel5);

        frame.getContentPane().add(pane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
