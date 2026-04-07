package service;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import model.User;

public interface UserService {
    void saveUser(User user);
    boolean isUserPresent(User user);
    User findById(int id);
    User loadUserByUsername(String username) throws UsernameNotFoundException;
}