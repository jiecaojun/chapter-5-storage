package com.camp.bit.todolist.db;

import android.provider.BaseColumns;

/**
 * Created on 2019/1/22.
 *
 * @author xuyingyi@bytedance.com (Yingyi Xu)
 */
public final class TodoContract {

    // TODO 定义表结构和 SQL 语句常量

    private TodoContract() {
    }

    public static class NoteToDo implements BaseColumns{
        public static final String TABLE_NAME = "NoteToDo";
        public static final String COLUMN_NAME_CONTENT = "content";
        public static final String COLUMN_NAME_DATA = "data";
        public static final String COLUMN_NAME_STATE = "state";
    }

     public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE "+NoteToDo.TABLE_NAME+" ("+
                    NoteToDo._ID + " INTEGER PRIMARY KEY,"+
                    NoteToDo.COLUMN_NAME_CONTENT +" TEXT,"+
                    NoteToDo.COLUMN_NAME_DATA +" LONG,"+
                    NoteToDo.COLUMN_NAME_STATE +" INTEGER)";

     public static final String SQL_DELETE_ENTRIES=
            "DROP TABLE IF EXISTS " + NoteToDo.TABLE_NAME;
}
