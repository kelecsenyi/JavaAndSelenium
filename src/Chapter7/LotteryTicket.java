package Chapter7;

import java.util.Random;

public class LotteryTicket {
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String args[]){
        int[] ticket = generateNumber();
        printTicket(ticket);
    }
    public static int[] generateNumber(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for (int i = 0; i<LENGTH; i++){
            int randomNumber;
            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMBER)+1;
            }while(search(ticket,randomNumber));

            ticket[i] = randomNumber;
        }
        return ticket;
    }

    /**
     *
     * @param array
     * @param numberTosearcFor
     * @return
     */
    public static boolean search(int[] array, int numberTosearcFor){
        for(int value:array){
            if(value==numberTosearcFor){
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param ticket
     */
    public static void printTicket(int ticket[]){
        for (int i= 0; i<LENGTH;i++){
            System.out.print(ticket[i]+" | ");
        }
    }
}