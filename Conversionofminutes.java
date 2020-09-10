
package conversionofminutes;

import java.util.Scanner;

public class Conversionofminutes {

    public static void main(String[] args) {
        int m;
        float d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of minutes to be converted: ");
        m=sc.nextInt();
        float yf= (float) (m/525680);
        int y=(int) m/525680;
        yf=(m/525680);
        d =(yf-y)*365;
        System.out.println(m+" mintues is equal to "+y+" years and "+d+" days.");
    }
    
}
