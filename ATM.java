class bank{
  int savings = 100000;
  int money;

  public void withdrawl(int money){
    this.money = money;
    if(money<=savings){
     System.out.println("Your money is processing");
    }
    else{
     System.out.println("Your money is not sufficient");
    }
  
  public void deposit(int money){
    //this.money = money;
    int savings = savings + money;
    System.out.println("Your new savings are: "+savings);
  }
}

class ATM{
 public static void main(String[] args){
   bank person1 = new bank();

   person1.withdrawl(500);
   person1.deposit(500);
 }
}