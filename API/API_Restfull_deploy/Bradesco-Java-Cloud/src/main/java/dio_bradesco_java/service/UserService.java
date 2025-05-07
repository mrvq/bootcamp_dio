package dio_bradesco_java.service;

import dio_bradesco_java.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
