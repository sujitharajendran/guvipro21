package st;

import java.util.Scanner;

public class Remove {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String d=s.next();
	String v=d.replaceAll("[a,e,i,o,u]", "");
	System.out.println(v);
	}

}
