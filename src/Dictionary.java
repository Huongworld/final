import java.util.Arrays;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args){
        //Enter 10 words: kiwi pineapple apple banana orange grapes watermelon cherry strawberry melon

                //Original Order:kiwi pineapple apple banana orange grapes watermelon cherry strawberry melon

        Scanner scanner = new Scanner(System.in);
        String [] org = new String[10];
        System.out.println("Please enter 10 fruits:");
        for(int i=0; i < 10; i++) {
            org[i]= scanner.next();
        }

        System.out.print("Original order:");
        for(int i =0; i < (org.length); i++) {

            System.out.println(org[i]);
        }

        //Ascending order
        String temp="";
        String[] ascendingOrder = new String[10];
        for(int i =0; i < (org.length-1); i++){
            for(int j =0; j < (org.length-i)-1; j++){
                if(org[j].compareToIgnoreCase(org[j+1])>0){
                    temp = org[j];
                    org[j] = org[j+1];
                    org[j+1] = temp;


                }
            }

        }


                 //Reversed Alphabetical Order:watermelon strawberry pineapple orange melon kiwi grapes cherry banana apple
        System.out.println("Ascending order");
        for(int i =0; i < (org.length); i++){
            System.out.println(org[i]);
        }


        //desending order
        System.out.println("Descending order");
        for(int i = org.length-1; i>=0; i--){
            System.out.println(org[i]);
        }





    }
}
