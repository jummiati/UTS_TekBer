package test.web.uts_tekber;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.view.Menu;
import android.os.Bundle;
import android.widget.EditText;

public class Activitya extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        Button buttone = (Button) findViewById(R.id.buttone);
        buttone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Activityb.class);
                startActivity(i);

            }
        });
    }
}

