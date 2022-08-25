package ibu.edu.homework4.recursive_merge_sort;
import java.io.IOException;
public class App {
	public static void main(String[] args) throws IOException {
		IPaddress[] ipAddress = new IPaddress[100];
		long t=System.currentTimeMillis();
		ipAddress = IPaddress.readNumbers("/Users/acaus/Downloads/IP-COUNTRY-REGION-CITY-SHUFFLED/IP-COUNTRY-REGION-CITY-SHUFFLED.csv");
		recursive.sort(ipAddress);
		recursive.sort(ipAddress, new CityName());
		System.out.println((System.currentTimeMillis()-t)+ " ms");
		IPaddress.writeToFile("/Users/acaus/Downloads/recursive.csv", ipAddress);
		}
	}
//48019 ms 
//47358 ms
//48013 ms
//60423 ms