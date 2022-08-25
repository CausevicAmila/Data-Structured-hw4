package ibu.edu.homework4.recursive_merge_sort;

import java.util.Comparator;

public class CityName  implements Comparator<IPaddress> {
	public int compare(IPaddress v, IPaddress w) {
		return v.getCityName().compareTo(w.getCityName());
	}

}

