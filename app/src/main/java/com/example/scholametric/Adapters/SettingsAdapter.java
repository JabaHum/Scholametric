package com.example.scholametric.Adapters;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.scholametric.AssignClass;
import com.example.scholametric.DBbackup;
import com.example.scholametric.Dormitory;
import com.example.scholametric.Exams;
import com.example.scholametric.ExtraCurricular;
import com.example.scholametric.Finances;
import com.example.scholametric.GeneralInfo;
import com.example.scholametric.Health;
import com.example.scholametric.Notifications;
import com.example.scholametric.Permissions;
import com.example.scholametric.R;
import com.example.scholametric.SetCalender;
import com.example.scholametric.Subjects;

import java.util.ArrayList;

public class SettingsAdapter  extends RecyclerView.Adapter{
    private ArrayList mData;
    private ArrayList mImages;
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // infalte the item Layout
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rowlayout, viewGroup, false);
        return new MyViewHolder(v);
    }

    public SettingsAdapter(ArrayList mData, ArrayList mImages) {
        this.mData = mData;
        this.mImages = mImages;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int i) {
        MyViewHolder.textView.setText((String) mData.get(i));
        MyViewHolder.imageView.setImageResource((Integer) mImages.get(i));
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (viewHolder.getAdapterPosition()){
                    case 0:
                        Intent generalinfo = new Intent(v.getContext(), GeneralInfo.class);
                        v.getContext().startActivity(generalinfo);
                        break;
                    case 1:
                        Intent DbBackup = new Intent(v.getContext(), DBbackup.class);
                        v.getContext().startActivity(DbBackup);
                        break;
                    case 2:
                        Intent permissions = new Intent(v.getContext(), Permissions.class);
                        v.getContext().startActivity(permissions);
                        break;
                    case 3:
                        Intent assignclass = new Intent(v.getContext(), AssignClass.class);
                        v.getContext().startActivity(assignclass);
                        break;
                    case 4:
                        Intent dorm = new Intent(v.getContext(), Dormitory.class);
                        v.getContext().startActivity(dorm);
                        break;
                    case 5:
                        Intent notification = new Intent(v.getContext(), Notifications.class);
                        v.getContext().startActivity(notification);
                        break;
                    case 6:
                        Intent exams = new Intent(v.getContext(), Exams.class);
                        v.getContext().startActivity(exams);
                        break;
                    case 7:
                        Intent extra = new Intent(v.getContext(), ExtraCurricular.class);
                        v.getContext().startActivity(extra);
                        break;
                    case 8:
                        Intent finance = new Intent(v.getContext(), Finances.class);
                        v.getContext().startActivity(finance);
                        break;
                    case 9:
                        Intent health = new Intent(v.getContext(), Health.class);
                        v.getContext().startActivity(health);
                        break;
                    case 10:
                        Intent subjects = new Intent(v.getContext(), Subjects.class);
                        v.getContext().startActivity(subjects);
                        break;
                    case 11:
                        Intent calender = new Intent(v.getContext(), SetCalender.class);
                        v.getContext().startActivity(calender);
                        break;

                }
            }
        });

    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        @SuppressLint("StaticFieldLeak")
        static TextView textView;
        @SuppressLint("StaticFieldLeak")
        static ImageView imageView;
        public MyViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.cardName);
            imageView = itemView.findViewById(R.id.cardImage);
        }
    }
}
