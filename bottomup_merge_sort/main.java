package ibu.edu.homework4.bottomup_merge_sort;
import java.io.IOException;
public class main {
	public static void main(String[] args) throws IOException {
		IPaddress[] ipAddress = new IPaddress[4600000];
		long start=System.currentTimeMillis();
		ipAddress = IPaddress.readNumbers("/Users/acaus/Downloads/IP-COUNTRY-REGION-CITY-SHUFFLED/IP-COUNTRY-REGION-CITY-SHUFFLED.csv");
		bottomup.sort(ipAddress);
		System.out.println((System.currentTimeMillis()-start)+ " ms");
		IPaddress.writeToFile("/Users/acaus/Downloads/bottomup.csv", ipAddress);
		}
	}
// 48297 ms
//48208 ms
//51070 ms