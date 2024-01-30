package com.example.testCanadWithGradlle.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testCanadWithGradlle.repository.UserRepository;
import com.example.testCanadWithGradlle.model.User;

@Service
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    public void save(User user) {
        User newUser = new User(user.getFirstName(), user.getLastName(),
                user.getStreetName(), user.getStreetNumber(), user.getPoBox(),
                user.getCity(), user.getState(), user.getZipCode(),
                user.getCountry(), user.getProfile(), user.getEmail(),
                user.getPassword(), user.getConfirmPassword());
        userRepository.save(newUser);
    }

    public void delete(Long userId) {
        if (userId != null) {
            userRepository.deleteById(userId);
        }
    }

    public void update(User currentUser, User user) {
        currentUser.setFirstName(user.getFirstName());
        currentUser.setLastName(user.getLastName());
        currentUser.setStreetName(user.getStreetName());
        currentUser.setStreetNumber(user.getStreetNumber());
        currentUser.setPoBox(user.getPoBox());
        currentUser.setCity(user.getCity());
        currentUser.setState(user.getState());
        currentUser.setZipCode(user.getZipCode());
        currentUser.setCountry(user.getCountry());
        currentUser.setProfile(user.getProfile());
        currentUser.setEmail(user.getEmail());
        currentUser.setPassword(user.getPassword());
        currentUser.setConfirmPassword(user.getConfirmPassword());
        userRepository.save(currentUser);
    }

    public User  getUserById(Long userId) {
        if (userId != null) {
        Optional<User> optionalUser = userRepository.findById(userId);
            if (optionalUser.isPresent()) {
                return optionalUser.get();
            } else {
                return null;
            }
        }
        return null;
    }

    public List<User> getAllUsersProfiles() {
        return userRepository.findAll();
    }
}
