import javax.swing.*;
import java.awt.*;

public class Myframe extends JFrame {
    Mypanel mp;
    public Myframe(Mypanel mp) throws HeadlessException {
        this.mp = mp;
        add (mp);
        super.setSize(500, 500);
        super.setVisible(true);
        super.setDefaultCloseOperation(3);
    }
}
