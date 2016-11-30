package avier.jesse.josh.lsu.tour.guide.application.csc3380.team23.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ChooseActivity extends AppCompatActivity {
    ListView listView;      //list view variable.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        //Creating an array of strings of possible landmarks for a tour.
        Landmarks landmarks[] = new Landmarks[]{
                new Landmarks(R.drawable.tgalogo,"Student Union, Memorial Tower, Middleton Library, Foster Hall."),
                new Landmarks(R.drawable.tgalogo,"Pete Maravich Assembly Center, Tiger Stadium, Mike's Habitat, Alex Box Stadium")
        };

        //Linking adapter instance to layout list adapter.
        landmarksAdapter adapter = new landmarksAdapter(this,R.layout.list_layout,landmarks);

        listView = (ListView) findViewById(R.id.chooseList);                                            //Linking list view instance to layout list
        View header = (View) getLayoutInflater().inflate(R.layout.list_header,null);                    //Linking variable to a list header.
        listView.addHeaderView(header);                                                                 //Adding header to list.
        listView.setAdapter(adapter);                                                                   //Setting up list.

        ////////////////////////////////////////////////////////////////////////////////////////////
        //FUNCTION NAME: setOnItemClickListener                                                   //
        //FUNCTION PURPOSE: To create a response when a list item is tapped.                      //
        //                                                                                        //
        //PARAMETERS:                                                                             //
        //  1 - type: adapterView.                                                                //
        //  2 - type: view.                                                                       //
        //  3 - type: integer.                                                                    //
        //  4 - type: integer.                                                                    //
        //RETURN: Nothing.                                                                        //
        ////////////////////////////////////////////////////////////////////////////////////////////

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView textView = (TextView)view.findViewById(R.id.landmarkName);                     //Needed for function set up.
                if(i == 1){                                                                             //Recognizing item tapped on list
                    Intent intent1 = new Intent(getApplicationContext(),StudentUnionActivity.class);    //Variable to call Student Union Activity.
                    Intent intent2 = new Intent(getApplicationContext(),MemorialTowerActivity.class);   //Variable to call Memorial Tower Activity.
                    Intent intent3 = new Intent(getApplicationContext(),MiddletonActivity.class);       //Variable to call Middleton Activity.
                    Intent intent4 = new Intent(getApplicationContext(),FosterHallActivity.class);      //Variable to call Foster Hall Activity.
                    Intent intentSelect = new Intent(getApplicationContext(),SelectActivity.class);     //Variable to call Select Activity.
                    startActivity(intentSelect);                                                        //Calling Select Activity.
                    startActivity(intent4);                                                             //Calling Foster Hall Activity.
                    startActivity(intent3);                                                             //Calling Middleton Activity.
                    startActivity(intent2);                                                             //Calling Memorial Tower Activity.
                    startActivity(intent1);                                                             //Calling Student Union Activity.
                }
                if(i == 2){
                    Intent intent1 = new Intent(getApplicationContext(),PmacActivity.class);            //Variable to call PMAC Activity.
                    Intent intent2 = new Intent(getApplicationContext(),TigerStadiumActivity.class);    //Variable to call Tiger Stadium Activity.
                    Intent intent3 = new Intent(getApplicationContext(),MikeHabitatActivity.class);     //Variable to call Mike Habitat Activity.
                    Intent intent4 = new Intent(getApplicationContext(),AlexBoxStadiumActivity.class);  //Variable to call Alex Box Stadium Activity.
                    Intent intentSelect = new Intent(getApplicationContext(),SelectActivity.class);     //Variable to call Select Activity.
                    startActivity(intentSelect);                                                        //Calling Select Activity.
                    startActivity(intent4);                                                             //Calling Alex Box Stadium Activity.
                    startActivity(intent3);                                                             //Calling Mike Habitat Activity.
                    startActivity(intent2);                                                             //Calling Tiger Stadium Activity,
                    startActivity(intent1);                                                             //Calling PMAC Activity.
                }
            }
        });
    }
}
