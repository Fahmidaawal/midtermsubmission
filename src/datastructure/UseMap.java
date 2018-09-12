package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<String> student1 = new ArrayList<>();
		student1.add("shama");
		student1.add("101");
		student1.add("22");
		student1.add("10-10-1992");

		List<String>student2 = new ArrayList<>();
		student2.add("alif");
		student2.add("102");
		student2.add("23");
		student2.add("10-08-1993");

		List<String>student3 = new ArrayList<>();
		student3.add("roy");
		student3.add("103");
		student3.add("25");
		student3.add("10-05-1990");


		Map<String,List<String>> list = new LinkedHashMap< String, List<String>>();
		list.put("student1",student1);
		list.put("student2",student2);
		list.put("student3",student3);

		for(Map.Entry key: list.entrySet()){
			System.out.println(key.getKey()+ " "+ key.getValue());
		}


	}

}
