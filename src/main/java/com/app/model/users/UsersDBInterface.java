package com.app.model.users;

import java.util.List;

public interface UsersDBInterface {

  public List<User> getAllUsers();

  public void add(String login, String password);

  public void update(String login, String password, String newLogin, String newPassword);

  public void delete(String login, String password);

  public User exist(String login, String password);
}
