package com.xch.user;

import java.util.List;

import com.xch.consumer.param.Response;


public interface UserRemote {
	public Response saveUser(User user);
	public Response saveUsers(List<User> userlist);
}
