package com.ariman.compose.service;

import com.ariman.compose.entity.User;
import com.ariman.compose.repository.IUserRepository;
import com.ariman.compose.representation.request.CreateUserRequestRepresentation;
import com.ariman.compose.utils.FakeID;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  private IUserRepository userRepository;

  public String createUser(CreateUserRequestRepresentation newUser) {

    User user = new User();
    user.setName(newUser.getName());
    user.setCity(newUser.getCity());
    user.setEmail(newUser.getEmail());
    user.setUid(FakeID.getFakeUUID());

    User savedUser = userRepository.save(user);

    return savedUser.getUid();
  }

  public User getUser(String userId) {
    return userRepository.findByUid(userId);
  }

  public List<User> getUsers() {
    return userRepository.findAll();
  }

}
