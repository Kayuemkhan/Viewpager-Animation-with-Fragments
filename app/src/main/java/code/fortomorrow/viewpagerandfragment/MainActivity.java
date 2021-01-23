package code.fortomorrow.viewpagerandfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.ActionBar;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    ImageView imageView1, imageView2, imageView3, imageView4,imageView5,imageView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        init();
//        View decorView = getWindow().getDecorView();
//// Hide the status bar.
//        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
//        decorView.setSystemUiVisibility(uiOptions);

        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                if (position == 0) {
                    imageView1.setColorFilter(getResources().getColor(R.color.primary1));
                    imageView2.setColorFilter(getResources().getColor(R.color.overlay_dark_30));
                    imageView3.setColorFilter(getResources().getColor(R.color.overlay_dark_30));
                    imageView4.setColorFilter(getResources().getColor(R.color.overlay_dark_30));
                    imageView5.setColorFilter(getResources().getColor(R.color.overlay_dark_30));
                    imageView6.setColorFilter(getResources().getColor(R.color.overlay_dark_30));
                } else if (position == 1) {
                    imageView1.setColorFilter(getResources().getColor(R.color.overlay_dark_30));
                    imageView2.setColorFilter(getResources().getColor(R.color.primary1));
                    imageView3.setColorFilter(getResources().getColor(R.color.overlay_dark_30));
                    imageView4.setColorFilter(getResources().getColor(R.color.overlay_dark_30));
                    imageView5.setColorFilter(getResources().getColor(R.color.overlay_dark_30));
                    imageView6.setColorFilter(getResources().getColor(R.color.overlay_dark_30));
                }
                if (position == 2) {
                    imageView1.setColorFilter(getResources().getColor(R.color.overlay_dark_30));
                    imageView2.setColorFilter(getResources().getColor(R.color.overlay_dark_30));
                    imageView3.setColorFilter(getResources().getColor(R.color.primary1));
                    imageView4.setColorFilter(getResources().getColor(R.color.overlay_dark_30));
                    imageView5.setColorFilter(getResources().getColor(R.color.overlay_dark_30));
                    imageView6.setColorFilter(getResources().getColor(R.color.overlay_dark_30));
                } else if (position == 3) {
                    imageView1.setColorFilter(getResources().getColor(R.color.overlay_dark_30));
                    imageView2.setColorFilter(getResources().getColor(R.color.overlay_dark_30));
                    imageView3.setColorFilter(getResources().getColor(R.color.overlay_dark_30));
                    imageView4.setColorFilter(getResources().getColor(R.color.primary1));
                    imageView5.setColorFilter(getResources().getColor(R.color.overlay_dark_30));
                    imageView6.setColorFilter(getResources().getColor(R.color.overlay_dark_30));
                }

            }

            @Override
            public void onPageSelected(int position) {
                Toast.makeText(getApplicationContext(),"This is "+position+" Fragment",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
        setBackgroundColor();


    }

    private void init() {
        viewPager = findViewById(R.id.view_pager);
        imageView1 = findViewById(R.id.imageview1);
        imageView2 = findViewById(R.id.imageview2);
        imageView3 = findViewById(R.id.imageview3);
        imageView4 = findViewById(R.id.imageview4);
        imageView5 = findViewById(R.id.imageview5);
        imageView6 = findViewById(R.id.imageview6);

    }

    private void setBackgroundColor() {

    }

    @Override
    public void onBackPressed() {
        if (viewPager.getCurrentItem() == 0) {
            super.onBackPressed();
        } else {
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }

    }
    public void nextfragment(){
        viewPager.setCurrentItem(viewPager.getCurrentItem()+1);
    }


}