package com.example.Dao;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.pojo.Word;

@Database(entities = {Word.class},version = 1,exportSchema = false)
public abstract class WordDatabase extends RoomDatabase {
    public abstract WordDao getWordDao();
}
