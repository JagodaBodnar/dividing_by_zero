public class DividingByZero {
    public static void main(String[] args) {
        try{
            System.out.println(divide(30,0));
        }catch(ArithmeticException e){
            System.out.println("You can't divide by 0");
        }finally {
            System.out.println("Division is fun");
        }
    }
    public static double divide(int a, int b){
        return (double) a /b;
    }
}
