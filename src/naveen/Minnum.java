package naveen;

public class Minnum {
    
    int min(int arr[]){
       int min=arr[0];
       /*
       for(int i=0;i<arr.length;i++){
               if(min>arr[i])
               min=arr[i];
       }*/
       //using for each loop
       for(int i:arr){
       if(min>i)
       min=i;
       }
       return min;
    }
    
    public static void main(String[] args) {
        Minnum obj=new Minnum();
        int arr[]={21,55,22,5,88,87};
        int min = obj.min(arr);
        System.out.println("Minimum number is "+min);
    }
    
}
