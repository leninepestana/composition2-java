package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Programa {

	public static void main(String[] args) throws ParseException  {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment com1 = new Comment("Have a nice trip");
		Comment com2 = new Comment("Wow that's awesome!");
		Comment com3 = new Comment("Good night");
		Comment com4 = new Comment("May the Force be with you");
		
		Post post1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zeland", "I'm going to visit this wonderful country!", 12);
		Post post2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);
		
		post1.addComment(com1);
		post1.addComment(com2);
		post2.addComment(com3);
		post2.addComment(com4);
		
		
		System.out.println(post1);
		System.out.println(post2);
		
		
		
		sc.close();
	}

}
