package com.task.customeimageviewwithtextview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.task.customeimageviewwithtextview.fragments.FragThree;
import com.task.customeimageviewwithtextview.fragments.FragTwo;
import com.task.customeimageviewwithtextview.fragments.Fragone;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CircleImageView img1, img2, img3;
    TextView txt1, txt2, txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (TextView) findViewById(R.id.txt1);

        txt2 = (TextView) findViewById(R.id.txt2);
        txt3 = (TextView) findViewById(R.id.txt3);


        img1 = (CircleImageView) findViewById(R.id.img1);
        img2 = (CircleImageView) findViewById(R.id.img2);
        img3 = (CircleImageView) findViewById(R.id.img3);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.img1:
                callFragments(Constants.fragone);
                img1.setImageDrawable(getResources().getDrawable(R.drawable.ic_launcher_background));
                img2.setImageDrawable(getResources().getDrawable(R.drawable.bg_circle));
                img3.setImageDrawable(getResources().getDrawable(R.drawable.bg_circle));
                txt1.setTextColor(getResources().getColor(R.color.colorAccent));
                txt2.setTextColor(getResources().getColor(R.color.colorPrimary));
                txt3.setTextColor(getResources().getColor(R.color.colorPrimary));

                break;

            case R.id.img2:
                callFragments(Constants.fragtwo);
                img1.setImageDrawable(getResources().getDrawable(R.drawable.bg_circle));
                img2.setImageDrawable(getResources().getDrawable(R.drawable.ic_launcher_background));
                img3.setImageDrawable(getResources().getDrawable(R.drawable.bg_circle));
                txt1.setTextColor(getResources().getColor(R.color.colorPrimary));
                txt2.setTextColor(getResources().getColor(R.color.colorAccent));
                txt3.setTextColor(getResources().getColor(R.color.colorPrimary));


                break;

            case R.id.img3:
                callFragments(Constants.fragthree);
                img1.setImageDrawable(getResources().getDrawable(R.drawable.bg_circle));
                img2.setImageDrawable(getResources().getDrawable(R.drawable.bg_circle));
                img3.setImageDrawable(getResources().getDrawable(R.drawable.ic_launcher_background));
                txt1.setTextColor(getResources().getColor(R.color.colorPrimary));
                txt2.setTextColor(getResources().getColor(R.color.colorPrimary));
                txt3.setTextColor(getResources().getColor(R.color.colorAccent));


                break;

        }


    }

    public void callFragments(String fragment) {
        switch (fragment) {
            case Constants.fragone:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, new Fragone()).commit();

                break;
            case Constants.fragtwo:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, new FragTwo()).commit();
                break;


            case Constants.fragthree:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, new FragThree()).commit();
                break;


        }


    }


}
