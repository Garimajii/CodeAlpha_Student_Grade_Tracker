//Java program to demonstrate the working of Student Grade Tracker....
package mypack;
//importing ArrayList and Iterator Classes.... 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentGrade {
	public static void main(String[] arr) {
		
		Scanner sc = new Scanner(System.in);
		
		/*Creating the ArrayList class object
		 and object is of integer type
		 */
		ArrayList<Integer> grades=new ArrayList<>();
		
		//Printing grades of student
		System.out.println("Enter student grades (enter -1 to finish):");
		
		int grade;
		while(true) {
			grade=sc.nextInt();
			if(grade==-1)
			{
				break;
			}
			grades.add(grade);
			
		}
		
		//Traversing using Iterator...
		Iterator it = grades.iterator();
		while(it.hasNext()) {
			System.out.println("Grades are: "+it.next());
		}
		
		int sum=0;
		int highest=grades.get(0);
		
		int lowest=grades.get(0);
		
		//obtaining number of elements...
		System.out.println("there are "+grades.size()+" elemnets");
		
		for(int i=0;i<grades.size();i++)
		{
			sum+=grades.get(i);
			if(grades.get(i)>highest)highest=grades.get(i);
			if(grades.get(i)<lowest)lowest=grades.get(i);
		}
		
		double average=(double)sum/grades.size();
		
		//Printing Average, Highest, Lowest grades of student....
		System.out.println("Average grade:"+average);
		System.out.println("Highest grade:"+highest);
		System.out.println("Lowest grade:"+lowest);
		
	}

}
