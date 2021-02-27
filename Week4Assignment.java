package com.Week4Assignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Week4Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayList<String> employeeNames = new ArrayList<String>();
employeeNames.add("Meko");
employeeNames.add("Amelia");
employeeNames.add("Phoenix");
employeeNames.add("Audie");
employeeNames.add("Price");


Set<Integer> ids = new HashSet<Integer>();
ids.add(5);
ids.add(30);
ids.add(34);
ids.add(37);
ids.add(11);


Map<Integer, String> employeeMap = new HashMap<Integer, String>();

int i = 0;
for(int Ids : ids) {
	employeeMap.put(i, employeeNames.get(i));
	i++;
}

System.out.println(employeeMap);

Set<Integer> employeeMapKeys = employeeMap.keySet();

for(int key : employeeMap.keySet()) {
	System.out.println("The name assigned to ID " + key + " is " + employeeMap.get(key));
}

StringBuilder idsBuilder = new StringBuilder();

for(int id : ids) {
	idsBuilder.append(id + "-");
}

System.out.println(idsBuilder.toString());

StringBuilder namesBuilder = new StringBuilder();

for(String names : employeeNames) {
	namesBuilder.append(names + " ");
}
System.out.println(namesBuilder.toString());
	}
}
