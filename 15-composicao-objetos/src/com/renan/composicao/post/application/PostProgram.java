package com.renan.composicao.post.application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import com.renan.composicao.post.entities.Comment;
import com.renan.composicao.post.entities.Post;

public class PostProgram {

	public static void main(String[] args) {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime dataHora1 = LocalDateTime.parse("21/06/2018 13:05:44", formato);
		LocalDateTime dataHora2 = LocalDateTime.parse("28/07/2018 23:14:19", formato);
		
		Post post1 = new Post(
					dataHora1, 
					"Traveling to New Zealand", 
					"I'm going to visit this wonderful county!", 
					12);
		post1.addComment(new Comment("Have a nice trip"));
		post1.addComment(new Comment("wow that's awesome!"));
		
		Post post2 = new Post(
				dataHora2, 
				"Good night guys", 
				"See you tomorrow", 
				5);
		post2.addComment(new Comment("Good night"));
		post2.addComment(new Comment("May the Force be with you"));
		
		System.out.println(post1);
		System.out.println("Comments:");
		for(Comment c : post1.getComments()) {
			System.out.println(c.getText());
		}
		
		System.out.println();
		
		System.out.println(post2);
		System.out.println("Comments:");
		for(Comment c : post2.getComments()) {
			System.out.println(c.getText());
		}
		

	}

}
