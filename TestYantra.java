package C;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.*;

public class TestYantra{
	static String c_name= "Test Yantra";
	static String loc= "Vadapalani";
	static List <Engineer> e;
	static int count=1;
	static Scanner s=new Scanner(System.in);
	static boolean b;
	
	
	public  void addEngineer(String name,String domain,double sal,int id) {  
		e.add(new Engineer(name,domain,sal,id));
	}
	public void removeEngineer() {
		
		for (Engineer engineer : e) {
			
			System.out.println(count+++"."+engineer);
		}
		System.out.println("enter the number which wanted to be removed");
		e.remove(s.nextInt()-1);
	}
	public static void testerlist() throws IOException {
		fw= new FileWriter("D:\\tes.txt");
		fw.write("\t"+c_name+"\t"+"\n"+loc+"\n");
		for (int i = 0; i <e.size(); i++) {
			Object o=e.get(i);
			Engineer eng=(Engineer)o;
			
				
				if (eng.domain.equals("tester")) {
					fw.write(e.get(i)+"\n");
				}
				fw.flush();
			
		}	
	}
	public static void developerList() throws IOException {
		fw= new FileWriter("D:\\dev.txt");
		fw.write(c_name+"\n"+loc+"\n");
		for (int i = 0; i <e.size(); i++) {
			Object o=e.get(i);
			Engineer eng=(Engineer)o;
			
				
				if (eng.domain.equals("developer")) {
					fw.write(e.get(i)+"\n");
				}
				fw.flush();
		}	
	}
	static Writer fw; 
	public static void main(String[] args) throws IOException {
		TestYantra t=new TestYantra();
		e=new ArrayList<Engineer>();
		e.add(new Engineer("nikki","developer",300000,1));
		e.add(new Engineer("kamalika","developer",280000,2));
		e.add(new Engineer("Indragith","tester",200000,3));
		e.add(new Engineer("vijay","tester",100000,4));
		do {
		System.out.println("1.Add Engineer\n2.Remove Engineer\n3.Test Engineer list\n4.Developer list\n5.Exit");
		switch (s.nextInt()) {		
		case 1: {
			s.nextLine();
			System.out.println("enter name");
			String name=s.nextLine();
			System.out.println("enter domain");
			String domain=s.nextLine();
			System.out.println("enter salary");
			double sal=s.nextDouble();
			System.out.println("enter Id");
			int id=s.nextInt();
			
			
			t.addEngineer(name,domain,sal,id);
			System.out.println("inserted succesfully");
			b=true;
			break;}
		case 2: {
			t.removeEngineer();
			System.out.println("removed successfully");
			b=true;
			break;}
		case 3: {
			testerlist();
			System.out.println("check tes file in e drive");
			b=true;
			break;}
		case 4: {
			developerList();
			System.out.println("check dev file in e drive");
			b=true;
			break;}
		case 5: {
			System.out.println("\t thankyou\t");
			b=false;
			break;}
		default:
			System.out.println("enter a proper number");
		}
	}while(b);
	
	}	
}
