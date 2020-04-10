package io.simstech.intentfirebasedatastore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moveData(View view)
    {
        try
        {
            Persons objectPersons=new Persons();
            Human humanData=new Human();

            humanData.setHumanName("Ali Sheraz");
            humanData.setHumanAddress("Lahore");
            humanData.setHumanPhone("+92 320 4172975");
            objectPersons.setHumanData(humanData);

            startActivity(new Intent(this, Sec.class)
                    .putExtra("person",objectPersons)
            );
        }
        catch (Exception e)
        {
            Toast.makeText(this, ""+e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}
