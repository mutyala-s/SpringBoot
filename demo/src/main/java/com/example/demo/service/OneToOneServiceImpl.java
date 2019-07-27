package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;

@Service
public class OneToOneServiceImpl implements OneToOneService{
	@Autowired
	PostRepository postRepo;

	public Post addPost(Post post) {
		Post rpost = postRepo.save(post);
		return rpost;
	}

	@Override
	public Post getPost(Long pid) {
		Optional<Post> optional = postRepo.findById(pid);
		Post post = optional.get();
		return post;
		
	}
}
