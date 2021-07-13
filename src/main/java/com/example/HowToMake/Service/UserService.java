package com.example.HowToMake.Service;

import com.example.HowToMake.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUser() {
     return userRepository.findAll();
    }

    public void addNewRecipe(User user) {

        user.setDate(LocalDate.now());
        userRepository.save(user);
    }

    public void deleteRecipe(Long userId) {
         boolean exists = userRepository.existsById(userId);
         if(!exists) {
             throw new IllegalStateException("user with id" + userId + "does not exist");
         }
         userRepository.deleteById(userId);
    }
    @Transactional
    public void updateRecipe(Long userId, String name, String surname,LocalDate date, String country, String food, Integer calori, String recipe, String construction) {

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalStateException(
                        "user with id" + userId + "does not exist"
                ));
         if (name != null &&
                 name.length() > 0 &&
                 !Objects.equals(user.getName(), name)) {
             user.setName(name);
         }
         if (surname != null &&
                 surname.length() > 0 &&
                 !Objects.equals(user.getSurname(), surname)) {
             user.setSurname(surname);
         }
         if (food != null &&
                 food.length() > 0 &&
                 !Objects.equals(user.getFood(), food)) {
             user.setFood(food);
         }
        if (country != null &&
                country.length() > 0 &&
                !Objects.equals(user.getCountry(), country)) {
            user.setCountry(country);
        }
        if (calori != null &&
                calori > 0 &&
                !Objects.equals(user.getCalori(), calori)) {
            user.setCalori(calori);
        }

         if (recipe != null &&
                 recipe.length() > 0 &&
                 !Objects.equals(user.getRecipe(), recipe)) {
             user.setRecipe(recipe);

         }
         if (construction != null &&
                 construction.length() > 0 &&
                 !Objects.equals(user.getConstruction(), construction)) {
             user.setConstruction(construction);

         }
         date = LocalDate.now();
         user.setDate(date);

    }
}
