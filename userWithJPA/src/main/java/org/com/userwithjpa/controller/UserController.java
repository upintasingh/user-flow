package org.com.userwithjpa.controller;


import org.com.userwithjpa.dto.UserDTO;
import org.com.userwithjpa.model.User;
import org.com.userwithjpa.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    /*@GetMapping("user")
    public ResponseEntity<String> getUser() {

    }*/

    /*@PostMapping("/user")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
       User user =  userService.createUser(userDTO.getEmail(), userDTO.getPassword(), userDTO.getUserName());
       return ResponseEntity.status(HttpStatus.CREATED).body(from(user));
    }

    private UserDTO from(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setEmail(user.getEmail());
        userDTO.setPassword(user.getPassword());
        userDTO.setUserName(user.getUserName());
        return userDTO;
    }*/
}
