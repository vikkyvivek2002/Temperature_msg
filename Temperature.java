import java.util.*;
public class Temperature {

	public static void main(String[] args) {
        
		Scanner s = new Scanner(System.in);
		System.out.println("enter the temperature ");
		int temp = s.nextInt();
		s.close();
		if(temp<0)
		System.out.println("Freezing Weather");
		else if(temp>=0 && temp <10)
			System.out.println("very cold weather");
		else if(temp>=10 && temp<20)
			System.out.println("cold weather");
		else if(temp>=20 && temp<30)
			System.out.println("Normal in temperature ");
		else if(temp>=30 && temp <40)
			System.out.println("Its Hot");
		else
			System.out.println("Its very Hot");
	}

}
