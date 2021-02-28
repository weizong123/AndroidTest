package com.example.Dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.pojo.Word;

@Dao
public interface WordDao {
    @Insert
    void insertWords(Word... words);
    @Update
    void updateWords(Word... words);
    @Delete
    void deleteWords(Word... words);
    @Query("delete from word")
    void deleteAllWords();
    @Query("select *from Word order by id desc")
    void getAllWords();
}
