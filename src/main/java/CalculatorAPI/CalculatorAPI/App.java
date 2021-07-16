package CalculatorAPI.CalculatorAPI;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        CalculatorAPI obj=new CalculatorAPI();
       int sum= obj.addition(1, 1);
        System.out.println( "SUM::"+sum );
    }
}
