package BrainwaveConverter;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class Driver {
	private static ArrayList<String> timeTemp = new ArrayList<String>();
	private static int count = 0;
	public static void main(String[] args){		
		String results = "";
		System.out.println("TYPE WHICH TEXT YOU WOULD LIKE ME TO LOOK AT:");
		Scanner data = new Scanner(System.in);
		String dataFile = data.next();
		data.close();
		Scanner scan1;
		Scanner scan2;
		try {
			scan1 = new Scanner(new File("P:/ITAP/Times/" +"Cheyne" +dataFile+".txt"));
			scan2 = new Scanner(new File("P:/ITAP/neuro/R/NeuroEx/" + "Cheyne"+dataFile+".Rdata.txt"));
			 String trials = scan1.nextLine();
			scan1.close();
			String[] timesTemp = trials.split("\\s");
			for(int i=0;i<timesTemp.length;i++){timeTemp.add(timesTemp[i]);}
			String line = "";
			while(count != timeTemp.size()-1){
					line = scan2.nextLine();
			        results += results(line);			        
			    }
			scan2.close();
		} catch (FileNotFoundException e) {
			System.out.println("Could not find Text File.");
			e.printStackTrace();
		}
		System.out.println(results);
	}
	
	public static String results(String data){
		if(data.contains("#") || data.contains("time"))return "";
		String results = "";
		String[] dataTemp = data.split("\\s");
		if(Double.valueOf(dataTemp[1]) < Double.valueOf(timeTemp.get(count))){}
		else if(Double.valueOf(dataTemp[1]) >= Double.valueOf(timeTemp.get(count)) && Double.valueOf(dataTemp[1]) <= Double.valueOf(timeTemp.get(count+1))){
			results +=dataTemp[1]+","+dataTemp[2]+","+dataTemp[3]+","+dataTemp[4]+","+dataTemp[5]+","+dataTemp[6]+","+dataTemp[7]+","+dataTemp[8]+","+dataTemp[9]+","+"'Question "+(count+1)+"'"+"\n";
		}
		else{
			if(count == timeTemp.size()-1){
				count++;
			}
			else{
				results +=dataTemp[1]+","+dataTemp[2]+","+dataTemp[3]+","+dataTemp[4]+","+dataTemp[5]+","+dataTemp[6]+","+dataTemp[7]+","+dataTemp[8]+","+dataTemp[9]+","+"'Question "+(count+2)+"'"+"\n";
			}
			count++;}
		
		return results;
	}
}
