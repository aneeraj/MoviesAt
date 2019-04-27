package at.ovies.app;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private List<Slide> lstSlides;
    private ViewPager sliderpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sliderpager = findViewById(R.id.slider_pager);
        //prepare a list of slides....
        lstSlides = new ArrayList<>();
        lstSlides.add(new Slide(R.drawable.slide1, "Avengers End Game"));
        lstSlides.add(new Slide(R.drawable.silde2, "Athiran"));
        lstSlides.add(new Slide(R.drawable.slide1, "Avengers End Game"));
        lstSlides.add(new Slide(R.drawable.silde2, "Athiran"));

        SliderPagerAdapter adpater = new SliderPagerAdapter(this, lstSlides);

        sliderpager.setAdapter(adpater);
    }
}
