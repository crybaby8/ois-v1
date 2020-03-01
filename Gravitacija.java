import java.util.Scanner;

public class Gravitacija{
	
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        double g = gravitacija(v);
        izpis(v, g);
	}
	
	public static double gravitacija(int v) {
	    return (((6.674E-11) * (5.972E24)) / ((6.371E6 + v) * (6.371E6 + v)));
	}
	
	public static void izpis(int v, double gravitacija) {
	    System.out.println(v);
	    System.out.println(gravitacija);
	    return;
	}
}
    