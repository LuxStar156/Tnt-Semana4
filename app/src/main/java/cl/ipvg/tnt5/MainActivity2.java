package cl.ipvg.tnt5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;
import java.util.StringJoiner;

public class MainActivity2 extends AppCompatActivity {

    private SensorManager ngr;
    private TextView textlista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ngr = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        textlista = (TextView) findViewById(R.id.textViewlist);

        List<Sensor> textViewlist= ngr.getSensorList(Sensor.TYPE_ALL);

        StringBuilder strbuilder = new StringBuilder();

        for(Sensor s: textViewlist){
            strbuilder.append(s.getName()+"/n");
        }

        textlista.setVisibility(View.VISIBLE);
        textlista.setText(strbuilder);

    }
}