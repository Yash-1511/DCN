import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class sixth extends JFrame {
    public static void main(String[] args) {
        sixth example = new sixth();
        example.run();
    }

    public void run() {
        // set the frame
        setTitle("Question 6");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel() {
            public void paintComponent(Graphics g) {
                // Call the superclass's paintComponent method
                super.paintComponent(g);

                // Cast the Graphics object to a Graphics2D object
                Graphics2D g2d = (Graphics2D) g;

                // Set the drawing color
                g2d.setColor(Color.BLUE);

                // Draw a line
                Line2D line = new Line2D.Double(100, 100, 400, 400);
                g2d.draw(line);

                // Draw a rectangle
                Rectangle2D rect = new Rectangle2D.Double(50, 200, 200, 100);
                g2d.draw(rect);

                // Draw a circle
                Ellipse2D circle = new Ellipse2D.Double(300, 200, 150, 150);
                g2d.draw(circle);

                // Draw some text
                g2d.setColor(Color.BLACK);
                g2d.setFont(new Font("Arial", Font.PLAIN, 24));
                g2d.drawString("Hello, world!", 50, 50);
            }
        };
        // Add the panel to the JFrame
        getContentPane().add(panel);

        // Display the JFrame
        setVisible(true);
    }
}
