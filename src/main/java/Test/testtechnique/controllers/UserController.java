package Test.testtechnique.controllers;

import Test.testtechnique.Services.UserService;
import Test.testtechnique.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    //method to get users with score less than the given score

    @GetMapping("/usersunder/{score}")
    public List<User> getUsersWithLessScore(@PathVariable("score") Integer score)
    {
        return userService.getUsersLessScore(score);
    }
    //method to get users with score greather than the given score
    @GetMapping("/usersgreater/{score}")
    public List<User> getUsersWithGreaterScore(@PathVariable("score") Integer score)
    {
        return userService.getUsersGreeeterScore(score);
    }
//method to get the rank of the user by his score
    @GetMapping("/rankuser/{score}")
    @ResponseBody
    public ResponseEntity<Map<String, Integer>> getUserRank(@PathVariable("score") Integer score)
    {
        Integer rank = userService.getUserRankByScoree(score);
        Map<String, Integer> result = new HashMap<>();
        result.put("rank", rank);
        return ResponseEntity.ok(result);

    }
}
