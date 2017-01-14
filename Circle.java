public class Circle implements Shape{

  String kind = "Circle";
  int id;
  int radius;
  String color;

  public Circle(int i, int r, String c){
    id = i;
    radius = r;
    color = c;
  }
  public String toString(){
    return kind+" (ID# "+id+")";
  }
  public String getKind(){
    return kind;
  }
  public String getDetailString(){
    return toString()+"\nRadius: "+radius+"\nColor: "+color+"\nArea: "+findArea()+"\nCircumference: "+findCircumference();
  }
  public int getID(){
    return id;
  }
  public double findArea(){
    return 3.14*radius*radius;
  }
  public double findCircumference(){
    return 3.14*radius*2;
  }
}
