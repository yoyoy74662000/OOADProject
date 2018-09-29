package model;
import java.util.*;

public class Menu {

	private ArrayList<Dish> dishList;
	private Dish dish;
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
			Dish foundDish=null;
			for (int i=0;i<dishList.size();i++) {
				if (dishList.get(i).getDishName()==dishName) {
					foundDish=dishList.get(i);
					dishList.remove(dishList.get(i));
				}
			};
			if (foundDish!=null)
			{
				System.out.println("Deleted dish: "+dishName);
			}else{
				System.out.println("Couldn't find "+dishName);
			}

		}
		// update name
		public void updateDish(String dishName, String newDishName) {
			for (int i=0;i<dishList.size();i++) {
				if (dishList.get(i).getDishName()==dishName) {
					dishList.get(i).setDishName(newDishName);
				}
			};
		}
		// update inventory
		public void updateDish(String dishName, int newInventory) {
			for (int i=0;i<dishList.size();i++) {
				if (dishList.get(i).getDishName()==dishName) {
					dishList.get(i).setInventory(newInventory);
				}
			};
		}
		// update price
		public void updateDish(String dishName, double newPrice) {
			for (int i=0;i<dishList.size();i++) {
				if (dishList.get(i).getDishName()==dishName) {
					dishList.get(i).setPrice(newPrice);
				}
			};
		}

}
