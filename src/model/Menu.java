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
	public ArrayList<Dish> getMenu(){
		return getDishList();
	}

		//add a new dish to the menu
		public void addDish(String dishName,int inventory, Double price){
			dishList.add(new Dish(dishName, inventory, price));
		}
		//delete a specified dish by name
		public void deleteDish(String dishName) {
			for (int i=0;i<dishList.size();i++) {
				if (dishList.get(i).getDishName()==dishName) {
					dishList.remove(dishList.get(i));
				}
			}
		}
		// update name
		public void updateDish(String dishName, String newDishName) {
			
		}
		// update inventory
		public void updateDish(String dishName, int newInventory) {
			
		}
		// update price
		public void updateDish(String dishName, double newPrice) {
			
		}

}
