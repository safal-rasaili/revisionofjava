//Question9
//Wap to print the area and perimeter of a circle

import java.util.Scanner;

class Areaperi {
    public static void main(String[] args) {
        System.out.println("eneter a radius:");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int area = (22/7)*r*r;
        int perimeter = 2*(22/7)*r;
        System.out.println("area of a circle is:"+ area);
        System.out.println("perimeter of circle:"+ perimeter);
    }
}
