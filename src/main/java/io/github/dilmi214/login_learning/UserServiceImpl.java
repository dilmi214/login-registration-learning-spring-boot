package io.github.dilmi214.login_learning;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User validateUser(String username, String password) {
        return userRepository.findByEmailAndPassword(username, password);
    }

}
