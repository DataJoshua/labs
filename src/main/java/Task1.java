import customExceptions.InfiniteNumberException;
import customExceptions.NotAnumberException;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(f(2.0));
    }
    public static Double f(Double x){
        Double result;

        // generate a random number from -50 to 50

        ArrayList<Double> breach = new ArrayList();

        for (Double i = -50.0; i <= 50; i++) {
            breach.add(i);
        }
        Double a = breach.get((int)(Math.random() * breach.size()));

        if(x < 0){
            Double sin = Math.sin((1/x -a) + 4);

            try{
                result = x + sin*sin;
                if(result.isNaN()){
                    throw  new NotAnumberException("is not a number");
                }
            }catch (NotAnumberException e){
                System.out.println(e.getMessage());
                result = 0.0;
            }
        }
        else{
            try{
                result = (a*x)/(Math.sqrt(a*a - x*x));
                if(result.isInfinite()){
                    throw new InfiniteNumberException("the result is infinite!");
                }
                else if(result.isNaN()){
                    throw new NotAnumberException("the expresion is not a number");
                }
            }
            catch(InfiniteNumberException e){
                System.out.println(e.getMessage());
                result = 0.0;
            }
            catch(NotAnumberException e){
                System.out.println(e.getMessage());
                result = 0.0;
            }
        }
        return result;
    }
}
