package Guleri;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){


            int rows, num = 1, i, j;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number of rows for floyd's triangle:");
            rows = input.nextInt();
            System.out.println("Floyd's triangle");
            System.out.println("---------------------------");
            for (i= 1; i<= rows; i++) {
                for (j = 1; j <= i; j++) {
                    System.out.print(num + " ");
                    num++;
                }
                System.out.println();
            }
        }
    }
