package com.ariman.compose.representation.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GetUsersResponseRepresentation implements Serializable {

  private List<GetUserResponseRepresentation> users = new ArrayList<>();

  public List<GetUserResponseRepresentation> getUsers() {
    return users;
  }

  public void insertUser(GetUserResponseRepresentation user) {
    this.users.add(user);
  }
}
