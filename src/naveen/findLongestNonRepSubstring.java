package naveen;

import java.util.*;

public class findLongestNonRepSubstring {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String inputtext = sc.nextLine();
        String input[] = inputtext.split("");
        System.out.println(Arrays.toString(input));
        int maxRep = findNonRep(input);
        System.out.println("Max Rep of Substring is " + maxRep);
    }

    private static int findNonRep(String input[]) {
        if (input.length < 2) {
            return input.length;
        }
        int maxRep = 1;int finalMaxRep=1;String output="";
        //output+=
        for (int i = 1; i < input.length; i++) {
            int j = i;
            int flag = 0;
            while (j > 0) {
                if (input[i].equals(input[j - 1])) {
                    flag = 1;
                    maxRep=1;
                    //break;
                }
                j--;
            }
            if(flag==0){
                maxRep++;
            }
            System.out.println(input[i]);
            System.out.println(maxRep);
            if(maxRep>finalMaxRep)
                finalMaxRep=maxRep;
        }

        return finalMaxRep;
    }

}
