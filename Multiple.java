 //Question7
 //Wap in java that takes a number as input and prints its multiplication table upto 10
 import java.util.Scanner;
 class Multiple {
    public static void main(String[] args) {
        System.out.println("enter a number:");
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int i;
        int m = 1;
              System.out.println("multiplication of " +n+"is given below:");
        for(i=1;i<=10;i++){
        
  
            m = i*n;
  System.out.println(n+"*"+i+"="+m);
    }
    }
    
}
