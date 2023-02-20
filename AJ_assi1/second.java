import javax.swing.*;

public class second {
    public static void main(String[] args){
        JFrame frame = new JFrame("Question 2");
        frame.setSize(420,420);

        // create toogle button
        JToggleButton toggleButton = new JToggleButton("Light OFF");
        toggleButton.setBounds(100,50,100,50);

        // adding action in toogle button 
        toggleButton.addActionListener(e -> {
            if(toggleButton.isSelected()){
                toggleButton.setText("Light ON");
            }
            else{
                toggleButton.setText("Light OFF");
            }
        });
        // adding button to frame
        frame.add(toggleButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
