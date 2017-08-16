package com.example.wgu_companion.wgucompanion;

import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

public class CourseAssessmentCursorAdapter extends CursorAdapter {
    public CourseAssessmentCursorAdapter(Context context, Cursor c, int flags) {
        super(context, c, flags);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1, parent, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        TextView itemTv = (TextView) view.findViewById(android.R.id.text1);

        String itemText = cursor.getString(cursor.getColumnIndex(DBHelper.ASSESSMENT_TYPE));

        itemTv.setText(itemText);
    }
}
