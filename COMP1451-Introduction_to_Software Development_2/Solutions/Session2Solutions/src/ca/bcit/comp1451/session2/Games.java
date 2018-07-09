/**
 * 
 */
package src.ca.bcit.comp1451.session2;

/**
 * @author Rana
 *
 */

import java.util.Scanner;
import java.util.ArrayList;
/**
 * @author Rana Alsammarraie
 *
 * Jan 2, 2017
 */
public class Games {
   public static final int ROUND_START = 2;
   public static final int ROUND_END = 12;
    private Scanner input;

    /**
     * Games Constructor
     *
     */
    public Games(){
        input = new Scanner(System.in);
    }

    /**
     * Method textParser
     *
     */
    public void textParser(){
      
        ArrayList<String> wordsList = new ArrayList<String>();
        ArrayList<Integer> numbersList = new ArrayList<Integer>();
        ArrayList <Double> doublesList = new ArrayList<Double>();

        while(input.hasNext() ){
            if(input.hasNextInt()){
                int num = input.nextInt();
                numbersList.add(num);
          //    numbersList.add(input.nextInt());
            }
            else if(input.hasNextDouble()){
               
                double value = input.nextDouble();
                doublesList.add(value);
           //   doublesList.add(input.nextDouble());
            }
            else{
               
                String word = input.next();
                wordsList.add(word);
              // wordsList.add(input.next());  
            }

        }
        System.out.println(" number of words "+wordsList.size());
        System.out.println(wordsList);
        System.out.println(" number of numbers "+numbersList.size());
        System.out.println(numbersList);
        System.out.println(" number of doubles "+doublesList.size());
        System.out.println(doublesList);
    }

    /**
     * Method playChicage
     *
     */
    public void playChicage(){
        Die die1 = new Die();
        Die die2 = new Die();
        int die1Value = 0;
        int die2Value = 0;
        int sum = 0;
        int points = 0;
        for(int round = ROUND_START; round<=ROUND_END; round++){
            System.out.println(" round number " + round);
            die1Value = die1.roll();
            die2Value = die2.roll();
            System.out.println(" first die value was "+ die1Value);
            System.out.println(" second die value was "+ die2Value);
            sum = die1Value+ die2Value;

            if(sum == round){
                points++;
                System.out.println(" points earned "+ points);
            }

        }
        System.out.println(" points earned "+ points);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Games game = new Games();
        System.out.println("enter a line of text");
        game.textParser();
        System.out.println("Playing Chicago");
        game.playChicage();

    }

}
