import java.util.Scanner;
class Main {
  public static void main(String[] args) {

  //variables and Scanner declared
    Scanner input = new Scanner(System.in);
    String name;
    String job;
    String favoriteActivity;

//////////Input Screen
    System.out.println("Greeting! Please Enter in the following information!");
    System.out.println("------------------------------");
    System.out.print("Name: ");
    name = input.nextLine(); 
    System.out.print("Job:  ");
    job = input.nextLine();
    System.out.print("Favorite Activity: ");
    favoriteActivity = input.nextLine();

/////////Output Screen
    System.out.println("Here's the result!");
    System.out.println("------------------------------");
    String myStr = ("1 was an interesting, but a unique 2. They could 3 better than any other 2. 3ing is 1’s favorite activity");
    System.out.println(myStr.replace("1",name).replace("2",job).replace("3", favoriteActivity));
    }
}