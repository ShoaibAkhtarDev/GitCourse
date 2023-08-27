import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static int[] medicinePriceForGivenDisease(String desease,Medicine[]arr){
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(desease.equalsIgnoreCase(arr[i].getDesease()))
            {
                list.add(arr[i].getPrice());
            }
        }
       int arr1[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            arr1[i]= list.get(i);
        }
        Arrays.sort(arr1);
        return arr1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 4 medicine objects");
        Medicine arr[]=new Medicine[4];
        for(int i=0;i<4;i++)
        {
           String medicineName=sc.nextLine();
           String batchNo=sc.nextLine();
           String desease=sc.nextLine();
           int price=sc.nextInt();
           sc.nextLine();
           Medicine obj=new Medicine(medicineName,batchNo,desease,price);
           arr[i]=obj;
        }
        System.out.println("Enter the deasese ");
        String deasese=sc.nextLine();
        //medicinePriceForGivenDisease(deasese,arr);
        System.out.println("Medicine Price in ascending order");
       // for(int a : medicinePriceForGivenDisease(deasese,arr))
            System.out.print(Arrays.toString(medicinePriceForGivenDisease(deasese,arr)));
    }
}
