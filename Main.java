import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter an integer to count down to.");
    int down = input.nextInt();
    int count = 100;
    while(count >= down){
      System.out.println(count);
      count = count -1;
    }
  }
}
