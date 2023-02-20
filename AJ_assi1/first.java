import javax.swing.*;
class first{
    public static void main(String[] args) {
        JFrame frame = new JFrame("First Question");
        frame.setSize(420,420);
        
        // components
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JLabel label = new JLabel("Label");
        JCheckBox checkBox = new JCheckBox("Checkbox");
        JTextArea textArea = new JTextArea("Text area");
        
        // Boxed layout
        Box container = Box.createVerticalBox();
        container.add(button1);
        container.add(button2);
        container.add(label);
        container.add(checkBox);
        container.add(textArea);
        
        // add box in frame
        frame.add(container);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}