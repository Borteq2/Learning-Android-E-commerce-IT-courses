package com.ckm.e_commerce.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ckm.e_commerce.model.Course;

import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder> {

    Context context;
    List<Course> courses;

    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return courses.size();
    }

    public static final class CourseViewHolder extends RecyclerView.ViewHolder {

        public CourseViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
