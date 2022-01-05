package snake;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;

public class GameFrame extends JFrame {
    //Medium Level
 GameFrame(){
 this.add(new GamePanel());
 this.setTitle("Snake");
 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 this.setResizable(false);
 this.pack();
 this.setVisible(true);
 this.setLocationRelativeTo(null);
 
 }
 
}
