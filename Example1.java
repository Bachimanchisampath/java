class Book{
  String title,author;
  int year;

  public Book(String title, String author,int year){
   this.title = title;this.author = author;this.year = year;
  }

  public void display(){
    System.out.println("The title of the book is: "+title);
    System.out.println("The name of the authoer is:"+author);
    System.out.println("The year of it is released is: "+year);
  }
}

class Example1{
 public static void main(String args[]){
  Book textbook1 = new Book("Calculus","Newton",1690);
  Book textbook2 = new Book("Book2","author",1960);
  textbook1.display();
  textbook2.display();
 }
}