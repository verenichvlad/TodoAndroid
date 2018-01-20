package com.example.veren.todolist.db;
import android.provider.BaseColumns;

/**
 * Created by veren on 20.01.2018.
 */

public class Task {
    public static final String DB_NAME = "com.example.veren.todolist.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";
        public static final String COL_TASK_TITLE = "title";
    }
}
