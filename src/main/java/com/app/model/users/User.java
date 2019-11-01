package com.app.model.users;

public class User {

  private String id;
  private String login;
  private String password;
  public static final long serialVersionUID = 11L;


  public User(String id, String login, String password) {
    this.id = id;
    this.login = login;
    this.password = password;
  }

  public String getId() {
    return id;
  }

  public String getLogin() {
    return login;
  }

  public String getPassword() {
    return password;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    User user = (User) o;

    if (!id.equals(user.id)) return false;
    return login.equals(user.login);
  }

  @Override
  public int hashCode() {
    int result = id.hashCode();
    result = 31 * result + login.hashCode();
    return result;
  }
}
