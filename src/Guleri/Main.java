package Guleri;

//lucky number generator;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("\033[1;34m Do you want to play the game of luck.\n" +
                "Are you ready guys.y or n\n\033[0m");
        String y_n = input.nextLine();
        if (y_n.equals("y") || y_n.equals("Y")) {
            System.out.println(" enter your favourite two numbers");
            int num = input.nextInt();
            num = num + 10 / 5;
            int num1 = input.nextInt();
            num1 = num + 9 * 30;
            System.out.println("\033[1;32m this is your lucky number:" + num1);



            }
         else {
            System.out.println("thanks to visit");
        }

                String name = JOptionPane.showInputDialog("welcome,enter your name");
                String message =String.format(name+"thank you");

    }


}
