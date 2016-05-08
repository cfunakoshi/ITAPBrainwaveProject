
import java.util.Scanner;
	public class Calculator2 {
		public static void main(String[] args) {
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter your initial time: ");
			double init = reader.nextDouble();
			System.out.println("Enter your array of times: ");
			String trials = reader.next();
			String[] temp = trials.split(",");
			double[] times = new double[temp.length];
			for(int i=0;i<temp.length;i++){
				times[i] = Double.valueOf(temp[i]);}
			String results = convert(init, times);
			reader.close();
			System.out.println("Your converted times are: ");
			System.out.println(results);}
		public static String convert(double init,double[] times){
			String results = "";
			init = init*60;
			results += init;
			for(int i=0;i<times.length;i++){
				double temp = init + times[i]; 
				times[i] = temp;
				init = times[i];}
			for(int i=0;i<times.length;i++){results += " " + Double.toString(times[i]);}
			return results;}
	}
