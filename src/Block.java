import java.util.Arrays;
import java.util.Random;

public class Block {

    private int numbers [];
    // a)
    public Block(int quantNumbers){
        int finalQuant=quantNumbers;
        if (quantNumbers<=6){
            finalQuant=6;
        } else if (quantNumbers>=49) {
            finalQuant=49;;
        }
        numbers = new int[finalQuant];
        //FALTE ADD QUANTITIY OF RANDOM NUMBERS
        int possibleNumber;
        boolean repet=true;
        for (int i=0; i<quantNumbers;i++){
           repet=true;
           while (repet){
               //easy way to generate numbers between nextInt(upperbound-lowerbound) + lowerbound;
               possibleNumber=new Random().nextInt(48)+1;
               if (!checkRepeat(possibleNumber,finalQuant)){
                   this.numbers[i]=possibleNumber;
                   repet=false;
               }
           }
        }
    }
    public Block(int[] quantNumbers){
        numbers=quantNumbers;
    }

    public boolean checkRepeat(int numberToCheck, int arrayLength){
        for (int j=0; j<arrayLength;j++){
            if (numberToCheck==this.numbers[j]){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        int i=0;
        for (i=0; i<this.numbers.length-1;i++){
            System.out.print(this.numbers[i]+", ");
        }
        System.out.println(this.numbers[this.numbers.length-1]);
        return "";
    }
    public int[] getNumbers() {
        return numbers;
    }


}
