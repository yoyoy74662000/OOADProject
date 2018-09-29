package model;

import java.util.ArrayList;

public class Staff extends User {
		public int sId;
		public String name; 
		private Menu menu;
		private boolean isAdmin;
		private void login(String pwd){
			if(Authentication.authenticate(pwd)){
				isAdmin = true;
			}
		}
		// addDish
		public void manageMenu(Menu menu,String dishName,int inventory, Double price){
			if (isAdmin){
				menu.addDish(dishName,inventory,price);
			}
			else{
				System.out.println("You have not been authenticated to add dish.");
			}
		}
		// delete Dish
		public void manageMenu(Menu menu,String dishName){
			if (isAdmin)
			menu.deleteDish(dishName);
			else{
				System.out.println("You have not been authenticated to delete dish.");
			}
		}
		// update Dish name
		public void manageMenu(Menu menu,String dishName,String newDishName){
			menu.updateDish(dishName, newDishName);;
		}
		// update Dish inventory
		public void manageMenu(Menu menu,String dishName,int newInventory){
			menu.updateDish(dishName,newInventory);
		}
		// update Dish price
		public void manageMenu(Menu menu,String dishName,double newPrice){
			menu.updateDish(dishName,newPrice);
		}
	

}
