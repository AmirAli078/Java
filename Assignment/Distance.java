import java.util.Scanner;
class Distance{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
int distance;
String unit;
int conversion;
  System.out.print("Enter the distance: ");
  distance = sc.nextInt();
  System.out.print("Enter the unit of ditsnace\n 1:inches\n 2:millimeters \n 3:kilometers ");
  unit = sc.next();		
 System.out.print("select the option to convert: \n 1 to convert to millimeters \n 2 to convert to kilometers: ");
 conversion = sc.nextInt();
         switch(unit) {
            case "inches":
                if(conversion == 1) {
                    System.out.println(distance + " inches = " + distance * 25.4 + " millimeters");
                } else {
                    System.out.println(distance + " inches = " + distance * 0.0000254 + " kilometers");
                }
                break;
            case "millimeters":
                if(conversion == 1) {
                    System.out.println(distance + " millimeters = " + distance * 0.0393701 + " inches");
                } else {
                    System.out.println(distance + " millimeters = " + distance * 0.000001 + " kilometers");
                }
                break;
            case "kilometers":
                if(conversion == 1) {
                    System.out.println(distance + " kilometers = " + distance * 39370.1 + " inches");
                } else {
                    System.out.println(distance + " kilometers = " + distance * 1000000 + " millimeters");
                }
                break;
            default:
                System.out.println("Invalid input.");
        } 
	}
}