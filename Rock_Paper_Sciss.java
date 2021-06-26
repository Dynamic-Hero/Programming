import java.util.Scanner;
public class Rock_Paper_Sciss{
    public static void main(String[] args) {
         int user_score = 0 , computer_score = 0 ;
        while(true){
            char computer = ' ' , user = ' ';
            String user_1 = "" , computer_1 = "";
            double computer_number = 0.0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Rock : Paper : Scissors");
        user_1 = sc.next();
        user = user_1.toLowerCase().charAt(0); 
        computer_number = Math.random() * 10 ; 

        if(computer_number <= 3){
            computer = 'r';
            computer_1 = "Rock";
        }
        else if(computer_number >= 3 && computer_number <=6){
            computer = 'p';
            computer_1 = "Paper";
        }
        else{
            computer = 's';
            computer_1 = "Scissors";
        }

            System.out.println("User : "+user_1);
            System.out.println("Computer : "+computer_1+"\n");

        if((computer == 'r' && user == 'p') || (computer == 'p' && user == 's') || (computer == 's' && user == 'r')){
            System.out.println("~~~~~~~~ You Win ~~~~~~~~\n");
            user_score++;
        }
        else if(computer == user)
            System.out.println("DRAW\n");
        else{
            System.out.println("~~~~~~~~ Computer Win's ~~~~~~~~\n");
            computer_score++;
          }
          System.out.println("User score : "+user_score);
          System.out.println("Computer score : "+computer_score+"\n");
      }
    }
}
