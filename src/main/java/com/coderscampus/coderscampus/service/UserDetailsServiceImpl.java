package com.coderscampus.coderscampus.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.coderscampus.coderscampus.model.User;
import com.coderscampus.coderscampus.repository.UserRepository;
import com.coderscampus.coderscampus.util.CustomPasswordEncoder;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private CustomPasswordEncoder passwordEncoder;
	//talk to our repository to see user exist in repository
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> userOpt = userRepository.findByUsername(username);
		return userOpt.orElseThrow(() -> new UsernameNotFoundException("Invalid credentials"));
	}

}
