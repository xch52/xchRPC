package com.xch.Remote;

import java.util.List;

import com.xch.model.Response;
import com.xch.model.User;

public interface UserRemote {
	public Response saveUser(User user);
	public Response saveUsers(List<User> userlist);
}
