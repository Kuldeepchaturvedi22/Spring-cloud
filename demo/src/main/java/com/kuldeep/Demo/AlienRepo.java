package com.kuldeep.Demo;
import java.util.*;
import com.anand.Demo.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AlienRepo extends JpaRepository<Alien,Integer> {
    //List<Alien> findByAname(String aname);

    @Query("from Alien where aname= :name")
    List<Alien> find(@Param("name") String aname);
}
