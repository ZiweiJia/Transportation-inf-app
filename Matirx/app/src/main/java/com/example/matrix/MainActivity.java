package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
//import android.widget.ArrayAdapter;
//import android.widget.ListView;
import androidx.fragment.app.Fragment;
import android.content.res.Configuration;

import com.example.matrix.R;

public class MainActivity extends AppCompatActivity implements ListFragment.OnItemSelectListener, GridFragment.OnItemSelectListener {
    private ListFragment listFragment;
    private GridFragment gridFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Log.e("Life cycle test", "We are at onCreate()");
        // Get ListView object from xml.
        // Show different fragments based on screen size.
        //add list view
        if (getSupportFragmentManager().findFragmentById(R.id.list_container) == null) {
            listFragment = new ListFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.list_container, listFragment).commit();
        }

        //add Gridview
        if (getSupportFragmentManager().findFragmentById(R.id.grid_container) == null && isTablet()) {
            gridFragment = new GridFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.grid_container, gridFragment).commit();
        }

    }

    private boolean isTablet() {
        return (getApplicationContext().getResources().getConfiguration().screenLayout &
                Configuration.SCREENLAYOUT_SIZE_MASK) >=
                Configuration.SCREENLAYOUT_SIZE_LARGE;
    }



    /**
     * A dummy function to get fake event names.
     */



    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Life cycle test", "We are at onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Life cycle test", "We are at onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Life cycle test", "We are at onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Life cycle test", "We are at onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Life cycle test", "We are at onDestroy()");
    }

    @Override
    public void onItemSelected(int position) {
        if (!isTablet()) {
            Fragment fragment = GridFragment.newInstance(position);
            getSupportFragmentManager().beginTransaction().replace(R.id.list_container, fragment).addToBackStack(null).commit();

        } else {
            gridFragment.onItemSelected(position);
        }
    }
    @Override
    public void onCommentSelected(int position) {
        listFragment.onItemSelected(position);
    }


}
