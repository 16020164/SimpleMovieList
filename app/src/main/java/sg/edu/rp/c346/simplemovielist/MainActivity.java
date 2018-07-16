package sg.edu.rp.c346.simplemovielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    //step 1b: Create a ListView Variable
    ListView lvMovie;
    //step 2a: Create an ArrayList variable
    ArrayList<String> alMovieList;
    //step 3a: Create an ArrayAdapter variable
    ArrayAdapter<String> aaMovie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //step 1c: bind the listView UI element to the java variable
        lvMovie = findViewById(R.id.listViewMovie);

        //step 2b: initialize the ArrayList
        alMovieList = new ArrayList<>();

        //step 2c: add data into ArrayList
        alMovieList.add("Avengers Infinity War  Release Date: 2018.04");
        alMovieList.add("Justice League  Release Date: 2017.11");

        //step 3b: initialise the ArrayAdapter and bind it to the ArrayList
        aaMovie = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alMovieList);

        //step 4: Bind ListView to the ArrayAdapter
        lvMovie.setAdapter(aaMovie);
    }
}
