package com.spring.jdbc.org.sweetshoppe.spring;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.admin.manage.AdminManage;
//import org.admin.manage.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.sweetshoppe.admin.AdminDao;

public class App {

	public static void main(String args[]) throws IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		AdminDao adminDao = context.getBean("adminDao", AdminDao.class);

		System.out.println(("Hello Admin..."));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go = true;
		while (go) {
			System.out.println("Press 1 for addimg sweet: ");
			System.out.println("Press 2 for displaying sweet category: ");
			System.out.println("Press 3 for viewing the offers of specific sweet: ");
			System.out.println("Press 4 for deleting the sweets:  ");
			System.out.println("Press 5 for updating the list: ");
			System.out.println("Press 6 for exit: ");
			try {
				int input = Integer.parseInt(br.readLine());

				switch (input) {
				case 1:
					// add a new sweet variety/category // dynamic inputs
					System.out.println("Enter sweetId: ");
					Integer sId = Integer.parseInt(br.readLine());
					System.out.println("Enter sweet quantity available in Kgs: ");
					Integer sQuantity = Integer.parseInt(br.readLine());
					System.out.println("Enter sweet name: ");
					String sName = br.readLine();
					System.out.println("Enter sweet price per kg: ");
					Integer sPrice = Integer.parseInt(br.readLine());
					System.out.println("Enter sweet offres in percentage: ");
					Integer sOffers = Integer.parseInt(br.readLine());

					// Creating adminmange object am and setting values
					AdminManage am = new AdminManage();
					am.setSweetId(sId);
					am.setSweetQuantity(sQuantity);
					am.setSweetName(sName);
					am.setSweetPrice(sPrice);
					am.setOffers(sOffers);

					// Saving adminmanage to database by calling insert of admin dao
					int r = adminDao.insert(am);
					System.out.println(r + "sweet added");
					System.out.println("*******************************************");
					System.out.println();

					break;
				case 2:
					// display all categories
					List<AdminManage> allsweets = adminDao.getAllSweets();
					for (AdminManage obj : allsweets) {
						System.out.println("Id: " + obj.getSweetId());
						System.out.println("Name: " + obj.getSweetName());
						System.out.println("Price per kg: " + obj.getSweetPrice());
						System.out.println("Quantity available in stock :" + obj.getSweetQuantity());
						System.out.println("Offers if any: " + obj.getOffers());
						System.out.println("________________________________________");
					}
					break;
				case 3:
					// get single sweet data-offers on it
					System.out.println("Enter sweet Id : ");
					int Id = Integer.parseInt(br.readLine());
					AdminManage admin = adminDao.getSweet(Id);
					System.out.println("Id : " + admin.getSweetId());
					System.out.println("Name : " + admin.getSweetName());
					System.out.println("Quantity Available: " + admin.getSweetQuantity());

					System.out.println("________________________________________");

					break;
				case 4:
					// delete sweet
					System.out.println("Enter user Id:");
					int id = Integer.parseInt(br.readLine());
					adminDao.deleteSweet(id);
					System.out.println("record deleted...");
					break;
				case 5:
					// adminDao.updateSweet();
					// update sweet details
					System.out.println("Enter Sweet Id: ");
					int sweetId = Integer.parseInt(br.readLine());

					System.out.println("Enter Sweet name: ");
					String sweetName = br.readLine();

					System.out.println("Enter Sweet Quantity: ");
					int sweetQuantity = Integer.parseInt(br.readLine());

					System.out.println("Enter Sweet Rate: ");
					int sweetRate = Integer.parseInt(br.readLine());

					System.out.println("Enter Sweet Discount Offer % : ");
					int sweetDiscount = Integer.parseInt(br.readLine());

					AdminManage Obj = new AdminManage();
					Obj.setSweetId(sweetId);
					Obj.setSweetName(sweetName);
					Obj.setSweetQuantity(sweetQuantity);
					Obj.setSweetPrice(sweetRate);
					Obj.setOffers(sweetDiscount);

					// pass values to the method
					adminDao.updateSweet(Obj);
					System.out.println(" Sweet Details Updated ");

					break;

				case 6:
					// exit the program
					go = false;
					break;
				}
			} catch (Exception e) {
				System.out.println("Invalid Input Try with another one !!!");
				System.out.println(e.getMessage());
			}
		}

		System.out.println("Thank you for using my application");
		System.out.println("See you again!");

		((ClassPathXmlApplicationContext) context).close();
	}
}
