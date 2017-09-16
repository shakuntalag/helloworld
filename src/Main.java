import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		
		int sid;
		String sname;
		Date d;
		double avg;
		Scanner sc=new Scanner(System.in);
		int l;
		l=sc.nextInt();
		StudentGroup(int length);
		for(int i=0;i<l;i++) {
			sid=sc.nextInt();
			sname=sc.next();
			d=sc.next();
			avg=sc.nextDouble();
			Student(int sid, String sname, Date d, double avg);
			
		}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
	}

}
