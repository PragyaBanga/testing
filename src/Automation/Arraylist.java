package Automation;

import java.util.ArrayList;

import java.util.Collections;
public class Arraylist {

	public static void main(String[] args) {

		// Integer | Float | String | Boolean |

		ArrayList<Integer> list = new ArrayList<Integer>();
//		ArrayList<String> list1 =new ArrayList <String>();	
//		ArrayList<Boolean> list2 =new ArrayList <Boolean>();	

       // we will add elements
		list.add(0);
		list.add(1);
		list.add(2);
		System.out.println(list);
       // we will get elements
		list.get(0);
		list.get(1);

		int element = list.get(1);
		System.out.println(element);
		// add element in between
		list.add(1, 8);

		System.out.println(list);
		// set element or change
		list.set(2, 9);
		System.out.println(list);
		// delete element
		list.remove(3);
		System.out.println(list);
		//size of the arraylist
		int size=list.size();
		System.out.println(size);
		for
		(int i=0; i<list.size();i++)
			System.out.print(list.get(i));
		
		//sorting in ascending
		Collections.sort(list);
        System.out.println(list);
	}
}
