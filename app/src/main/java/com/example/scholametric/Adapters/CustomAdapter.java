package com.example.scholametric.Adapters;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.scholametric.R;
import com.example.scholametric.activities.Accomodation;
import com.example.scholametric.activities.Database;
import com.example.scholametric.activities.Electives;
import com.example.scholametric.activities.Email;
import com.example.scholametric.activities.Logs;
import com.example.scholametric.activities.ReportCards;
import com.example.scholametric.activities.Schedules;
import com.example.scholametric.activities.Settings;
import com.example.scholametric.activities.Sms;
import com.example.scholametric.activities.Staff;
import com.example.scholametric.activities.Statistics;
import com.example.scholametric.activities.Students;

import java.util.ArrayList;

public  class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CardViewholder> {

    private ArrayList mDataset;
    private ArrayList mImages;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public class CardViewholder extends RecyclerView.ViewHolder  {
        // each data item is just a string in this case
        private TextView cardname;
        private ImageView cardimage;

        public CardViewholder(@NonNull View itemView) {
            super(itemView);
            cardname = itemView.findViewById(R.id.cardName);
            cardimage = itemView.findViewById(R.id.cardImage);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //TODO EDIT INTENT SECTION


                    //int v = getAdapterPosition();
                    switch(getAdapterPosition()) {
                        case 1:
                            Intent settings = new Intent(v.getContext(), Settings.class);
                            v.getContext().startActivity(settings);
                            break;
                        case 2:
                            Intent reports = new Intent(v.getContext(), ReportCards.class);
                            v.getContext().startActivity(reports);
                            break;
                        case 3:
                            Intent electives = new Intent(v.getContext(), Electives.class);
                            v.getContext().startActivity(electives);
                            break;
                        case 4:
                            Intent sms = new Intent(v.getContext(), Sms.class);
                            v.getContext().startActivity(sms);
                            break;
                        case 5:
                            Intent email = new Intent(v.getContext(), Email.class);
                            v.getContext().startActivity(email);
                            break;
                        case 6:
                            Intent database = new Intent(v.getContext(), Database.class);
                            v.getContext().startActivity(database);
                            break;
                        case 7:
                            Intent students = new Intent(v.getContext(), Students.class);
                            v.getContext().startActivity(students);
                            break;
                        case 8:
                            Intent staff = new Intent(v.getContext(), Staff.class);
                            v.getContext().startActivity(staff);
                            break;
                        case 9:
                            Intent logs = new Intent(v.getContext(), Logs.class);
                            v.getContext().startActivity(logs);
                            break;
                        case 10:
                            Intent stats = new Intent(v.getContext(), Statistics.class);
                            v.getContext().startActivity(stats);
                            break;
                        case 11:
                            Intent schedules = new Intent(v.getContext(), Schedules.class);
                            v.getContext().startActivity(schedules);
                            break;
                        case 12:
                            Intent accomodation = new Intent(v.getContext(), Accomodation.class);
                            v.getContext().startActivity(accomodation);
                            break;
                    }

                }
            });

        }

    }

    public CustomAdapter(ArrayList myDataset,ArrayList myImages) {
        this.mDataset = myDataset;
        this.mImages = myImages;
    }

    // Create new views (invoked by the layout manager)
    @NonNull
    @Override
    public CustomAdapter.CardViewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.rowlayout,viewGroup,false);

        return new CardViewholder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewholder cardViewholder, int i) {
        cardViewholder.cardname.setText((String) mDataset.get(i));
        cardViewholder.cardimage.setImageResource((Integer) mImages.get(i));

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
