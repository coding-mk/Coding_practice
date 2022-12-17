package ScalerCodingQuestion;

import java.util.Scanner;

public class IsItPrime {

	public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count=0;
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                if(i == num/i){
                    count+=1;
                }else{
                    count+=2;
                }
            }
        } 
        if(count==2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        scan.close();
    }
}
