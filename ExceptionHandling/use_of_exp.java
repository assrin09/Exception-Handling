package ExceptionHandling;

import java.util.Scanner;

public class use_of_exp {

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        use_of_exp obj=new use_of_exp();
        try
        {
            obj.demo();
        }
        catch (AasrinEx e)
        {
            System.out.println("MSG="+e.getMessage());
        }

    }

    public void demo() throws AasrinEx
    {
        int num1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Numbers");
        num1=sc.nextInt();
        if(num1>0)
        {
            throw new AasrinEx("It is an Positive Number");
        }
        else
        {
            throw new AasrinEx("It is an Negative Number");
        }
    }
}
