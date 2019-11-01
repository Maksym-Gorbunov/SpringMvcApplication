package com.app.model.users.fake;

import com.app.model.users.User;

import java.util.ArrayList;
import java.util.List;

public class FakeUsersData {
  public static List<User> fakeData = new ArrayList<>();

  static {
    fakeData.add(new User("1", "user1", "password1"));
    fakeData.add(new User("2", "user2", "password2"));
    fakeData.add(new User("3", "user3", "password3"));
    fakeData.add(new User("4", "admin", "password"));
    }
}
