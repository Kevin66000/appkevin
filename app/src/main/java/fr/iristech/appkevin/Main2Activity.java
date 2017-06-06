package fr.iristech.appkevin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {
    TextView textView;
    String textRecuperer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textRecuperer = getIntent().getExtras().getString("text");

        textView = (TextView) findViewById(R.id.textView);

        textView.setText(textRecuperer);

    }
}
