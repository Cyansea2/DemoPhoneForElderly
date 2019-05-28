package sg.edu.rp.c346.demophoneforelderly;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnson;
    Button btnDaughter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnson = findViewById(R.id.btnSon);
        btnDaughter = findViewById(R.id.btnDaughter);

        btnson.findViewById(R.id.btnSon);
        btnDaughter.findViewById(R.id.btnDaughter);

        btnson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+92240336));
                startActivity(intentCall);
            }
        });

        btnDaughter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+89675543));
                startActivity(intentCall);
            }
        });
    }



    }
