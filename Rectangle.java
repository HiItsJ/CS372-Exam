public class Rectangle implements Shape{

  String kind = "Rectangle";
  int id;
  int side1;
  int side2;
  String color;

  public Rectangle(int i, int s1, int s2, String c){
    id = i;
    side1 = s1;
    side2 = s2;
    color = c;
  }
  public String toString(){
    return kind+" (ID# "+id+")";
  }
  public String getKind(){
    return kind;
  }
  public String getDetailString(){
    return toString()+"\nSide1: "+side1+"\nSide2"+side2+"\nColor: "+color+"\nArea: "+findArea()+"\nPerimeter: "+findPerimeter();
  }
  public int getID(){
    return id;
  }
  public int findArea(){
    return side1*side2;
  }
  public int findPerimeter(){
    return (side1*2)+(side2*2);
  }
}
