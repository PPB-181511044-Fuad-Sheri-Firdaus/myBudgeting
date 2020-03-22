package example.hp.mybudgeting;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AddPemasukanActivity extends AppCompatActivity{

    EditText pemasukanNomor;
    EditText pemasukanTanggal;
    EditText pemasukanJumlah;
    EditText pemasukanSumber;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activyty_add_pemasukan);

        pemasukanNomor = (EditText)findViewById(R.id.pemasukanNomorForm);
        pemasukanTanggal = (EditText)findViewById(R.id.pemasukanTanggalForm);
        pemasukanJumlah = (EditText)findViewById(R.id.pemasukanJumlahForm);
        pemasukanSumber = (EditText)findViewById(R.id.pemasukanSumberForm);

        Button button1 = findViewById(R.id.insertButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();

                String Nomor = pemasukanNomor.getText().toString();
                String Tanggal = pemasukanTanggal.getText().toString();
                String Jumlah = pemasukanJumlah.getText().toString();
                String Sumber = pemasukanSumber.getText().toString();

                Bundle bundle = new Bundle();
                bundle.putString("pemasukanNomor", Nomor);
                bundle.putString("pemasukanTanggal", Tanggal);
                bundle.putString("pemasukanJumlah", Jumlah);
                bundle.putString("pemasukanSumber", Sumber);

                i.putExtras(bundle);
                setResult(RESULT_OK, i);
                finish();
            }
        });

    }
}
