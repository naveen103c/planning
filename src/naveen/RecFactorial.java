package naveen;

public class RecFactorial {

    static long n1 = 0, n2 = 1, n3 = 0;

    public static void main(String[] args) {
        //factorial
        //System.out.println(factorial(6));

        //fibonacci    
        int count = 50;
        System.out.print(n1 + " " + n2);//printing 0 and 1      
        printFibo(count - 2);//n-2 because 2 numbers are already printed     
    }

    private static void printFibo(int range){
        if(range>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;           
            System.out.println(" "+n3);
             printFibo(range-1);
        }
    }
    
    private static int factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

}
