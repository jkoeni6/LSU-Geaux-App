package avier.jesse.josh.lsu.tour.guide.application.csc3380.team23.project;

//Packages needed.
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class FindActivity extends AppCompatActivity {
    ListView    listView;   //List view variable.
    String      string;     //String variable.
    double      latitude,   //Double variable.
                longitude;  //Double variable.
    int counter = 0;        //Integer variable.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);
        final Intent intentReturn = new Intent(getApplicationContext(),SelectActivity.class);   //Variable to call Select activity.

        //Array of strings of possible landmarks on campus.
        Landmarks landmarks[] = new Landmarks[]{
                new Landmarks(R.drawable.alexbox,"Alex Box Stadium"),
                new Landmarks(R.drawable.fosterhall,"Foster Hall"),
                new Landmarks(R.drawable.memorialtower,"Memorial Tower"),
                new Landmarks(R.drawable.middleton,"Middleton Library"),
                new Landmarks(R.drawable.mikehabitat,"Mike's Habitat"),
                new Landmarks(R.drawable.pmac,"Pete Maravich Assembly Center"),
                new Landmarks(R.drawable.studentunion,"Student Union"),
                new Landmarks(R.drawable.tigerstadium,"Tiger Stadium")
        };

       landmarksAdapter adapter = new landmarksAdapter(this,R.layout.list_layout,landmarks);     //Linking adapter instance to layout list adapter.
        listView = (ListView) findViewById(R.id.findList);                                       //Linking listview to layout list.
        View header = (View) getLayoutInflater().inflate(R.layout.list_header,null);             //Linking header to layout list header.
        listView.addHeaderView(header);                                                          //Adding header to layout list.
        listView.setAdapter(adapter);                                                            //Adding adapter to layout list adapter,

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
                TextView textView = (TextView)view.findViewById(R.id.landmarkName);                     //Needed by function.
                string = (String) textView.getText();                                                   //Getting the name of the tapped item.
                switch(string){
                       case "Alex Box Stadium":
                           Intent intentABS = new Intent(getApplicationContext(),MapsActivity.class);   //Variable to call activity Alex Box Stadium.
                           latitude = 30.405652;                                                        //Alex Box Stadium latitude.
                           longitude = -91.188047;                                                      //Alex Box Stadium longitude.
                           intentABS.putExtra("LATITUDE",latitude);                                     //Passing value to bundle.
                           intentABS.putExtra("LONGITUDE",longitude);                                   //Passing value to bundle.
                           counter++;                                                                   //Increasing counter.
                           if(counter == 1)
                               startActivity(intentReturn);                                             //Returning to main menu.
                           startActivity(intentABS);                                                    //Calling Alex Box Stadium activity.
                           break;
                       case "Foster Hall":
                           Intent intentFH = new Intent(getApplicationContext(),MapsActivity.class);
                           latitude = 30.415361;
                           longitude = -91.180076;
                           intentFH.putExtra("LATITUDE",latitude);
                           intentFH.putExtra("LONGITUDE",longitude);
                           counter++;
                           if(counter == 1)
                               startActivity(intentReturn);
                           startActivity(intentFH);
                           break;
                       case "Memorial Tower":
                           Intent intentMT = new Intent(getApplicationContext(),MapsActivity.class);
                           latitude = 30.414454;
                           longitude = -91.178885;
                           intentMT.putExtra("LATITUDE",latitude);
                           intentMT.putExtra("LONGITUDE",longitude);
                           counter++;
                           if(counter == 1)
                               startActivity(intentReturn);
                           startActivity(intentMT);
                           break;
                       case "Middleton Library":
                           Intent intentML = new Intent(getApplicationContext(),MapsActivity.class);
                           latitude = 30.414232;
                           longitude = -91.180065;
                           intentML.putExtra("LATITUDE",latitude);
                           intentML.putExtra("LONGITUDE",longitude);
                           counter++;
                           if(counter == 1)
                               startActivity(intentReturn);
                           startActivity(intentML);
                           break;
                       case "Mike's Habitat":
                           Intent intentMH = new Intent(getApplicationContext(),MapsActivity.class);
                           latitude = 30.413387;
                           longitude = -91.185062;
                           intentMH.putExtra("LATITUDE",latitude);
                           intentMH.putExtra("LONGITUDE",longitude);
                           counter++;
                           if(counter == 1)
                               startActivity(intentReturn);
                           startActivity(intentMH);
                           break;
                       case "Pete Maravich Assembly Center":
                           Intent intentPMAC = new Intent(getApplicationContext(),MapsActivity.class);
                           latitude = 30.414238;
                           longitude = -91.184171;
                           intentPMAC.putExtra("LATITUDE",latitude);
                           intentPMAC.putExtra("LONGITUDE",longitude);
                           counter++;
                           if(counter == 1)
                               startActivity(intentReturn);
                           startActivity(intentPMAC);
                           break;
                       case "Student Union":
                           Intent intentSU = new Intent(getApplicationContext(),MapsActivity.class);
                           latitude = 30.412661;
                           longitude = -91.177005;
                           intentSU.putExtra("LATITUDE",latitude);
                           intentSU.putExtra("LONGITUDE",longitude);
                           counter++;
                           if(counter == 1)
                               startActivity(intentReturn);
                           startActivity(intentSU);
                           break;
                       case "Tiger Stadium":
                           Intent intentTG = new Intent(getApplicationContext(),MapsActivity.class);
                           latitude = 30.412014;
                           longitude = -91.183732;
                           intentTG.putExtra("LATITUDE",latitude);
                           intentTG.putExtra("LONGITUDE",longitude);
                           counter++;
                           if(counter == 1)
                               startActivity(intentReturn);
                           startActivity(intentTG);
                           break;
                       default: break;
                }
                }
        });
    }
}
