import java.util.Scanner;

class cab {
  int fare;
  
  cab(){
    fare =30; // initial registeration fee
  }

  cab(int fee){
    fare = fee; // registeration fee if the distance of nearby cab is more (>5)
  }

  void cabFare(){
    System.out.println("The total fare amount is " + fare ); // Total fare
    System.out.println("Thankyou for using our service, enjoy the ride!"); // greetings
  }
}

class cabRide{
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter the distance of the  nearby available cab (in km) : ");
      int cd = sc.nextInt(); // nearby cab distance
      System.out.println("Enter the travel distance (in km) : ");
      int td = sc.nextInt(); //travel distance
      if(cd <= 5){
        cab user = new cab(); // calling default constructor
        user.fare += 10 * td;
        user.cabFare();
      }
      else{
        cab user = new cab(30 + (cd - 5) * 10); // calling parameterized constructor
        user.fare += 10 * td;
        user.cabFare();
      }
    }
  }
} 
