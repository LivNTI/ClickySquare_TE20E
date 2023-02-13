import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public Window (){
        this.setTitle("click me");
        this.setPreferredSize(new Dimension(300,300));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(new Square());

        //finish up
        this.pack();
        this.setVisible(true);
    }
}
