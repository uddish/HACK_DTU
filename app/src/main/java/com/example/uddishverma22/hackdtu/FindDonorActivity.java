package com.example.uddishverma22.hackdtu.Activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.uddishverma22.hackdtu.R;
import com.example.uddishverma22.hackdtu.model.BloodDonorPOJO;

import java.util.ArrayList;

public class FindDonorActivity extends AppCompatActivity {

    ArrayList<String> donorName;
    ArrayList<String> bloodGroup;
    ArrayList<String> location;
    ArrayList<BloodDonorPOJO> obj;
    BloodDonorPOJO ob;

    private static CustomAdapter adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_donor);

        listView= (ListView) findViewById(R.id.list_view);
        createMetaData();
        adapter=new CustomAdapter(obj,getApplicationContext());

        listView.setAdapter(adapter);


    }

    private void createMetaData() {
        donorName=new ArrayList<>();
        donorName.add("Naman Gupta");
        donorName.add("Uddish Verma");
        donorName.add("Shashank Mahajan");
        donorName.add("Dhruv");
        donorName.add("Nishant Gupta");
        donorName.add("Rushil");
        donorName.add("Arushi Verma");
        donorName.add("Phalak");

        bloodGroup=new ArrayList<>();
        bloodGroup.add("A+");
        bloodGroup.add("O+");
        bloodGroup.add("B-");
        bloodGroup.add("B+");
        bloodGroup.add("AB+");
        bloodGroup.add("A-_");
        bloodGroup.add("O-");
        bloodGroup.add("A+");

        location=new ArrayList<>();
        location.add("Delhi");
        location.add("Bangalore");
        location.add("Delhi");
        location.add("Mumbai");
        location.add("Gwalior");
        location.add("Rajasthan");
        location.add("Gujrat");
        location.add("Goa");


        obj=new ArrayList<>();
        for(int i=0;i<8;i++)
        {
            ob=new BloodDonorPOJO();
            ob.setDonorName(donorName.get(i));
            ob.setBloodGroup(bloodGroup.get(i));
            ob.setLocation(location.get(i));
            obj.add(ob);
        }
    }
}




class CustomAdapter extends ArrayAdapter<BloodDonorPOJO> implements View.OnClickListener{

    private ArrayList<BloodDonorPOJO> dataSet;
    Context mContext;

    @Override
    public void onClick(View view) {

    }

    // View lookup cache
    private static class ViewHolder {
        TextView donorName;
        TextView bloodGroup;
        TextView location;
        CardView cardView;
    }

    public CustomAdapter(ArrayList<BloodDonorPOJO> data, Context context) {
        super(context, R.layout.matched_donor_list_layout, data);
        this.dataSet = data;
        this.mContext=context;

    }



    private int lastPosition = -1;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        BloodDonorPOJO dataModel = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag

        final View result;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.matched_donor_list_layout, parent, false);
            viewHolder.donorName = (TextView) convertView.findViewById(R.id.donor_name);
            viewHolder.bloodGroup = (TextView) convertView.findViewById(R.id.blood_group);
            viewHolder.location = (TextView) convertView.findViewById(R.id.location);

            result=convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;
        }

       /* Animation animation = AnimationUtils.loadAnimation(mContext, (position > lastPosition) ? R.anim.up_from_bottom : R.anim.down_from_top);
        result.startAnimation(animation);
        lastPosition = position;*/

        viewHolder.donorName.setText(dataModel.getDonorName());
        viewHolder.bloodGroup.setText(dataModel.getBloodGroup());
        viewHolder.location.setText(dataModel.getLocation());

        // Return the completed view to render on screen
        return convertView;
    }
}