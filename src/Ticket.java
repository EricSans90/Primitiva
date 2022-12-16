import java.util.Arrays;

public class Ticket {
    private Block[] blocks;

    public Ticket(int numberBlocks){
        this.blocks =new Block[numberBlocks];
        for (int i=0; i<numberBlocks;i++){
            this.blocks[i]=new Block(6);
        }
    }
    @Override
    public String toString() {
        int i=0;
        for (i=0; i<this.blocks.length-1;i++){
            // to test System.out.println("Block number: "+(i+1));
            System.out.print(this.blocks[i]+"\n");
        }
        // to test System.out.println("Block number: "+(this.blocks.length));
        System.out.println(this.blocks[this.blocks.length-1]);
        return "";
    }

    public void printUsedNumbers (){
        int usedNumbers[];
        // Maximum size it can get it's:
        usedNumbers=new int[49];
        int indexUsedNumbers=0, i=0, j=0;
        for(i=0;i<this.blocks.length;i++){
            for(j=0;j<this.blocks[i].getNumbers().length;j++){
                if(!checkRepeat(this.blocks[i].getNumbers()[j],usedNumbers)){
                    usedNumbers[indexUsedNumbers]=this.blocks[i].getNumbers()[j];
                    //System.out.print(usedNumbers[indexUsedNumbers]+", ");
                    indexUsedNumbers +=1;
                }
            }
        } Arrays.sort(usedNumbers);
        for (int k=0;k<usedNumbers.length;k++){
            if (usedNumbers[k]!=0){
                System.out.print(usedNumbers[k]+", ");
            }
        }
    }

    public boolean checkRepeat(int numberToCheck, int[] array){
        for (int j=0; j<array.length;j++){
            if (numberToCheck==array[j]){
                return true;
            }
        }
        return false;
    }
}
