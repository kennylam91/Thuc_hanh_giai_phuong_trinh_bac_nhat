import java.util.Scanner;
public class LinearEquationResolver {
    public static void main(String[] args){
        double result;
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a*x+b = 0' , please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a=scanner.nextDouble();
        System.out.println("b: ");
        double b=scanner.nextDouble();
        if(a!=0) {
            result=-b/a;
            System.out.printf("Equation pass with x= %f!",result);
        }
        else{
            if(b==0) System.out.println("The solution is all x");
            if(b!=0) System.out.println("No solution");
        }

    }


}
