package com.project.gridviewimagefromurlusingglide_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    RecyclerView recyclerView;
    GridLayoutManager gridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView =  findViewById(R.id.imageView);
        recyclerView =  findViewById(R.id.recyclerView);
        gridLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        ArrayList imageUrlList = prepareData();
        DataAdapter dataAdapter = new DataAdapter(getApplicationContext(), imageUrlList);
        recyclerView.setAdapter(dataAdapter);
    }

    private ArrayList prepareData() {

        String imageUrls[] = {
                "https://i.pinimg.com/736x/7a/14/64/7a146463281f6610fcab4a48e71492d7--fancy-cars-cool-cars.jpg",
                "https://images.all-free-download.com/images/wallpapers_large/minions_comedy_movie_14603.jpg",
                "https://i.pinimg.com/originals/43/2b/cf/432bcf81a3718cfb56e8f14b8ec393c9.jpg",
                "https://i.pinimg.com/originals/43/2b/cf/432bcf81a3718cfb56e8f14b8ec393c9.jpg",
                "https://i.pinimg.com/originals/43/2b/cf/432bcf81a3718cfb56e8f14b8ec393c9.jpg",
                "https://i.pinimg.com/originals/43/2b/cf/432bcf81a3718cfb56e8f14b8ec393c9.jpg",
                "https://i.pinimg.com/originals/43/2b/cf/432bcf81a3718cfb56e8f14b8ec393c9.jpg",
                "https://i.pinimg.com/originals/43/2b/cf/432bcf81a3718cfb56e8f14b8ec393c9.jpg",
                "https://i.pinimg.com/originals/43/2b/cf/432bcf81a3718cfb56e8f14b8ec393c9.jpg",
                "https://i.pinimg.com/originals/43/2b/cf/432bcf81a3718cfb56e8f14b8ec393c9.jpg",
                "https://i.pinimg.com/originals/43/2b/cf/432bcf81a3718cfb56e8f14b8ec393c9.jpg",
                "https://i.pinimg.com/originals/43/2b/cf/432bcf81a3718cfb56e8f14b8ec393c9.jpg",
                "https://i.pinimg.com/originals/43/2b/cf/432bcf81a3718cfb56e8f14b8ec393c9.jpg"};

        ArrayList imageUrlList = new ArrayList<>();
        for (int i = 0; i < imageUrls.length; i++) {
            ImageUrl imageUrl = new ImageUrl();
            imageUrl.setImageUrl(imageUrls[i]);
            imageUrlList.add(imageUrl);
        }
        Log.d("MainActivity", "List count: " + imageUrlList.size());
        return imageUrlList;
    }
}