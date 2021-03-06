package com.service;

import java.text.ParseException;
import java.util.List;

import com.po.Friends;
import com.po.Result;
import com.po.User;

public interface UserServer {
	public User login(User user);
	public boolean userIsExist(User user);
	public int register(User user);
	public int addFriend(Friends friend);
	public void updateFriend(Friends friend);
	public void delFriend(int id,String friendName);
	public List<Result> latestMov(long id);
	public List<Result> getOneFrinedMov(long id,String friendName);
	public List<Friends> getFriendList(long id);
	public int[] getFriendTopic(List<Result> friendMov);
	public int[] getWeekMov(List<Result> friendMov) throws ParseException;
}
