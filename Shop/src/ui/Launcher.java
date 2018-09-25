package ui;

import javax.swing.JOptionPane;

import domain.model.Game;
import domain.model.Movie;
import domain.model.Product;
import domain.model.Shop;

public class Launcher {
	
	public static void main(String[] args) {
		Shop shop = new Shop();
		
		String menu = "1. Add product\n2. Show product\n3. Show rental price\n\n0. Quit";
		int choice = -1;
		while (choice != 0) {
			String choiceString = JOptionPane.showInputDialog(menu);
			choice = Integer.parseInt(choiceString);
			if (choice == 1) {
				addProduct(shop);
			} else if (choice == 2) {
				showProduct(shop);
			} else if (choice == 3){
				showPrice(shop);
			}
		}
	}
	
	public static void addProduct(Shop shop) {
		Product product = null;
		String title = JOptionPane.showInputDialog("Enter the title:");
		String id = JOptionPane.showInputDialog("Enter the id:");
		String type = JOptionPane.showInputDialog("Enter the type (M for movie/G for game):");
		
		switch (type) {
		case "M":
			product = new Movie(title, id);
			break;
			
		case "G":
			product = new Game(title, id);
			break;

		default:
			break;
		}
		
		if (product != null) {
			shop.addProduct(product);
		}
	}
	
	public static void showProduct(Shop shop) {
		String id = JOptionPane.showInputDialog("Enter the id:");
		if(shop.isProduct(id)) {
			JOptionPane.showMessageDialog(null, shop.getProduct(id));
		}
	}

	public static void showPrice(Shop shop) {
		String id = JOptionPane.showInputDialog("Enter the id:");
		if(shop.isProduct(id)){
			int days = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of days:"));
			JOptionPane.showMessageDialog(null, shop.getProduct(id).getPrice(days));
		}
	}

}
