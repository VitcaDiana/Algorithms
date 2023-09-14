package SDA1;

import java.util.Random;
import java.util.Scanner;

//piatra-foarfece-hartie
public class Ex2 {
    public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);
        String userOption = "";
        Random random = new Random();
        String [] options = {"piatra", "foarfeca","hartie"};

        int equalGame = 0;
        int userWins = 0;
        int computerWins = 0;
        for (int i = 0;i<3;i++) {
            do {
                userOption = scanner.nextLine();
            } while (!isOptionsValid(userOption, options));
            String computerChoice = options[random.nextInt(3)];
            System.out.println("Computerul a ales " + computerChoice);



            if (userOption.equals(computerChoice)) {
                System.out.println("remiza in runda " +i);
                equalGame++;
            } else if (userWins(userOption, computerChoice)) {
                System.out.println("utilizatorul a castigat in runda " +i);
                userWins++;

            } else {
                System.out.println("calculatorul a castigat in runda "+i);
                computerWins++;
            }
        }
        System.out.println(equalGame);
        System.out.println(userWins);
        System.out.println(computerWins);

        if (computerWins >userWins){
            System.out.println("Calculatorul a castigat turneul");
        }else if(userWins >computerWins){
            System.out.println("userul a castigat turneul");
        }else{
            System.out.println("remiza in turneu");
        }


    }
    public static boolean userWins( String userOption, String computerChoice){
        return ((userOption.equals("piatra") && computerChoice.equals("foarfeca")) || (userOption.equals("foarfeca") && computerChoice.equals("hartie")) || (userOption.equals("hartie") && computerChoice.equals("piatra")));
    }
    public static boolean isOptionsValid( String option, String [] validOptions){
        for (int i=0;i<validOptions.length;i++){
            if (option.equals(validOptions[i])){
                return true;
            }
        }
        return false;
    }
}
