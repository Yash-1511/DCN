import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class third {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Question 3");
        frame.setSize(420,420);

        // simple button
        JButton button1 = new JButton("Button");
        // radio buttons
        JRadioButton radio1 = new JRadioButton("Option 1");
        JRadioButton radio2 = new JRadioButton("Option 1");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radio1);
        buttonGroup.add(radio2);

        // Tree
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("root");
        DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Node 1");
        root.add(node1);
        DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Node 2");
        root.add(node2);
        JTree tree = new JTree(root);

        // menu 
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem menuItem = new JMenuItem("Menu item");
        menu.add(menuItem);
        menuBar.add(menu);

        // checkbox
        JCheckBox checkBox = new JCheckBox("Check me");
        // text field
        JTextField textField = new JTextField("Type something here");
        // text area
        JTextArea textArea = new JTextArea("Type something here");

        // Box layout to add those components
        Box container = Box.createVerticalBox();
        container.add(button1);
        container.add(radio1);
        container.add(radio2);
        container.add(tree);
        container.add(menuBar);
        container.add(checkBox);
        container.add(textField);
        container.add(textArea);

        // Add the container to the JFrame
        frame.getContentPane().add(container);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
