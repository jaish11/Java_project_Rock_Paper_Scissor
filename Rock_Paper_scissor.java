import java.util.Random;
import java.util.Scanner;
public class Rock_Paper_scissor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 0 for rock,1 for paper,2 for scissor:");
        int userinput=sc.nextInt();
        Random random=new Random();
        int computerInput=random.nextInt(3);
        System.out.println(computerInput);
        if (userinput==computerInput){
            System.out.println("Draw");
        }
        else if (userinput==0&&computerInput==2||userinput==1&&computerInput==0||userinput==2&&computerInput==1) {
            System.out.println("You win!");
        }
        else {
            System.out.println("Computer win!");
        }
        System.out.println("*****Computer choice*****");
        if (computerInput==0){
            System.out.println("Computer choice : Rock!");
        }
        else if (computerInput==1){
            System.out.println("Computer choice : Paper!");
        }
        else if (computerInput==2){
            System.out.println("Computer choice : Scissor!");
        }
        System.out.println("*****You choice*****");
        if (userinput==0){
            System.out.println("you choice : Rock!");
        }
        else if (userinput==1){
            System.out.println("you choice : Paper!");
        }
        else if (userinput==2){
            System.out.println("you choice : Scissor!");
        }
    }
}
