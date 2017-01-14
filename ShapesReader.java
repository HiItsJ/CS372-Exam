import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShapesReader extends JComponent implements MouseListener{

  static JFrame frame;

  static ArrayList<Circle> circles = new ArrayList();
  static ArrayList<Square> squares = new ArrayList();
  static ArrayList<Rectangle> rectangles = new ArrayList();
  static ArrayList<Triangle> triangles = new ArrayList();

  static ArrayList<Shape> shapes = new ArrayList();

  public ShapesReader(){
    addMouseListener(this);
  }
  public void mouseClicked(MouseEvent e){
    
  }
  public void mouseEntered(MouseEvent e){}
  public void mouseExited(MouseEvent e){}
  public void mousePressed(MouseEvent e){}
  public void mouseReleased(MouseEvent e){}
  public void paint(Graphics g){
    Graphics2D g2 = (Graphics2D)g;
    int posX = 0;
    int posY = 10;
    for (int x=0; x<shapes.size(); x++){
      g2.drawString(shapes.get(x).toString(), posX, posY);
      if (posY<560){
        posY += 20;
      }
      else {
        posX += 200;
        posY = 10;
      }
    }
  }
  public static void main(String[] args){
    try {
      FileInputStream is = new FileInputStream("shapes.txt");
      InputStreamReader ir = new InputStreamReader(is);
      BufferedReader rdr = new BufferedReader(ir);
      String line = rdr.readLine();

      String kind;
      int id;
      int radius;
      int side1;
      int side2;
      int side3;
      String color;

      int index1;
      int index2;
      int index3;
      int index4 = 0;
      int index5 = 0;

      while (line != null){

        index1 = line.indexOf(" ");
        index2 = line.indexOf(" ", index1+1);
        index3 = line.indexOf(" ", index2+1);
        if (line.indexOf(" ", index3+1)>0){
          index4 = line.indexOf(" ", index3+1);
          if (line.indexOf(" ", index4+1)>0)
            index5 = line.indexOf(" ", index4+1);
        }

        id = Integer.parseInt(line.substring(index1+1, index2));

        if (line.contains("circle")){
          radius = Integer.parseInt(line.substring(index2+1, index3));
          color = line.substring(index3+1);
          circles.add(new Circle(id, radius, color));
          shapes.add(new Circle(id, radius, color));
        }
        if (line.contains("square")){
          side1 = Integer.parseInt(line.substring(index2+1, index3));
          color = line.substring(index3+1);
          squares.add(new Square(id, side1, color));
          shapes.add(new Square(id, side1, color));
        }
        if (line.contains("rectangle")){
          side1 = Integer.parseInt(line.substring(index2+1, index3));
          side2 = Integer.parseInt(line.substring(index3+1, index4));
          color = line.substring(index4+1);
          rectangles.add(new Rectangle(id, side1, side2, color));
          shapes.add(new Rectangle(id, side1, side2, color));
        }
        if (line.contains("triangle")){
          side1 = Integer.parseInt(line.substring(index2+1, index3));
          side2 = Integer.parseInt(line.substring(index3+1, index4));
          side3 = Integer.parseInt(line.substring(index4+1, index5));
          color = line.substring(index5+1);
          triangles.add(new Triangle(id, side1, side2, side3, color));
          shapes.add(new Triangle(id, side1, side2, side3, color));
        }
        line = rdr.readLine();
      }
    }
    catch (Exception ex) {;}

    frame = new JFrame();
    frame.setSize(1200, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(new ShapesReader());
    frame.setVisible(true);


  }
}
