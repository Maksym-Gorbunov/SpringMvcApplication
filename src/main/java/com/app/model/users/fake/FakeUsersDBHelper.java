package com.app.model.users.fake;

import com.app.model.users.User;
import com.app.model.users.UsersDBInterface;

import java.util.List;

public class FakeUsersDBHelper implements UsersDBInterface {
  private List<User> fakeData = FakeUsersData.fakeData;

  public List<User> getAllUsers() {
    if(fakeData!=null)
      return fakeData;
    return null;
  }


  public void add(String login, String password) {
    if ((login != null) && (password!=null)) {
      fakeData.add(new User(String.valueOf(fakeData.size()+1), login, password));
    }
  }


  public void update(String login, String password, String newLogin, String newPassword) {
    for (User c : fakeData) {
      if (c.getLogin().equals(login)) {
        c.setLogin(newLogin);
        c.setPassword(newPassword);
      }
    }
  }

  public void delete(String login, String password) {
    for (User c : fakeData) {
      if (c.getLogin().equals(login)) {
        fakeData.remove(c);
      }
    }
  }

  public User exist(String login, String password) {
    for (User c : fakeData) {
      if (c.getLogin().equals(login)) {
        return c;
      }
    }
    return null;
  }
}
