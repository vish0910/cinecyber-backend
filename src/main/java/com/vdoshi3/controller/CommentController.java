package com.vdoshi3.controller;

import java.util.List;

import com.vdoshi3.entity.Comment;
import com.vdoshi3.exception.ResourceNotFoundException;

public interface CommentController {
	
	public Comment create(Comment comment);

	public List<Comment> findAll();

	public Comment findByCid(String cid) throws ResourceNotFoundException;

	public List<Comment> findByMid(String mid);

	public List<Comment> findByUid(String uid);

	public List<Comment> findByMidUid(String mid, String uid);

	public void delete(String cid) throws ResourceNotFoundException;

}
