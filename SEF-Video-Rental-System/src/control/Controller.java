package control;

import java.io.*;
import movies.*;
import customer.*;

public class Controller {
	
	
	
	public static void main(String[] args) {
		//Start here:
		//System.out.println("debug");
		
		DB_Movie dbMovie = new DB_Movie(0, 0);
		DB_Customer dbCustomer = new DB_Customer();
		
		try {
			dbMovie = loadMovies();
			dbCustomer = loadCustomers();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			saveMovies(dbMovie);
			saveCustomers(dbCustomer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		dbMovie.printXY();
		
		System.out.println("DONE");
	}

	private static DB_Movie loadMovies() throws IOException, ClassNotFoundException {
		ObjectInputStream oos = new ObjectInputStream(new FileInputStream("Movies.bin"));
		DB_Movie temp = (DB_Movie) oos.readObject();
		oos.close();
		return temp;
	}
	private static void saveMovies(DB_Movie movies) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Movies.bin"));
		oos.writeObject(movies);
		oos.close();
	}
	private static DB_Customer loadCustomers() throws IOException, ClassNotFoundException {
		ObjectInputStream oos = new ObjectInputStream(new FileInputStream("Customers.bin"));
		DB_Customer temp = (DB_Customer) oos.readObject();
		oos.close();
		return temp;
	}
	private static void saveCustomers(DB_Customer customers) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Customers.bin"));
		oos.writeObject(customers);
		oos.close();
	}
	
	
	
	
	
	
	
}//end of class