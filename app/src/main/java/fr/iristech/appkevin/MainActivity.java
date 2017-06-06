package fr.iristech.appkevin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    EditText editText;
    String editTextContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == button){
            if (!editText.getText().toString().isEmpty()){
                editTextContent = editText.getText().toString();
                Log.e("MainActivity",editTextContent);
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("text",editTextContent);
                startActivity(intent);
            }
        }
    }
}
