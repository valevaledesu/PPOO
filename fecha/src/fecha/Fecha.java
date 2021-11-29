package fecha;

import java.time.*;
import java.util.Scanner;

public class Fecha {
	// int dia;
	// int mes;
	public LocalDateTime time;

	public Fecha() {
		// super();
		this.time = LocalDateTime.now();
	}

	public LocalDateTime getTime() {
		return time;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Fecha miFecha = new Fecha();

		sc.nextInt();

		System.out.println(miFecha.getTime().getHour());
		System.out.println(miFecha.getTime().getMinute());

	}
	

}
