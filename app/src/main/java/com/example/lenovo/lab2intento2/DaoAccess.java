package com.example.lenovo.lab2intento2;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 03-04-2018.
 */

@Dao
public interface DaoAccess {

    @Insert
    void insertOnlySingleForm (Forms forms);
    @Insert
    void insertMultipleForms (List<Forms> formList);
    @Query("SELECT * FROM Forms WHERE formId = :formId")
    Forms fetchOneFormsbyFormId (int formId);
    @Query("SELECT * FROM Forms")
    List<Forms> fetchAllForms ();
    @Update
    void updateForm (Forms forms);
    @Delete
    void deleteForm (Forms forms);
}