
package main;

public class Check {
    public boolean checking(String a)
    {
        int[] positions = {1, 3, 7, 9, 1, 3, 7 ,9 ,1 ,3};
        if (a.length() != 11) return false;
        int sum = 0;
        for (int i = 0; i < 10; i++)
        sum += Integer.parseInt(a.substring(i, i+1)) * positions[i];
        
        int checkSum = Integer.parseInt(a.substring(10, 11));
        sum = (10 - sum%10)%10;     
        return (sum == checkSum);
     }
}
