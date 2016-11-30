package avier.jesse.josh.lsu.tour.guide.application.csc3380.team23.project;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class SaveActivity extends AppCompatActivity {
    ListView listView;                                                                          //List view variable.
    String path = Environment.getExternalStorageDirectory().getAbsolutePath() + "/lsuGeauxApp"; //Path to memory.
    String packagePath = "avier.jesse.josh.lsu.tour.guide.application.csc3380.team23.project."; //Package path
    String  intents,                                                                            //String variable.
            act1,                                                                               //String variable.
            act2,                                                                               //String variable.
            act3,                                                                               //String variable.
            act4;                                                                               //String variable.
    int i = 0,                                                                                  //Integer variable.
        counter = 0;                                                                            //Integer variable.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);

        File file = new File(path + "/savedTours.txt");         //Mapping file.
        String[] loadText = Load(file);                         //String to get text from file.

        //Array of strings with all possible landmarks.
        Landmarks landmarks[] = new Landmarks[]{
                new Landmarks(R.drawable.tgalogo, loadText[0])
        };

        //Getting the string containing all possible landmarks.
        intents = loadText[0];

        //Dividing string by landmarks.
        while(counter<4){
            switch(counter){
                case 0: act1 = intents.substring(0, intents.indexOf(','));
                        intents = intents.substring(intents.indexOf(',') + 2, intents.length());
                    break;
                case 1: act2 = intents.substring(0, intents.indexOf(','));
                    intents = intents.substring(intents.indexOf(',') + 2, intents.length());
                    break;
                case 2: act3 = intents.substring(0, intents.indexOf(','));
                    intents = intents.substring(intents.indexOf(',') + 2, intents.length());
                    break;
                case 3: act4 = intents.substring(0, intents.length());
                    break;
            }
            counter++;
        }

        //Removing space between landmarks.
        counter = 0;
        while (counter < 4){
            switch (counter){
                case 0: act1 = RemoveSpace(act1);
                    break;
                case 1: act2 = RemoveSpace(act2);
                    break;
                case 2: act3 = RemoveSpace(act3);
                    break;
                case 3: act4 = RemoveSpace(act4);
                    break;
            }
            counter++;
        }

        //Creating path to activity.
        counter = 0;
        while (counter < 4){
            switch (counter){
                case 0: act1 = packagePath + act1 + "Activity";
                    break;
                case 1: act2 = packagePath + act2 + "Activity";
                    break;
                case 2: act3 = packagePath + act3 + "Activity";
                    break;
                case 3: act4 = packagePath + act4 + "Activity";
                    break;
            }
            counter++;
        }

        //Linking java code adapter to layout list adapter.
        landmarksAdapter adapter = new landmarksAdapter(this, R.layout.list_layout, landmarks);
        //Linking java code list to layout list.
        listView = (ListView) findViewById(R.id.saveList);
        //Linking java code header to layout header.
        View header = (View) getLayoutInflater().inflate(R.layout.list_header, null);
        //Adding header to list.
        listView.addHeaderView(header);
        //Adding adapter to list.
        listView.setAdapter(adapter);

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
                TextView textView = (TextView) view.findViewById(R.id.landmarkName);                //Needed by function.
                //Cleaning all intent variables.
                Intent intent1 = null;
                Intent intent2 = null;
                Intent intent3 = null;
                Intent intent4 = null;
                Intent intentSelect = new Intent(getApplicationContext(),SelectActivity.class);     //Variable to call Select activity.

                if (i == 1) {
                    //Casting from string to activity class.
                    try {
                        intent1 = new Intent(getBaseContext(), Class.forName(act1));
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    try {
                        intent2 = new Intent(getBaseContext(), Class.forName(act2));
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    try {
                        intent3 = new Intent(getBaseContext(), Class.forName(act3));
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    try {
                        intent4 = new Intent(getBaseContext(), Class.forName(act4));
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    //Calling activities
                    startActivity(intentSelect);
                    startActivity(intent4);
                    startActivity(intent3);
                    startActivity(intent2);
                    startActivity(intent1);
                }
            }
        });
    }

    ////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCTION NAME: RemoveSpace                                                              //
    //FUNCTION PURPOSE: To remove blank spaces among a string.                                //
    //                                                                                        //
    //PARAMETERS:                                                                             //
    //  1 - type: String                                                                      //
    //RETURN: String.                                                                         //
    ////////////////////////////////////////////////////////////////////////////////////////////


    public static String RemoveSpace(String string){
       int counter = 0;

       //Making sure counter does not exceed string's lenght.
       while(counter < string.length()){
           char ch = string.charAt(counter);                    //char variable to transverse the string.
           if (ch == ' ') {                                     //checking is a blank space is encountered.
               //Cutting string.
               String before = string.substring(0, counter);
               String after = string.substring(counter + 1);
               //Adding string.
               string = before + after;
           } else
               counter++;
       }

       //returning final string.
       return string;
   }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCTION NAME: Load                                                                         //
    //FUNCTION PURPOSE: To load text from a file.                                                 //
    //                                                                                            //
    //PARAMETERS:                                                                                 //
    //  1 - type: File.                                                                           //
    //RETURN: String.                                                                             //
    ////////////////////////////////////////////////////////////////////////////////////////////////

   public static String[] Load(File file) {
        FileInputStream fis = null;                                 //Variable to read from file.
        try{
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {e.printStackTrace();}
        InputStreamReader isr = new InputStreamReader(fis);         //Reading from file.
        BufferedReader br = new BufferedReader(isr);
        String test;
        int anzahl=0;
        try{
            while((test=br.readLine()) != null)
                anzahl++;
        } catch (IOException e) {e.printStackTrace();}
        try{
            fis.getChannel().position(0);
        }catch (IOException e) {e.printStackTrace();}
        String[] array = new String[anzahl];
        String line;
        int i=0;
        try{
            while((line=br.readLine()) != null){
                array[i]=line;
                i++;
            }
        } catch (IOException e) {e.printStackTrace();}
        return  array;
    }
}