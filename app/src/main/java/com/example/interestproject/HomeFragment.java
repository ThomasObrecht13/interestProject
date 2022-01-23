package com.example.interestproject;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

import de.hdodenhof.circleimageview.CircleImageView;


public class HomeFragment extends Fragment {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        //Ajout brut des images utilisateurs
        Uri uri = Uri.parse("https://png.pngtree.com/element_our/20200610/ourlarge/pngtree-character-default-avatar-image_2237203.jpg");
        CircleImageView imageView1;

        imageView1 = view.findViewById(R.id.imageView1);
            Glide.with(view.getContext())
                    .load(uri)
                    .into(imageView1);

        imageView1 = view.findViewById(R.id.imageView2);
        Glide.with(view.getContext())
                .load(uri)
                .into(imageView1);

        imageView1 = view.findViewById(R.id.imageView3);
        Glide.with(view.getContext())
                .load(uri)
                .into(imageView1);

        imageView1 = view.findViewById(R.id.imageView4);
        Glide.with(view.getContext())
                .load(uri)
                .into(imageView1);

        imageView1 = view.findViewById(R.id.imageView5);
        Glide.with(view.getContext())
                .load(uri)
                .into(imageView1);

        imageView1 = view.findViewById(R.id.imageView6);
        Glide.with(view.getContext())
                .load(uri)
                .into(imageView1);

        imageView1 = view.findViewById(R.id.imageView7);
        Glide.with(view.getContext())
                .load(uri)
                .into(imageView1);
        imageView1 = view.findViewById(R.id.imageUserCenterHome);
        Glide.with(view.getContext())
                .load(uri)
                .into(imageView1);


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}