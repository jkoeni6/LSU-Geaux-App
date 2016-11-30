package avier.jesse.josh.lsu.tour.guide.application.csc3380.team23.project;

//Packages needed.
import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SaveTourActivity extends AppCompatActivity implements View.OnClickListener {
    Button saveButton,             //Save button.
           discardButton;          //Discard button.
    Intent mainLayoutIntent,       //Intent variable.
           intent;                 //Intent variable.
    Bundle bundle;                 //Bundle variable.
    String path = Environment.getExternalStorageDirectory().getAbsolutePath() + "/lsuGeauxApp", //Path to memory.
           intent1,                //String variable.
           intent2,                //String variable.
           intent3,                //String variable.
           intent4;                //String variable.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_tour);

        mainLayoutIntent = new Intent(this,SelectActivity.class);   //Variable to call Select activity.
        saveButton = (Button) findViewById(R.id.saveButton);        //Linking button java code instance to layout view.
        saveButton.setOnClickListener(this);                        //Activating button.
        discardButton = (Button) findViewById(R.id.discardButton);  //Linking button java code instance to layout view.
        discardButton.setOnClickListener(this);                     //Activating button java code instance to layout view.
        intent = getIntent();                                       //Getting intent instance.
        bundle = intent.getExtras();                                //Getting values in bundle.

        //Making sure bundle is not empty.
        if(bundle!=null){
            //Storing values from bundle to strings.
            intent1 = (String) bundle.get("INTENT1");
            intent2 = (String) bundle.get("INTENT2");
            intent3 = (String) bundle.get("INTENT3");
            intent4 = (String) bundle.get("INTENT4");
        }

        //Accessing directory.
        File dir = new File(path);
        dir.mkdirs();

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCTION NAME: onClick                                                                      //
    //FUNCTION PURPOSE: To create a response when a button is tap.                                //
    //                                                                                            //
    //PARAMETERS:                                                                                 //
    //  1 - type: View                                                                            //
    //RETURN: Nothing.                                                                            //
    ////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.saveButton:
                //Creating file.
                File file = new File(path + "/savedTours.txt");
                String [] tours = {intent1 + ", " + intent2 + ", " + intent3 + ", " + intent4};
                Save (file, tours);
                Toast.makeText(getApplicationContext(),"TOUR HAS BEEN SAVED",Toast.LENGTH_SHORT).show();
                startActivity(mainLayoutIntent);
                break;
            case R.id.discardButton:
                Toast.makeText(getApplicationContext(),"TOUR HAS BEEN DISCARDED",Toast.LENGTH_SHORT).show();
                startActivity(mainLayoutIntent);
                break;
            default: break;
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCTION NAME: Save                                                                         //
    //FUNCTION PURPOSE: To save text in file.                                                     //
    //                                                                                            //
    //PARAMETERS:                                                                                 //
    //  1 - type: File.                                                                           //
    //  2 - type: String[]                                                                        //
    //RETURN: Nothing.                                                                            //
    ////////////////////////////////////////////////////////////////////////////////////////////////

    public static void Save(File file, String[] tours) {
        FileOutputStream fos = null;                            //Variable to write to file.
        try {
            fos = new FileOutputStream(file);                   //Opening file.
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            try {
                for (int i = 0; i < tours.length; i++) {        //Writing to file.
                    fos.write(tours[i].getBytes());
                    if (i < tours.length - 1) {
                        fos.write("\n".getBytes());
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } finally {
            try {
                fos.close();                                    //Closing file.
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}