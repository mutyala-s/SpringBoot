package com.example.demo.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Post;
import com.example.demo.model.PostDetails;
import com.example.demo.service.OneToOneService;

@RestController
public class OneToOneController {
	@Autowired
	OneToOneService oneToOneService;

	@RequestMapping(name = "/addUser" ,method = RequestMethod.GET,produces = "application/json")
	public ResponseEntity<Post> addPost() {
		HttpHeaders headers = new HttpHeaders();
		Post post = oneToOneService.addPost(getPost());
		Post postReturn = oneToOneService.getPost(post.getId());	
		if(postReturn ==null)
			return new ResponseEntity<Post>(HttpStatus.NOT_FOUND);
		else {
			headers.add("Post Created  - ", String.valueOf(post.getId()));
			return new ResponseEntity<Post>(postReturn,HttpStatus.OK);
		}
		
	}

	private Post getPost() {
		Post post = new Post();
		PostDetails postDetails = new PostDetails();
		post.setTitle("Comment1");
		postDetails.setComments("Very good ");
		postDetails.setPost(post);
		post.setPostDetails(postDetails);
		//oneToOneService.addPost(post);
		return post;
	}
}
