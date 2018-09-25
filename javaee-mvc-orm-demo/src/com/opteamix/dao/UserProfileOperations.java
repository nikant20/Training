package com.opteamix.dao;

import java.util.List;

import com.opteamix.beans.UserProfile;

public interface UserProfileOperations {
	public int store(UserProfile userProfile);
	public List<UserProfile> getAllUsers();
	public UserProfile authenticate(String username, String password);
	public UserProfile findByphoneNumber(String phoneNumber);
}
