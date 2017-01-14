public class Square implements Shape{

  String kind = "Square";
  int id;
  int side;
  String color;

  public Square(int i, int s, String c){
    id = i;
    side = s;
    color = c;
  }
  public String toString(){
    return kind+" (ID# "+id+")";
  }
  public String getKind(){
    return kind;
  }
  public String getDetailString(){
    return toString()+"\nSide: "+side+"\nColor: "+color+"\nArea: "+findArea()+"\nPerimeter: "+findPerimeter();
  }
  public int getID(){
    return id;
  }
  public int findArea(){
    return side*side;
  }
  public int findPerimeter(){
    return side*4;
  }
}
