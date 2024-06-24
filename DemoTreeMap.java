package com.collections;

import java.util.TreeMap;

public class DemoTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();
		
		tmap.put(1, "Developer");
		tmap.put(3, "Tester");
		tmap.put(4, "TechSupport");
		tmap.put(6, "Data Analyst");
		tmap.put(2, "Web Developer");
		tmap.put(7, "DataBase Administrator");
		tmap.put(5, "System Analyst");
		tmap.put(8, "System Architect");
		
		System.out.println(tmap);
		System.out.println(tmap.ceilingEntry(1));
		System.out.println("Ceiling key: "+tmap.ceilingKey(6));//it will show the key if it is present in it, if it is not present it will return null
		//it will give the nearest successor of the given value
		System.out.println("First key: "+tmap.firstKey());
		
		System.out.println("Floor Key: "+tmap.floorKey(2));//it will give the nearest predecessor of the given value(round value)
		System.out.println("Higher Key: "+tmap.higherKey(3));//it will show the higher key than the given argument if it is present in the list
		System.out.println("Last Key: "+tmap.lastKey());
		
		System.out.println("Lower Key: "+tmap.lowerKey(3));
		System.out.println("Descending Order: "+tmap.descendingMap());
		System.out.println("First Entry: "+tmap.firstEntry());
		
		System.out.println("Head Map: "+tmap.headMap(4));//It will show elements until the given argument
		System.out.println("Head Map: "+tmap.headMap(5, true));//It will show elements including the given argument
		System.out.println("Highest Entry: "+tmap.higherEntry(5));//it will show the higher key and value than the given argument
		
		System.out.println("Last Entry: "+tmap.lastEntry());
		System.out.println("Lower Entry: "+tmap.lowerEntry(7));
		System.out.println("Ceiling Entry: "+tmap.ceilingEntry(5));//it will show the given entry details
		
		System.out.println("Tail Map: "+tmap.tailMap(6));//it will show the elements after the given argument until end
		System.out.println(tmap.tailMap(3, true));//it will show the key and value from the passed argument till end
		System.out.println("Sub Map: "+tmap.subMap(2, 4));//it will show the elements between the given arguments
		System.out.println("Sub Map: "+tmap.subMap(1, false, 4, false));//it will show middle elements excluding the passed arguments
		
		
		TreeMap<Double, Integer> tmap1=new TreeMap<Double,Integer>();
		tmap1.put(32.05, 100);
		tmap1.put(56.432, 43);
		tmap1.put(49.45, 56);
		tmap1.put(41.76, 41);
		
		System.out.println(tmap1);
		System.out.println("Floor Key: "+tmap1.floorKey(48.05));
		System.out.println("Ceiling Key: "+tmap1.ceilingKey(29.45));
		
	}

}
