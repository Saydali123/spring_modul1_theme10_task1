package com.example.theme_7.entity.repository;

import com.example.theme_7.entity.Car;
import com.example.theme_7.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author Saydali Murodullayev, Mon 10:45 AM. 3/7/2022
 */
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "select c.price, c.model, c.type, c.made_year, c.state_number, r.name as region_name\n" +
            "from users\n" +
            "         inner join users_cars uc on users.id = uc.users_id\n" +
            "         inner join car c on c.id = uc.cars_id\n" +
            "         inner join region r on r.id = c.region_id\n" +
            "where users.id = ?1", nativeQuery = true)
    List<Car> findAllCarsBy(Long user_id);
}
