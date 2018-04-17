package com.example.lenovo.lab2intento2;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by lenovo on 03-04-2018.
 */

@Entity
public class Forms {
    @NonNull
    @PrimaryKey (autoGenerate = true)
    public int formId;

    private String Name;
    private String Date;
    private String Category;
    private String Comment;

    public Forms() {
    }

    public int getFormId() { return formId; }

    public String getName() { return Name; }
    public void setName(String Name) { this.Name = Name; }

    public String getDate() { return Date; }
    public void setDate(String Date) { this.Date = Date; }

    public String getCategory() { return Category; }
    public void setCategory(String Category) { this.Category = Category; }

    public String getComment() { return Comment; }
    public void setComment(String Comment) { this.Comment = Comment; }

}
