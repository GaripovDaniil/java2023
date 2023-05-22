package com.example.taskbook.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.taskbook.model.Task;

import java.util.List;

@Dao
public interface TaskDao {
    @Query("SELECT * FROM Task")
    List<Task> getAll();

    @Query("SELECT * FROM Task")
    LiveData<List<Task>> getAllLiveData();

    @Query("SELECT * FROM Task WHERE id IN (:taskIds)")
    List<Task> loadAllByIds(int[] taskIds);

    @Query("SELECT * FROM Task WHERE id == :id LIMIT 1")
    Task findById(int id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Task task);

    @Update
    void upfate(Task task);

    @Delete
    void delete(Task task);
}
