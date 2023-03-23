package week2javahomework;
/*Write a Java program to compute the specified expressions and print the
output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output : 2.138888888888889
 */
public class Program12PrintExpression {
    public static void main(String[] args) {

        Program12PrintExpression t = new Program12PrintExpression();
        t.printExpression();
    }
    // printing expression
    public  void printExpression(){
        double a = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5 ));
        System.out.println(a);
    }
}
