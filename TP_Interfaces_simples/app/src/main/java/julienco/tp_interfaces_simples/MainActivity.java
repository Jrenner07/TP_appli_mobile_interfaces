package julienco.tp_interfaces_simples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_start);




        Button MyButton = (Button)findViewById(R.id.MonBoutton);


        MyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent monIntent = new Intent(MainActivity.this, act_authentification.class);
                startActivity(monIntent);

            }


        });





    }
}
