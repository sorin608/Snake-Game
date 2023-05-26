import java.io.*;

public class salvareScor {
        public salvareScor() throws IOException{
            FileWriter writer = new FileWriter("scor.txt");
            writer.write("Scorul este: "+Integer.toString(GamePanel.appleEaten));
            writer.close();
        }
}
