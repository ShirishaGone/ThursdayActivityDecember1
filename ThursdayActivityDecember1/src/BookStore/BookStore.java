package BookStore;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;


public class BookStore {

	public static void main(String[] args) {
		List<Book> list=new ArrayList<Book>();
		list.add(new Book("Production Technology","Sharma",450.0));
		list.add(new Book("Dynamics of Machinery","Hans",500.0));
		list.add(new Book("PowerApps","Microsoft",0));
		list.add(new Book("A Scanner Darkley ","Dick",555.0));		
		System.out.println("The Books in BookStore are:");
				
		for(Book list1:list)
		{
			
			System.out.println(list1.title+","+list1.author+","+list1.price);
		}
		System.out.println("");			
		
			System.out.println("Enter title of the book ");
			Scanner sc=new Scanner(System.in);
			String t=sc.next();
			for(Book list2:list)
			{
			if(list2.title.contains(t))
			{
			System.out.println("Book is avialable and details are:");
			System.out.println(list2.title+","+list2.author+","+list2.price);
		    }		
		}
       System.out.println("");
				
       System.out.println("Enter Author of the book ");
		Scanner sc1=new Scanner(System.in);
		String au=sc1.next();
		for(Book list3:list)
		{
			if(list3.author.contains(au))
			{
				System.out.println("Book is avialable and details are:");
			   System.out.println(list3.title+","+list3.author+","+list3.price);
		   }		
		}

	}

	

}
