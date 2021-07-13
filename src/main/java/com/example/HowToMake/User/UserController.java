package com.example.HowToMake.User;


import com.example.HowToMake.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUser() {

        return userService.getUser();

    }
    @PostMapping(value = "/post")
    public void addNewUserRecipe(@RequestBody User user){

        userService.addNewRecipe(user);
    }
    @PutMapping(path = "{userId}")
    public void updateUserRecipe(
            @PathVariable("userId") Long userId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String surname,
            @RequestParam(required = false) LocalDate date,
            @RequestParam(required = false) String country,
            @RequestParam(required = false) String food,
            @RequestParam(required = false) Integer calori,
            @RequestParam(required = false) String recipe,
            @RequestParam(required = false) String construction) {
        userService.updateRecipe(userId, name, surname,date, country, food, calori, recipe, construction);
    }



    @DeleteMapping(path = "{userId}")
    public void deleteUserRecipe(@PathVariable("userId") Long userId) {
        userService.deleteRecipe(userId);
    }
}
