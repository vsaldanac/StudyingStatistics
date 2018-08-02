package cl.vero.studyingstatistics;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

import cl.vero.studyingstatistics.adapters.StatisticalConceptAdapter;
import cl.vero.studyingstatistics.models.StatisticalConcept;

import static cl.vero.studyingstatistics.R.id.toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.statisticalConceptRv);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);

        List<StatisticalConcept> statisticalConceptList = new ArrayList<>();
        for (int i = 1; i < 5 ; i++) {
            String aux = String.valueOf(i);
            StatisticalConcept statisticalConcept = new StatisticalConcept(aux,aux,i);
            statisticalConceptList.add(statisticalConcept);
        }


        StatisticalConceptAdapter adapter = new StatisticalConceptAdapter(statisticalConceptList);
        recyclerView.setAdapter(adapter);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
