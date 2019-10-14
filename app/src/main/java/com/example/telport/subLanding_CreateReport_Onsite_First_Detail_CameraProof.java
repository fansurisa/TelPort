package com.example.telport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class subLanding_CreateReport_Onsite_First_Detail_CameraProof extends AppCompatActivity {

    AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.85F);

    // Define the pic id
    private static final int pic_id = 123;

    // Define the button and imageview type variable
    Button camera_submit, btnBack;
    ImageView click_image_id;
    Boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_report_onsite_first_detail_cameraproof);

        // By ID we can getr1 each component
        // which id is assigned in XML file
        // getr1 Buttons and imageview.
        click_image_id = findViewById(R.id.click_image);
        camera_submit = findViewById(R.id.btnSubmit);
        btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        camera_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(buttonClick);
                Intent goToSubmit = new Intent(subLanding_CreateReport_Onsite_First_Detail_CameraProof.this, A_mainLandingPage.class);
                Toast.makeText(getApplicationContext(), "Report Submitted", Toast.LENGTH_LONG).show();
                startActivity(goToSubmit);
                overridePendingTransition(R.anim.slide_in_bot, R.anim.slide_out_top); //ttb
            }
        });

        // Camera_open button is for open the camera
        // and add the setOnClickListener in this button
        click_image_id.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                // Create the camera_intent ACTION_IM1AGE_CAPTURE
                // it will open the camera for capture the image
                Intent camera_intent
                        = new Intent(MediaStore
                        .ACTION_IMAGE_CAPTURE);

                // Start the activity with camera_intent,
                // and request pic id
                startActivityForResult(camera_intent, pic_id);
            }
        });
    }

    // This method will help to retrieve the image
    protected void onActivityResult(int requestCode,
                                    int resultCode,
                                    Intent data) {

        // Match the request 'pic id with requestCode
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == pic_id) {

            // BitMap is data structure of image file
            // which stor the image in memory
            Bitmap photo = (Bitmap) data.getExtras()
                    .get("data");

            // Set the image in imageview for display
            click_image_id.setImageBitmap(photo);
        }
    }
}