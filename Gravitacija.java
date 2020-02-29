import java.util.Scanner;

public class Gravitacija{
	
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        System.out.println(((6.674E-11) * 
        (5.972E24))/((6.371E6) + v * v));
        
	}
}
    