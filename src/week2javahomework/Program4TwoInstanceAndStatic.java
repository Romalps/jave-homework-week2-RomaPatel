package week2javahomework;

/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program4TwoInstanceAndStatic {
    //4.1 Declare two instance variables.
    String name = "Prime";
    String surname = "Testing";
    //4.1 Declare two static variables.
    static boolean a = true;
    static boolean b = false;

    //4.2 Declare one instance method.
    //4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
    public void instanceMethod() {
        System.out.println(name);
        System.out.println(surname);
        System.out.println(a);
        System.out.println(b);
    }

    //4.3 Declare one static method.
    //4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
    public static void staticMethod() {
        Program4TwoInstanceAndStatic program4 = new Program4TwoInstanceAndStatic();
        System.out.println(program4.name);
        System.out.println(program4.surname);
        System.out.println(a);
        System.out.println(b);
    }

    //4.5 Declare the Main method.
   // 4.6 Call both instance and static methods into the Main method and run the programme.
    public static void main(String[] args) {
        Program4TwoInstanceAndStatic program4 = new Program4TwoInstanceAndStatic();
        program4.instanceMethod();
        staticMethod();
    }

}
