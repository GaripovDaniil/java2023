package com.example.taskbook.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.taskbook.model.Task;

@Database(entities = {Task.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract TaskDao taskDao();
}
