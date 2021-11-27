public class Testant {
 
    /* let's test the public option */
    public static void test_one(){
        System.out.println("Can be Access in every class");
    }

    protected static void test_two(){
        System.out.println("Can be Access in Herite class or main class");
    }

    private static void test_me(){
        System.out.println("Can be Access only in main class");
    }
}