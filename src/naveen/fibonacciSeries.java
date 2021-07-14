package naveen;
public class fibonacciSeries{
    fibonacciSeries(){
    }
    public static void main(String args[]){
        printfibaonacci(10);
    }
    private static void printfibaonacci(int range){
        int pre=0;int next=1;
        System.out.print(pre+" ");
        System.out.print(next+" ");        
        
        for(int i=0;i<(range-2);i++){
            int temp=next;
            next=pre+next;
            pre=temp;
            System.out.print(next+" ");        
        }
    }
}