package id.web.rery.rerysuryani_1202154358_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class dinein extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinein2);
    }

    public void submitdinein(View view) {
        Intent intent = new Intent(this, list_view.class);
        startActivity(intent);
        //method biar button nya bisa connect ke activity selanjutnya
    }
}
