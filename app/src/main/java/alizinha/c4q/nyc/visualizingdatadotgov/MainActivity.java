package alizinha.c4q.nyc.visualizingdatadotgov;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import alizinha.c4q.nyc.visualizingdatadotgov.adapters.DeathDataListAdapter;
import alizinha.c4q.nyc.visualizingdatadotgov.asyncTasks.NycDeathCauseLoadTask;
import alizinha.c4q.nyc.visualizingdatadotgov.models.NycLeadingCausesDeath;


public class MainActivity extends ActionBarActivity {
    private NycDeathCauseLoadTask nycDeathCauseLoadTask;
    private NycLeadingCausesDeath nycLeadingCausesDeath;

    private DeathDataListAdapter deathDataListAdapter;

    Button showDataBtn = null;
    Spinner yearSpinner = null;
    Spinner ethnicitySpinner = null;

    boolean dataRetrieved = false;

    // handler for received Intents for the "NYC_LEADING_CAUSE_DEATH_DATA_READY" event
    private BroadcastReceiver nycDataBroadcast = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) { //message coming from ASYNC task loader
            nycLeadingCausesDeath = nycDeathCauseLoadTask.getNycLeadingCausesDeath();//saving into my activity's instance property from the Async Task
            Log.d("Receiver", "Received nycLeadingCausesDeath" + nycLeadingCausesDeath.getDeathCauseDataList().size());
            dataRetrieved = true;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showDataBtn = (Button) findViewById(R.id.show_data_btn);
        yearSpinner = (Spinner) findViewById(R.id.year_spinner);
        ethnicitySpinner = (Spinner) findViewById(R.id.ethnicity_spinner);

        RecyclerView rvDeathRowData = (RecyclerView) findViewById(R.id.death_data_list);
        rvDeathRowData.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rvDeathRowData.setLayoutManager(llm);

        deathDataListAdapter = new DeathDataListAdapter();
        rvDeathRowData.setAdapter(deathDataListAdapter);

        showDataBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dataRetrieved) {
                    //(1) load the data into Adapter
                    deathDataListAdapter.setDeathdataList(nycLeadingCausesDeath.getFilteredDeathData("2010", "NON-HISPANIC WHITE", "FEMALE"));

                    //(2) call Adapter's notifyDataChanged() method
                    deathDataListAdapter.notifyDataSetChanged();
                }
                else {

                    Toast.makeText(MainActivity.this, "Data not retreived yet. Please retry", Toast.LENGTH_SHORT).show();

                }
            }
        });

        //set up listener for local broadcast sent by the AsyncTask below (that is: nycDeathCauseLoadTask)
        LocalBroadcastManager.getInstance(this).registerReceiver(nycDataBroadcast,
                new IntentFilter(NycDeathCauseLoadTask.NYC_LEADING_CAUSE_DEATH_DATA_READY));


        //this is what fires off the Async Task. when it finishes executing it's broadcasting the local intent
        nycDeathCauseLoadTask = new NycDeathCauseLoadTask(this);
        nycDeathCauseLoadTask.execute();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
