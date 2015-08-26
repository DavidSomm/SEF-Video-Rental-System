package movies;

import java.io.Serializable;

public class DB_Movie implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int x, y;
	
	
	public DB_Movie(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	
	public void printXY() {
		System.out.println(x);
		System.out.println(y);
	}

}//end of class