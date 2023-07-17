import java.util.*;
public class triangle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat(),b=sc.nextFloat(),c=sc.nextFloat();
        float s=(a+b+c)/2;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",area);
    }
}