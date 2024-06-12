package io.github.dilmi214.login_learning;

public interface UserService {
    User save(User user);
    User validateUser(String email, String password);

}
