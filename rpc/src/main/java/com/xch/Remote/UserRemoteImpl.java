package com.xch.Remote;

import java.util.List;

import javax.annotation.Resource;

import com.xch.annotation.Remote;
import com.xch.model.Response;
import com.xch.model.User;
import com.xch.service.UserService;
import com.xch.util.ResponseUtil;

@Remote
public class UserRemoteImpl implements UserRemote{
	
	@Resource
	private UserService service;
	
	public Response saveUser(User user){
		service.saveUSer(user);
		Response response = ResponseUtil.createSuccessResponse(user);
		
		return response;
	}
	
	public Response saveUsers(List<User> userlist){
		service.saveUSerList(userlist);
		Response response = ResponseUtil.createSuccessResponse(userlist);
		
		return response;
	}
}
