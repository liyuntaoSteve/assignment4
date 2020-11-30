import java.util.Scanner;

public class Q3 {
    public static void main(String[]args){
        while (true) {
            System.out.println("Enter a value between 0 and 5: ");
            Scanner myObj = new Scanner(System.in);//scan from our input
            String input=myObj.nextLine();
            if (input != null) {
                try {
                    if (Integer.parseInt(input) == -1) {
                        System.exit(0);//stop program if -1
                    } else if (Integer.parseInt(input) >= 0 && Integer.parseInt(input)<= 5) {
                        fillCircle(0.5, 0.5, 0.5, Integer.parseInt(input));
                    }
                } catch (Exception e) {
                    System.out.println("Put an integer!!");//if input is anything else from integer
                }
            }
        }
    }

    private static void fillCircle(double x, double y, double radius, int level) {
        if(level<=0){
            StdDraw.circle(x, y, radius);//now draw it since level is 0
        }else{
            fillCircle(x, y, radius / 3, level - 1);//recuse with curent level
            double angle = 0;//start angle form 0
            int i=1;//Each of those smaller circular areas could also be drawn as a set of 7 even smaller circles:
            while(i<7){
                angle=angle + Math.PI / 3;//angles should change by (PI/3 radians)
                // fill that region (roughly) with a set of 7 circles, each 1/3 the size of the big circle
                fillCircle(x + radius / 1.5 * Math.cos(angle), y + radius / 1.5 * Math.sin(angle), radius / 3, level - 1);
                i++;
            }
        }
    }
}
