package id.web.rery.rerysuryani_1202154358_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class jenispesanan extends AppCompatActivity {
    private static final String TAG_ACTIVITY = jenispesanan.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jenispesanan);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }
//buat nampilin pesan

    public void showmenu(View view) {
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.dinein:
                if (checked);
                    displayToast(getString(R.string.chosen) +
                            getString(R.string.dine_in));

                break;
            case R.id.takeaway:
                if (checked);
                    displayToast(getString(R.string.chosen) +
                            getString(R.string.take_away));
                break;
            default:
                Log.d(TAG_ACTIVITY, getString(R.string.nothing_clicked));
                break;
        }
    }

    public void showdinein(View view) {
        Intent intent = new Intent(this, dinein.class);
        startActivity(intent);
    }
    //method biar bisa connect ke dinein class

    public void showtakeaway(View view) {
        Intent intent = new Intent(this, takeaway.class);
        startActivity(intent);
    }
    //method biar bisa connect ke takeaway class
}
