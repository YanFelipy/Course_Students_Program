package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		Set<Student> set = new HashSet<>();
		System.out.print("How many students for course A?");
		int courseA = sc.nextInt();
		
		for (int i=0;i<courseA; i++) {
			Integer numberID = sc.nextInt();
			set.add(new Student(numberID));
		}
		System.out.print("How many students for course B?");
		int courseB = sc.nextInt();
		for (int i = 0;i<courseB; i++) {
			Integer numberID = sc.nextInt();
			set.add(new Student(numberID));
		}
		System.out.print("How many students for course C?");
		int courseC = sc.nextInt();
		
		for (int i = 0;i<courseC; i++) {
			Integer numberID = sc.nextInt();
			set.add(new Student(numberID));
		}
		
		System.out.print("Total Students: " + set.size());
		
		
		
		
		sc.close();

	}

}
