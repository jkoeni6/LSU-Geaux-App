package avier.jesse.josh.lsu.tour.guide.application.csc3380.team23.project;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;     //Variable to interact with Google maps.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        double latitude = 0, longitude = 0;

        Intent intent = getIntent();        //Getting intent instance.
        Bundle bundle = intent.getExtras(); //Getting values from bundle.

        //Checking that bundle is not empty before accessing it.
        if(bundle!=null){
            latitude = (double) bundle.get("LATITUDE");
            longitude = (double) bundle.get("LONGITUDE");
        }


        // Add a marker and move the camera
        LatLng landmark = new LatLng(latitude, longitude);

        mMap.addMarker(new MarkerOptions().position(landmark).title("Marker"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(landmark,15));
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)   //Making sure user has granted GPS permission.
                == PackageManager.PERMISSION_GRANTED) {
            mMap.setMyLocationEnabled(true);                                                    //Accessing user current GPS location.
        }
    }
}
