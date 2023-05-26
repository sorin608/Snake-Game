import javax.swing.*;
import java.awt.*;

public class ScorePanel extends JPanel {

    ScorePanel() {
        this.setBackground(new Color(255-255-153));
        this.setBounds(0,0,600,50);

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }
    public void draw(Graphics g){
       g.setColor(Color.BLACK);
       g.setFont(new Font("Times New Roman",Font.BOLD,30));
       g.drawString("Score: "+GamePanel.appleEaten,240,35);
       repaint();
    }

}





