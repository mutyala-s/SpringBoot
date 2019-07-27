package com.example.demo.service;

import com.example.demo.model.Post;

public interface OneToOneService {
	public Post addPost(Post post);

	public Post getPost(Long id);
}
