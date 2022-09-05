import java.util.Scanner;
import java.util.Random;

class GameFrame{
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    int num;
    int Attempts;
    int countt;
    int randomNum;
    int score;
    GameFrame(int a){
        this.Attempts = a;
    }
    void game(){
        randomNum = rand.nextInt(1, 100);
        System.out.println("Number has been given.");
        for(int i=0;i<Attempts;i++){
            System.out.println();
            System.out.println("Enter number:-");
            num = sc.nextInt();
            if(randomNum==num){
                System.out.println("You got the number in "+countt+ " attempts");
                break;
            }
            else if(randomNum>num){
                System.out.println("small number...Enter higher number.");
                countt+=1;
            }
            else{
                System.out.println("large number...Enter smaller number.");
                countt+=1;
            }
        }
        if(countt==Attempts){
            System.out.println("YOU LOST THE GAME.");
        }
        else{
            System.out.println("YOU WON THE GAME.");
        }
    }

    int score(){
        this.score = Attempts-countt;
        return score;

    }
}

public class NumberGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userInput;
        int round = 1;
        System.out.println("Enter 1 for playing the game and 0 for not playing the game.");
        userInput = in.nextInt();
        while(userInput!=0) {
            if(userInput==1){
                System.out.println("ROUND:- "+round);
                GameFrame g = new GameFrame(10);
                g.countt = 0;
                g.game();
                System.out.println("YOUR SCORE:- "+g.score()+"\n");
                round = round + 1;
            }
            else{
                System.out.println("GAME STOPPED.");
                System.exit(0);
            }
            System.out.println("Enter 1 for playing the game and 0 for not playing the game.");
            userInput = in.nextInt();
        }
        if(userInput==0){
            System.out.println("THANKS FOR PLAYING THE GAME.");
        }


    }
}
