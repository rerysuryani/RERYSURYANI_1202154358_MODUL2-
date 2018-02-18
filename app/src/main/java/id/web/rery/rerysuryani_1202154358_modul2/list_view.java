package id.web.rery.rerysuryani_1202154358_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class list_view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        if(getSupportActionBar()!=null){

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        } //ini untuk membuat tombol back pada toolbar
    }

    public void showoriginal(View view) {
        Intent intent = new Intent(this, Original.class);
        startActivity(intent);

    } //method agar bisa connect ke kelas selanjutnya

    public void showsweet(View view) {
        Intent intent = new Intent(this, Sweet.class);
        startActivity(intent);
    } //method agar bisa connect ke kelas selanjutnya

    public void showspicy(View view) {
        Intent intent = new Intent(this, spicy.class);
        startActivity(intent);
    } //method agar bisa connect ke kelas selanjutnya

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
