package com.example.heterogenousrecycleview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class ObjectAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private ArrayList<Object>objectArrayList;
    private final int MOBILE_TYPE = 1;
    private final int MOVIE_TYPE = 2;

    public ObjectAdapter(Context context, ArrayList<Object> objectArrayList) {
        this.context = context;
        this.objectArrayList = objectArrayList;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        RecyclerView.ViewHolder viewHolder = null;

        switch (i){
            case MOBILE_TYPE:
                View v = layoutInflater.inflate(R.layout.mobile_single_row, viewGroup, false);
                viewHolder = new MyMobileHolder(v);
                break;

            case MOVIE_TYPE:
                View v1 = layoutInflater.inflate(R.layout.movie_single_row, viewGroup, false);
                viewHolder = new MyMovieHolder(v1);
                break;
        }


        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

        switch (viewHolder.getItemViewType()){

            case MOBILE_TYPE:
                MyMobileHolder mobileHolder = (MyMobileHolder) viewHolder;
                Mobile mobile = (Mobile) objectArrayList.get(i);

                mobileHolder.tvMobileModel.setText(mobile.getMobileModel());
                mobileHolder.tvMobileName.setText(mobile.getMobileName());
                mobileHolder.tvMobileBrand.setText(mobile.getMobileBrand());
                mobileHolder.ivMobile.setImageResource(mobile.getMobileImage());
                mobileHolder.tvMobileReleseYear.setText(String.valueOf(mobile.getMobileReleaseYear()));
             break;

            case MOVIE_TYPE:
                MyMovieHolder movieHolder = (MyMovieHolder) viewHolder;
                Movie movie = (Movie) objectArrayList.get(i);

                movieHolder.ivMovie.setImageResource(movie.getMovieImage());
                movieHolder.tvMovieName.setText(movie.getMovieName());
            break;
        }

    }

    @Override
    public int getItemCount() {
        return objectArrayList.size();
    }

    //This is for Mobile Object
    class MyMobileHolder extends RecyclerView.ViewHolder  {

        ImageView ivMobile;
        TextView tvMobileModel, tvMobileName, tvMobileBrand, tvMobileReleseYear;

        public MyMobileHolder(@NonNull View itemView) {
            super(itemView);

            ivMobile = itemView.findViewById(R.id.imageviewMobile);
            tvMobileModel = itemView.findViewById(R.id.textviewMobileModel);
            tvMobileName = itemView.findViewById(R.id.textviewMobileName);
            tvMobileBrand = itemView.findViewById(R.id.textviewMobileBrand);
            tvMobileReleseYear = itemView.findViewById(R.id.textviewMobileManufactureYear);
        }
    }


    //This is for Movie Object
    class MyMovieHolder extends RecyclerView.ViewHolder{

        ImageView ivMovie;
        TextView tvMovieName;

        public MyMovieHolder(@NonNull View itemView) {
            super(itemView);

            ivMovie = itemView.findViewById(R.id.imageviewMovie);
            tvMovieName = itemView.findViewById(R.id.textviewMovieName);
        }
    }


    //This method send int position to onCreateViewHolder(){} as int i
    @Override
    public int getItemViewType(int position) {
        if(objectArrayList.get(position) instanceof Mobile){
            return MOBILE_TYPE;
        }
        else if (objectArrayList.get(position) instanceof Movie){
            return MOVIE_TYPE;
        }
        return -1;
    }
}
