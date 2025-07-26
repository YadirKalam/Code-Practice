package test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ipaddress {

	public static void main(String[] args) {
		String ips = "IP1|USA IP2|India IP3|USA IP4|UK IP5|India";
		
		String [] str = ips.split(" ");
	List<String> list =	Arrays.asList(str);
String a=	list.stream()
	.filter(n->!n.endsWith("A")).filter(n->!n.endsWith("a")).findFirst().get();
	
		System.out.println(a);
	}

	
}


