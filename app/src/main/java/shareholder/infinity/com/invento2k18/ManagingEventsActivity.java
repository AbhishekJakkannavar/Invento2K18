package shareholder.infinity.com.invento2k18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ManagingEventsActivity extends AppCompatActivity {

    ImageButton technicalevent;
    ImageButton semitechnical;
    ImageButton cultural;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_managing_events);


        technicalevent = (ImageButton)findViewById(R.id.technicalevent);
        technicalevent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManagingEventsActivity.this,EventsActivity.class);
                startActivity(intent);
            }
        });


        semitechnical = (ImageButton)findViewById(R.id.semitechnical);
        semitechnical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManagingEventsActivity.this,SemitechnicalActivity.class);
                startActivity(intent);
            }
        });

        cultural = (ImageButton)findViewById(R.id.cultural);
        cultural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManagingEventsActivity.this,CulturalActivity.class);
                startActivity(intent);
            }
        });
    }
}
