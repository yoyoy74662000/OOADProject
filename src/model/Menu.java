package model;
import java.util.*;

public class Menu {

	private ArrayList<Dish> dishList;
//	Constructor
	Menu(){
		this.dishList=new ArrayList<Dish>();
	}
	
	public ArrayList<Dish> getDishList() {
		return dishList;
	}
}
