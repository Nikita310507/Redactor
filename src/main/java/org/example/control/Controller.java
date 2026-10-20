package control;
import model.Cat;
import model.Dog;
import model.SpeakBehavior;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;

public class Controller {
    Cat cat;
    Dog dog;
    SpeakBehavior animal;
    Point2D[] points;

    public Controller () {
        points = new Point2D [2];
        cat = new Cat();
        dog = new Dog();
        animal = cat;
    }

    public void selectCat() {
        animal = new Cat();
    }

    public void selectDog(){
        animal = new Dog();
    }

    public String speak(){
        return animal.speak();
    }

    public void mousePressed(Point point) {
        points[0] = point;
    }

    public void mouseDragged(Point point) {
        points[1] = point;
    }
}
