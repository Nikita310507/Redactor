import model.Cat;
import model.Dog;
import control.Controller;

import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Mypanel extends JPanel {
//    JTextField t1;
//    JTextField t1x;
//    JTextField t2;
//    JTextField t2x;
//    JTextField t3;
    JTextField t4;
//    JTextField t5;
//    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    Point2D p1;
    Point2D p2;
    Rectangle2D shape;
    Cat cat;
    Dog dog;

    public Mypanel() {
//       t1 = new JTextField("                                ");
//       t1x = new JTextField("  *  ");
//       t2 = new JTextField("                               ");
//       t3 = new JTextField("                               ");
       t4 = new JTextField("                               ");
//       t5 = new JTextField("                               ");
//       t2x = new JTextField("  =  ");
//       b1 = new JButton("submeet");
       b2 = new JButton("cat");
       b3 = new JButton("dog");
       b4 = new JButton("Speak");
       shape = new Rectangle2D.Double();
       cat = new Cat();
       dog = new Dog();
       Controller controller = new Controller ();
//       add (t1);
//       add (t1x);
//       add (t2);
//       add (t2x);
//       add (t3);
       add (t4);
//       add (t5);
//       add (b1);
       add (b2);
       add (b3);
       add (b4);
       b2.addActionListener(e ->{
           controller.selectCat();
       });
       b3.addActionListener(e ->{
           controller.selectDog();
       });
       b4.addActionListener(e ->{
           t4.setText(controller.speak());
       });

//       b1.addActionListener(new ActionListener() {
//           @Override
//           public void actionPerformed(ActionEvent e) {
////              t2.setText(t1.getText().trim());
//               Integer it;
//               it = 2;
//               int n1 = Integer.parseInt(t1.getText().trim());
//               int n2 = Integer.parseInt(t2.getText().trim());
//               int res = n1 * n2;
//               t3.setText(" " + res);
//           }
//       });
//       b2.addActionListener(new ActionListener() {
//           @Override
//           public void actionPerformed(ActionEvent e) {
//               t4.setText(cat.speak());
//           }
//       });
//
//       b3.addActionListener(new ActionListener() {
//           @Override
//           public void actionPerformed(ActionEvent e) {
//               t5.setText(dog.speak());
//           }
//       });
       addMouseListener(new MouseAdapter() {
           @Override
           public void mousePressed(MouseEvent e) {
               controller.mousePressed(e.getPoint());

           }
       });

       addMouseMotionListener(new MouseMotionAdapter() {
           @Override
           public void mouseDragged(MouseEvent e) {
              controller.mouseDragged(e.getPoint());

           }
       });
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        shape.setFrameFromDiagonal(p1,p2);
        ((Graphics2D)g).draw(shape);
    }
}
