package julienco.tp_interfaces_simples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class act_authentification extends AppCompatActivity {

    final String Nom = "user_Nom";
    final String Prenom = "user_Prenom";
    final String DateDeNaissance = "user_DateDeNaissance";
    final String Email = "user_Email";
    final String Adresse = "user_Adresse";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_authentification);


        Button MyButton = (Button)findViewById(R.id.button_Valide);

        final TextView Tnom = (TextView)findViewById(R.id.Text_Nom);
        final TextView Tprenom = (TextView)findViewById(R.id.Text_Prenom);
        final TextView TdateDeNaissance = (TextView)findViewById(R.id.Text_DateDeNaissance);
        final TextView Temail = (TextView)findViewById(R.id.Text_Email);
        final TextView Tadresse = (TextView)findViewById(R.id.Text_Adresse);


        MyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent monIntent = new Intent(act_authentification.this, act_Menu.class);

                monIntent.putExtra(Nom, Tnom.getText().toString());
                monIntent.putExtra(Prenom, Tprenom.getText().toString());
                monIntent.putExtra(DateDeNaissance, TdateDeNaissance.getText().toString());
                monIntent.putExtra(Email, Temail.getText().toString());
                monIntent.putExtra(Adresse, Tadresse.getText().toString());

                startActivity(monIntent);

            }


        });


    }
}
