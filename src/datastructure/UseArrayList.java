package datastructure;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<String> Students = new ArrayList<>();
		Students.add("students1");
		Students.add("students2");
		Students.add("students3");
		Students.add("students4");

		System.out.println(" Retrieving elements from ArrayList :" + Students);

		System.out.println("Peek first element :"+ Students.get(0));


		System.out.println("Remove element at index 3:"+ Students.remove(3));

		System.out.println("Re-retrieving elements from ArrayList:" + Students);

		System.out.println("User of Iterator using while loop :");

		Iterator it = Students.iterator();
		while (it.hasNext()){

			System.out.println("from white loop :"+it.next());
		}



		//ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

		/*connectToSqlDB.insertDataFromArrayListToSqlTable(Students,"Students", "Name");
		for (Students st : name){
			System.out.println(st);
		}*/





	

	}

}
