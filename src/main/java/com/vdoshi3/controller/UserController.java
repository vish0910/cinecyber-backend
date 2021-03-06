package com.vdoshi3.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.vdoshi3.entity.LoginResponse;
import com.vdoshi3.entity.User;
import com.vdoshi3.exception.InvalidCredentialsException;
import com.vdoshi3.exception.ResourceAlreadyExistsException;
import com.vdoshi3.exception.ResourceNotFoundException;
import com.vdoshi3.utils.DecodedToken;

public interface UserController {
	public User create(User user, HttpServletResponse hr) throws ResourceAlreadyExistsException;

	public List<User> findAll(DecodedToken requestor);

	public User findById(String uid) throws ResourceNotFoundException;

	public User update(DecodedToken requestor, String uid, User user) throws ResourceNotFoundException, InvalidCredentialsException;

	public void delete(DecodedToken requestor, String uid) throws ResourceNotFoundException, InvalidCredentialsException;

	public LoginResponse login(User user, HttpServletResponse hr)
			throws ResourceNotFoundException, InvalidCredentialsException;
}
