public class Printer {
    private int toner;
    private int numSheets;


    public Printer (int toner, int numSheets){
        this.toner= toner;
        this.numSheets=numSheets;
    }

    public int getToner(){
        return this.toner;
    }

    public int getNumSheets(){
        return this.numSheets;
    }

    public void print(int copies, int pages){
        int printed =(copies * pages);
        if (this.numSheets - printed >= 0) {
            this.numSheets -= printed;
            this.toner -= printed;
            System.out.println(numSheets);
        } else {
            System.out.println("Add more paper");
        }
    }

    public void refill(int copies, int pages){
        int printed=(copies * pages);
        this.numSheets += printed;
    }

}
