package avier.jesse.josh.lsu.tour.guide.application.csc3380.team23.project;

//Packages needed.
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button welcomeButton;     //welcome button.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcomeButton = (Button) findViewById(R.id.welcomeButton);  //Linking java code instance to layout view.
        welcomeButton.setOnClickListener(this);                     //Activating the button.
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
            case R.id.welcomeButton:                                                                    //Recognizing button.
                Toast.makeText(getApplicationContext(),"ENJOY OUR CAMPUS",Toast.LENGTH_SHORT).show();   //Toast to welcome the user to the system.
                Intent intent = new Intent(this,SelectActivity.class);                                  //Variable to call next activity.
                startActivity(intent);                                                                  //Calling next activity.
                break;
            default: break;
        }
    }
}
