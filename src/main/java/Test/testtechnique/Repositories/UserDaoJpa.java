package Test.testtechnique.Repositories;

import Test.testtechnique.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface UserDaoJpa extends JpaRepository<User,String> {


    @Query(value="SELECT u FROM User u WHERE u.custom.score < :score")
    List<User> findUsersWithLessScore(@Param("score") Integer score);

    @Query(value="SELECT u FROM User u WHERE u.custom.score > :score")
    List<User> findUsersWithGreaterScore(@Param("score") Integer score);

    @Query(value="SELECT u FROM User u WHERE u.custom.score = 102")
    User findUserScore();

    @Query(value="SELECT u FROM User u")
    List<User> findUserRankByscore();
}
