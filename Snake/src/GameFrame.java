import javax.swing.*;

public class GameFrame extends JFrame {
        GameFrame(){
            this.add(new GamePanel());
            this.add(new ScorePanel());
            this.setTitle("Snake");
            this.setSize(605,655);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setResizable(false);
            this.setLayout(null);
            this.setVisible(true);
            this.setLocationRelativeTo(null);

        }
}
