package id.web.rery.rerysuryani_1202154358_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private static final String TAG = MainActivity.class.getSimpleName();
    private String mSpinnerLabel = "";


    public void showFoodOrder(String message) {
        Intent intent = new Intent(this, jenispesanan.class);
        displayToast(message);
        startActivity(intent);
    }
//menampilkan pesan

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }
//menampilkan pesan

    public void showmenu(View view) {
        showFoodOrder("Pilih Jenis Pesanan");

    }
//menampilkan pesan

    public void showDetail(String message) {
        displayToast(message);
        Intent intent = new Intent(this, dinein.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.dinein);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }

        // Create ArrayAdapter using the string array and default spinner layout.
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.labels_array, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears.
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner.
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> AdapterView, View view, int position, long id) {
        mSpinnerLabel = AdapterView.getItemAtPosition(position).toString();
        showdinein(view);
    }
    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        Log.d(TAG, getString(R.string.nothing_selected));
    }

    public void showdinein(View view) {
        Intent intent = new Intent(this, dinein.class);
        startActivity(intent);
    }


    public void showtakeaway(View view) {
        Intent intent = new Intent(this, takeaway.class);
        startActivity(intent);
    }
//supaya bisa connect ke activity selanjutnya

    public void showoriginal(View view) {
        Intent intent = new Intent(this, Original.class);
        startActivity(intent);

    }
    //supaya bisa connect ke activity selanjutnya

    public void showsweet(View view) {
        Intent intent = new Intent(this, Sweet.class);
        startActivity(intent);
    }
    //supaya bisa connect ke activity selanjutnya

    public void showspicy(View view) {
        Intent intent = new Intent(this, spicy.class);
        startActivity(intent);
    }
//supaya bisa connect ke activity selanjutnya

    public void submitdinein(View view) {
        Intent intent = new Intent(this, list_view.class);
        startActivity(intent);
    }
    //supaya bisa connect ke activity selanjutnya

    public void submittakeaway(View view) {
        Intent intent = new Intent(this, list_view.class);
        startActivity(intent);
    } //supaya bisa connect ke activity selanjutnya
}