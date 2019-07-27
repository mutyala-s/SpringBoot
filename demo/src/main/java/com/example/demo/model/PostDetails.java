package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;


@Entity
public class PostDetails{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "postdetails_Sequence")
	@SequenceGenerator(name = "postdetails_Sequence", sequenceName = "POST_DETAILS_SEQ")
	Long id;

	String comments;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "post_id")
	Post post;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}
}
