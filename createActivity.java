package avier.jesse.josh.lsu.tour.guide.application.csc3380.team23.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class createActivity extends AppCompatActivity {
    ListView listView;      //List view variable.
    String selectedLandmark = "",     //String to hold selected landmark.
           intent1 = "",              //String to hold the first selected activity.
           intent2 = "",              //String to hold the second selected activity.
           intent3 = "",              //String to hold the third selected activity.
           intent4 = "";              //String to hold the fourth selected activity.
    int intentCounter = 0;            //Integer counter to know how many activities have been selected.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        final Intent intentSave = new Intent(getApplicationContext(),SaveTourActivity.class);       //Variable to call Save Tour Activity.

        //Creating an array of strings of possible landmarks for a tour.
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

        //Linking adapter java instance to list adapter layout.
        landmarksAdapter adapter = new landmarksAdapter(this,R.layout.list_layout,landmarks);

        listView = (ListView) findViewById(R.id.createList);                                        //Linking java list instance to layout list.
        View header = (View) getLayoutInflater().inflate(R.layout.list_header,null);                //Setting up the header for the list.
        listView.addHeaderView(header);                                                             //Linking header instance to layout list.
        listView.setAdapter(adapter);                                                               //Liking adapter instance to list layout.

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
                TextView textView = (TextView)view.findViewById(R.id.landmarkName);                 //Needed for function.
                selectedLandmark = (String) textView.getText();                                     //Storing landmark selected name in variable.
                //Checking if landmark has already been selected.
                if((selectedLandmark != intent1) && (selectedLandmark != intent2) && (selectedLandmark != intent3) && (selectedLandmark != intent4)) {
                    switch(selectedLandmark){
                        case "Alex Box Stadium":
                            //Storing landmark in one of the four intents.
                            if (intent1 == "")
                                intent1 = selectedLandmark;
                            else if (intent2 == "")
                                intent2 = selectedLandmark;
                            else if (intent3 == "")
                                intent3 = selectedLandmark;
                            else if (intent4 == "")
                                intent4 = selectedLandmark;
                            //Increasing counter to know how many landmarks remain.
                            intentCounter++;
                            //Displaying toast to let the user know.
                            Toast.makeText(getApplicationContext(),"You have " + (4 - intentCounter) + " landmarks left",Toast.LENGTH_SHORT).show();
                            //Variable to call Alex Box Activity.
                            Intent intentABS = new Intent(getApplicationContext(),AlexBoxStadiumActivity.class);
                            //Passing values to bundle on case of last landmark.
                            if(intentCounter == 4){
                                intentSave.putExtra("INTENT1",intent1);
                                intentSave.putExtra("INTENT2",intent2);
                                intentSave.putExtra("INTENT3",intent3);
                                intentSave.putExtra("INTENT4",intent4);
                                startActivity(intentSave);                       //Calling Save Tour activity
                            }
                            startActivity(intentABS);                            //Calling Alex Box Stadium activity.
                            break;
                        case "Foster Hall":
                            //Storing landmark in one of the four intents.
                            if (intent1 == "")
                                intent1 = selectedLandmark;
                            else if (intent2 == "")
                                intent2 = selectedLandmark;
                            else if (intent3 == "")
                                intent3 = selectedLandmark;
                            else if (intent4 == "")
                                intent4 = selectedLandmark;
                            //Increasing counter to know how many landmarks remain.
                            intentCounter++;
                            //Displaying toast to let the user know.
                            Toast.makeText(getApplicationContext(),"You have " + (4 - intentCounter) + " landmarks left",Toast.LENGTH_SHORT).show();
                            //Variable to call Foster Hall activity.
                            Intent intentFH = new Intent(getApplicationContext(),FosterHallActivity.class);
                            //Passing values to bundle on case of last landmark.
                            if(intentCounter == 4) {
                                intentSave.putExtra("INTENT1", intent1);
                                intentSave.putExtra("INTENT2", intent2);
                                intentSave.putExtra("INTENT3", intent3);
                                intentSave.putExtra("INTENT4", intent4);
                                startActivity(intentSave);                  //Calling Save Tour activity.
                            }
                            startActivity(intentFH);                        //Calling Foster Hall activity.
                            break;
                        case "Memorial Tower":
                            //Storing landmark in one of the four intents.
                            if (intent1 == "")
                                intent1 = selectedLandmark;
                            else if (intent2 == "")
                                intent2 = selectedLandmark;
                            else if (intent3 == "")
                                intent3 = selectedLandmark;
                            else if (intent4 == "")
                                intent4 = selectedLandmark;
                            //Increasing counter to know how many landmarks remain,
                            intentCounter++;
                            //Displaying a toast to let the user know.
                            Toast.makeText(getApplicationContext(),"You have " + (4 - intentCounter) + " landmarks left",Toast.LENGTH_SHORT).show();
                            //Variable to call Memorial Tower activity,
                            Intent intentMT = new Intent(getApplicationContext(),MemorialTowerActivity.class);
                            //Passing values to bundle on case of last activity.
                            if(intentCounter == 4) {
                                intentSave.putExtra("INTENT1", intent1);
                                intentSave.putExtra("INTENT2", intent2);
                                intentSave.putExtra("INTENT3", intent3);
                                intentSave.putExtra("INTENT4", intent4);
                                startActivity(intentSave);                  //Calling Save Tour activity.
                            }
                            startActivity(intentMT);                        //Calling Memorial Tower Activity.
                            break;
                        case "Middleton Library":
                            selectedLandmark = "Middleton";                 //Changing string to activity name.
                            //Storing landmark in one of the four intents.
                            if (intent1 == "")
                                intent1 = selectedLandmark;
                            else if (intent2 == "")
                                intent2 = selectedLandmark;
                            else if (intent3 == "")
                                intent3 = selectedLandmark;
                            else if (intent4 == "")
                                intent4 = selectedLandmark;
                            //Increasing counter to know how many landmarks remain.
                            intentCounter++;
                            //Displaying a toast to let the user know.
                            Toast.makeText(getApplicationContext(),"You have " + (4 - intentCounter) + " landmarks left",Toast.LENGTH_SHORT).show();
                            //Variable to call Middleton Activity.
                            Intent intentML = new Intent(getApplicationContext(),MiddletonActivity.class);
                            //Passing values to bundle on case of last landmark.
                            if(intentCounter == 4) {
                                intentSave.putExtra("INTENT1", intent1);
                                intentSave.putExtra("INTENT2", intent2);
                                intentSave.putExtra("INTENT3", intent3);
                                intentSave.putExtra("INTENT4", intent4);
                                startActivity(intentSave);                  //Calling Save Tour activity.
                            }
                            startActivity(intentML);                        //Calling Middleton Activity.
                            break;
                        case "Mike's Habitat":
                            selectedLandmark = "Mike Habitat";              //Changing string to activity name
                            //Storing string in one of the four intents.
                            if (intent1 == "")
                                intent1 = selectedLandmark;
                            else if (intent2 == "")
                                intent2 = selectedLandmark;
                            else if (intent3 == "")
                                intent3 = selectedLandmark;
                            else if (intent4 == "")
                                intent4 = selectedLandmark;
                            //Increasing counter to know how many landmark remain.
                            intentCounter++;
                            //Displaying a toast to let the user know.
                            Toast.makeText(getApplicationContext(),"You have " + (4 - intentCounter) + " landmarks left",Toast.LENGTH_SHORT).show();
                            //Variable to call Mike Habitat Activity.
                            Intent intentMH = new Intent(getApplicationContext(),MikeHabitatActivity.class);
                            //Passing values to bundle on case of last landmark.
                            if(intentCounter == 4) {
                                intentSave.putExtra("INTENT1", intent1);
                                intentSave.putExtra("INTENT2", intent2);
                                intentSave.putExtra("INTENT3", intent3);
                                intentSave.putExtra("INTENT4", intent4);
                                startActivity(intentSave);                  //Calling Save Tour activity.
                            }
                            startActivity(intentMH);                        //Calling Mike Habitat activity.
                            break;
                        case "Pete Maravich Assembly Center":
                            selectedLandmark = "Pmac";                      //Changing string to activity name.
                            //Storing String in one of the four intents.
                            if (intent1 == "")
                                intent1 = selectedLandmark;
                            else if (intent2 == "")
                                intent2 = selectedLandmark;
                            else if (intent3 == "")
                                intent3 = selectedLandmark;
                            else if (intent4 == "")
                                intent4 = selectedLandmark;
                            //Increasing counter to know how many landmarks remain.
                            intentCounter++;
                            //Displaying a toast to let the user know.
                            Toast.makeText(getApplicationContext(),"You have " + (4 - intentCounter) + " landmarks left",Toast.LENGTH_SHORT).show();
                            //Variable to call PMAC activity.
                            Intent intentPMAC = new Intent(getApplicationContext(),PmacActivity.class);
                            //Passing values to bundle on case of last landmark.
                            if(intentCounter == 4) {
                                intentSave.putExtra("INTENT1", intent1);
                                intentSave.putExtra("INTENT2", intent2);
                                intentSave.putExtra("INTENT3", intent3);
                                intentSave.putExtra("INTENT4", intent4);
                                startActivity(intentSave);                  //Calling Save Tour activity.
                            }
                            startActivity(intentPMAC);                      //Calling PMAC activity.
                            break;
                        case "Student Union":
                            //Storing string in one of the four intents.
                            if (intent1 == "")
                                intent1 = selectedLandmark;
                            else if (intent2 == "")
                                intent2 = selectedLandmark;
                            else if (intent3 == "")
                                intent3 = selectedLandmark;
                            else if (intent4 == "")
                                intent4 = selectedLandmark;
                            //Increasing counter to know how many landmark remain.
                            intentCounter++;
                            //Displaying a toast to let the user know.
                            Toast.makeText(getApplicationContext(),"You have " + (4 - intentCounter) + " landmarks left",Toast.LENGTH_SHORT).show();
                            //Variable to call Student Union activity.
                            Intent intentSU = new Intent(getApplicationContext(),StudentUnionActivity.class);
                            //Passing values to bundle on case of last landmark.
                            if(intentCounter == 4) {
                                intentSave.putExtra("INTENT1", intent1);
                                intentSave.putExtra("INTENT2", intent2);
                                intentSave.putExtra("INTENT3", intent3);
                                intentSave.putExtra("INTENT4", intent4);
                                startActivity(intentSave);                  //Calling Save Tour activity.
                            }
                            startActivity(intentSU);                        //Calling Student Union activity.
                            break;
                        case "Tiger Stadium":
                            //Storing string in one of the four intents.
                            if (intent1 == "")
                                intent1 = selectedLandmark;
                            else if (intent2 == "")
                                intent2 = selectedLandmark;
                            else if (intent3 == "")
                                intent3 = selectedLandmark;
                            else if (intent4 == "")
                                intent4 = selectedLandmark;
                            //Increasing counter to know how many landmark remain.
                            intentCounter++;
                            //Displaying a toast to let the user know.
                            Toast.makeText(getApplicationContext(),"You have " + (4 - intentCounter) + " landmarks left",Toast.LENGTH_SHORT).show();
                            //Variable to call Tiger Stadium activity.
                            Intent intentTG = new Intent(getApplicationContext(),TigerStadiumActivity.class);
                            //Passing values to bundle on case of last landmark.
                            if(intentCounter == 4) {
                                intentSave.putExtra("INTENT1", intent1);
                                intentSave.putExtra("INTENT2", intent2);
                                intentSave.putExtra("INTENT3", intent3);
                                intentSave.putExtra("INTENT4", intent4);
                                startActivity(intentSave);                  //Calling Save Tour activity.
                            }
                            startActivity(intentTG);                        //Calling Tiger Stadium activity.
                            break;
                        default: break;
                    }
                }
                //If landmark has been selected, Display a warning toast.
                else
                    Toast.makeText(getApplicationContext(),"This landmark has been already selected",Toast.LENGTH_SHORT).show();
            }
        });
    }
}