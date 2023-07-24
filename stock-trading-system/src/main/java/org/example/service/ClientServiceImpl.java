package org.example.service;

import java.util.Scanner;

import org.example.model.Stock;
import org.example.model.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@NoArgsConstructor
@Component
public class ClientServiceImpl implements ClientService{
	
	@Autowired
	  StockOptions stockOptions;

	  @Autowired
	  OrderOptions orderOptions;
	  
	  Scanner scanner = new Scanner(System.in);
      
	  private void displayStocks() {
		    System.out.println("Stocks:");
		    stockOptions.getAllStocks().forEach(System.out::println);
		  }

	  private void displayOrders() {
		    System.out.println("Orders:");
		    orderOptions.listAllOrders().forEach(System.out::println);
		  }
	  
	  private void createOrder(String name, String action, Integer quantity) {

		    Stock stock = stockOptions.getStockByName(name);

		    if (stock == null) {
		      System.out.println("Invalid Stock Name!");
		      return;
		    }
      
	  Order order = orderOptions.createOrder(stock, quantity, action);	
	  
	  System.out.println("Order Created: " + order);
	  }
	  
	  public void Menu(){
		    System.out.println("Main Menu:");
		    System.out.println("1. Create Order");
		    System.out.println("2. View Previous Orders");
		    System.out.println("3. Exit");

		    System.out.print("Enter your choice: ");

		    Integer choice = getSafeIntegerInput();

		    switch (choice) {
		    
		      case 1:
		        displayStocks();
		        System.out.print("Enter stock name: ");
		        String name = scanner.nextLine();
		        System.out.println("Enter action (BUY/SELL)");
		        String action = scanner.nextLine();
		        System.out.println("Enter quantity:");
		        Integer quantity = getSafeIntegerInput();
		        createOrder(name, action, quantity);
		        Menu();
		        break;
		      case 2:
		        displayOrders();
		        System.out.println("Press enter to return to main menu");
		        scanner.nextLine();
		        Menu();
		        break;

		      case 3:
		        System.out.println("Thank you for using Our system");
		        System.exit(0);
		        break;
		      default:
		        System.out.println("Invalid choice. Please try again.");
		        Menu();
		        break;
		    }


		  }
	  
	  private Integer getSafeIntegerInput() {
		    Integer choice = null;
		    while (choice == null) {
		      try {
		        choice = Integer.parseInt(scanner.nextLine());
		      } catch (NumberFormatException e) {
		        System.out.println("Invalid input. Please enter a number.");
		      }
		    }
		      return choice;
		  }
}
