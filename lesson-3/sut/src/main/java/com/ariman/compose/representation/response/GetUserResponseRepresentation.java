package com.ariman.compose.representation.response;

import com.ariman.compose.entity.User;
import java.io.Serializable;

public class GetUserResponseRepresentation implements Serializable {

  private String userId;
  private String name;
  private String city;
  private String email;

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void userToRepresentation(User user) {
    this.userId = user.getUid();
    this.name = user.getName();
    this.city = user.getCity();
    this.email = user.getEmail();
  }
}
