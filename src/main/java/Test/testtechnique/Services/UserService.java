package Test.testtechnique.Services;

import Test.testtechnique.Repositories.UserDaoJpa;
import Test.testtechnique.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDaoJpa userDaoJpa;

    public List<User> getUsersLessScore(Integer score){
        return userDaoJpa.findUsersWithLessScore(score);
    }

    public List<User> getUsersGreeeterScore(Integer score){
        return userDaoJpa.findUsersWithGreaterScore(score);
    }

    public Integer getUserRankByScoree(Integer score){

        List<Integer> scores = new ArrayList<>();
        List<User> users= userDaoJpa.findUserRankByscore();
        for (User user : users)
        {
            scores.add(user.getCustom().getScore());
        }
        scores.sort(Collections.reverseOrder());
        System.out.println(scores);
        System.out.println(score);
        System.out.println(scores.indexOf(score)+1);
        return scores.indexOf(score)+1;

    }
}
