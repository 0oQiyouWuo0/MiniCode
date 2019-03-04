package MiniCoding.Test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void printNumber()
    {
		for(int i=1;i<=100;i++){
			if(divisibleByThree(i) && divisibleByFive(i)){
				System.out.println("FizzBuzz");
			}else if(divisibleByThree(i)){
				System.out.println("Fizz");
			}else if(divisibleByFive(i)){
				System.out.println("Buzz");
			}else{
				System.out.println(i);
			}
		}
	
    }
    
	public static boolean divisibleByThree(int i) {
		if(i%3==0 || Integer.toString(i).indexOf("3") != -1){
			return true;
		}
		return false;
	}
	
	public static boolean divisibleByFive(int i) {
		if(i%5==0 || Integer.toString(i).indexOf("5") != -1){
			return true;
		}
		return false;
	}
}
