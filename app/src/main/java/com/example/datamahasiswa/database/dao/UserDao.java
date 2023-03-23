package com.example.datamahasiswa.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.datamahasiswa.database.entitas.User;

import java.util.List;

@Dao
public interface UserDao {
    @Query("SELECT * FROM user")
    List<User> getAll();

    @Query("INSERT INTO user (name,email) VALUES(:name,:email)")
    void insertAll(String name, String email);

    @Delete
    void delete(User user);


}
