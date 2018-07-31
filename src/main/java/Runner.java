public class Runner {
    public static void main(String [] args){
        Bottle newBottle = new Bottle(100);
        newBottle.drink();
        Printer newPrinter = new Printer(30, 30);
        newPrinter.print(5,5);
        newPrinter.refill(250, 5);
    }
}

