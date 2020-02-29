package Assignment_2;
public class Main {
    public static void main(String[] args){
        Fibonacchi fibonacchi=new Fibonacchi();
        int n=10;
        for(int i=0; i<=n; i++)
            System.out.println(fibonacchi.fib(i));
    }
}
