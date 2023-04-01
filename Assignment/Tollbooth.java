import java.util.Scanner;
 class TollBooth{
     int cars;
     double cash;
    public TollBooth() {
        cars = 0;
        cash = 0.0;
    }

    public void payingCar() {
        cars++;
       cash =cash+0.5;
    }

    public void noPayCar() {
        cars++;
    }

    public void display() {
        System.out.println("Total cars: " + cars);
        System.out.println("Total cash: " + cash);
    }

    public static void main(String args[]) {
        TollBooth obj = new TollBooth();
        Scanner sc = new Scanner(System.in);
       String input;

        System.out.println("Press 'p' to count a paying car\nPress'n' to count a non-paying car\n press 'e' to exit.");

        do  {
             input = sc.nextLine();

            switch (input.toLowerCase()) {
                case "p":
                    obj.payingCar();
                    System.out.println("Added paying car.");
                    break;
                case "n":
                    obj.noPayCar();
                    System.out.println("Added non-paying car.");
                    break;
                case "e":
                    obj.display();
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
		while(!input.toLowerCase().equals("e"));
    }
}