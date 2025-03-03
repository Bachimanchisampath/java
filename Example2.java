class Myclass{
 static int count = 0;
 final double PI = 3.1415;

 public Myclass(){
  count++;
 }
}

class Example2{
 public static void main(String args[]){
  Myclass obj1 = new Myclass();
  Myclass obj2 = new Myclass();
  Myclass obj3 = new Myclass();
  Myclass obj4 = new Myclass();
  System.out.println("The number of abjects are: "+Myclass.count);
 }
}
