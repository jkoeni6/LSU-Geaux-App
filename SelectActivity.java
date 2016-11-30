package avier.jesse.josh.lsu.tour.guide.application.csc3380.team23.project;

//Packages needed.
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class SelectActivity extends FragmentActivity implements View.OnClickListener {
    Button createButton,    //create feature button.
           chooseButton,    //choose feature button.
           findButton,      //find feature button.
           saveButton;      //save feature button.
    private GoogleMap mMap; //variable to interact with Google Map services.
    private static final LatLng lsuCoo = new LatLng(30.413258,-91.180002); //variable to store lsu campus geographic location.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        setUpMapIfNeeded();
        createButton = (Button) findViewById(R.id.createButton);    //Linking java code instance to layout view.
        createButton.setOnClickListener(this);                      //Activating the button.
        chooseButton = (Button) findViewById(R.id.chooseButton);    //Linking java code instance to layout view.
        chooseButton.setOnClickListener(this);                      //Activating the button.
        findButton = (Button) findViewById(R.id.findButton);        //Linking java code instance to layout view.
        findButton.setOnClickListener(this);                        //Activating the button.
        saveButton = (Button) findViewById(R.id.saveButton);        //Linking java code instance to layout view.
        saveButton.setOnClickListener(this);                        //Activating the button.
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCTION NAME: onResume                                                                     //
    //FUNCTION PURPOSE: To request Google Maps services.                                          //
    //                                                                                            //
    //PARAMETERS:                                                                                 //
    //  NONE.                                                                                     //
    //RETURN: Nothing.                                                                            //
    ////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();     //calling function.
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCTION NAME: setUpMapIfNeeded                                                             //
    //FUNCTION PURPOSE: To set up google map in fragmment.                                        //
    //                                                                                            //
    //PARAMETERS:                                                                                 //
    //  NONE                                                                                      //
    //RETURN: Nothing.                                                                            //
    ////////////////////////////////////////////////////////////////////////////////////////////////

    private void setUpMapIfNeeded() {
        //Do a null check to confirm that we have not already instantiated the map.
        if (mMap == null) {
            //Try to obtain the map from the support map fragment in API.
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.personalMap)).getMap();
            //Check if we were successfull in obtaining the map.
            if (mMap != null) {
                setUpMap();     //calling function.
            }
        }
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCTION NAME: setUpMap.                                                                    //
    //FUNCTION PURPOSE: To set up map with initial values        .                                //
    //                                                                                            //
    //PARAMETERS:                                                                                 //
    //  NONE                                                                                      //
    //RETURN: Nothing.                                                                            //
    ////////////////////////////////////////////////////////////////////////////////////////////////

    private void setUpMap() {
        mMap.addMarker(new MarkerOptions().position(lsuCoo).title("Me"));                       //Adding a marker to a specific location on map.
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lsuCoo,15));                          //Moving map view to a specific location.
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)   //Ensuring that user has granted location permissions.
                == PackageManager.PERMISSION_GRANTED) {
            mMap.setMyLocationEnabled(true);                                                    //Requesting user current location.
        }
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
            case R.id.createButton:
                Intent intentCreate = new Intent(this,createActivity.class);    //Variable to call create activity.
                startActivity(intentCreate);                                    //Calling create activity.
                break;
            case R.id.chooseButton:
                Intent intentChoose = new Intent(this,ChooseActivity.class);    //Variable to call choose activity.
                startActivity(intentChoose);                                    //Calling choose activity.
                break;
            case R.id.findButton:
                Intent intentFind = new Intent(this,FindActivity.class);        //Variable to call find activity.
                startActivity(intentFind);                                      //Calling find activity.
                break;
            case R.id.saveButton:
                Intent intentSave = new Intent(this,SaveActivity.class);        //Variable to call save activity.
                startActivity(intentSave);                                      //Calling save activity.
                break;
            default: break;
        }
    }
}