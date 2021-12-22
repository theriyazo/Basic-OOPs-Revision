import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a number to check whether it is armstrong  number or not");
//        int num = in.nextInt();
        for(int i=100; i<1000; i++){
            if (isArmstrong(i)){
                System.out.print(i+" ");
            }
        }
//        boolean is = isArmstrong(num);
//        System.out.println(is);


    }
    static boolean isArmstrong(int n){
        int original = n;
        int ans=0;

        while (n>0){

            int rem = n%10;
            int cubeNum = Cube(rem);

            ans = ans + cubeNum;

            n /= 10;

        }
        if (ans == original){
         return true;
        }
        else
            return false;
    }

    static int Cube(int number){
        int cubeNum = number * number * number;
        return cubeNum;

    }
}
