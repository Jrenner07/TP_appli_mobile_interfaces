package julienco.tp_interfaces_simples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class act_Menu extends AppCompatActivity {


    final String Nom = "user_Nom";
    final String Prenom = "user_Prenom";
    final String DateDeNaissance = "user_DateDeNaissance";
    final String Email = "user_Email";
    final String Adresse = "user_Adresse";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act__menu);

        Button ButtonAccueil = (Button)findViewById(R.id.button2_accueil);
        Button ButtonSport = (Button)findViewById(R.id.button_sport);


        final TextView Tnom = (TextView)findViewById(R.id.Text_NomPreview);
        final TextView Tprenom = (TextView)findViewById(R.id.Text_PrenomPreview);
        final TextView Tdatedenaissance = (TextView)findViewById(R.id.Text_DateDeNaissancePreview);
        final TextView Temail = (TextView)findViewById(R.id.Text_EmailPreview);
        final TextView Tadresse = (TextView)findViewById(R.id.Text_AdressePreview);

        Intent monIntent = getIntent();


        Tnom.setText(monIntent.getStringExtra(Nom));
        Tprenom.setText(monIntent.getStringExtra(Prenom));
        Tdatedenaissance.setText(monIntent.getStringExtra(DateDeNaissance));
        Temail.setText(monIntent.getStringExtra(Email));
        Tadresse.setText(monIntent.getStringExtra(Adresse));



        ButtonAccueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent menuIntent = new Intent(act_Menu.this, MainActivity.class);

                startActivity(menuIntent);

            }


        });


    }
}
