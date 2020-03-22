package example.hp.mybudgeting;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String NomorFromIntent1;
    String TanggalFromIntent1;
    String JumlahFromIntent1;
    String SumberFromIntent1;

    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();

    FragmentPemasukan FragmentPemasukan;

    Intent data = new Intent("example.hp.mybudgeting.AddPemasukanActivity");

    static ArrayList<Pemasukan> pemasukanArrayList = new ArrayList<Pemasukan>();

    public static ArrayList<Pemasukan> createPemasukanList() {
        pemasukanArrayList.add(new Pemasukan("1", "12 Januari", "100.000", "Bunga"));

        return pemasukanArrayList;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentPemasukan = new FragmentPemasukan();

        fragmentTransaction.replace(android.R.id.content, FragmentPemasukan);

        fragmentTransaction.commit();
    }

    public void addPemasukan(View view) { startActivityForResult(data, 1); }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == 1) {
            if(resultCode == RESULT_OK) {
                NomorFromIntent1 = data.getStringExtra("pemasukanNomor");
                TanggalFromIntent1 = data.getStringExtra("pemasukanTanggal");
                JumlahFromIntent1 = data.getStringExtra("pemasukanJumlah");
                SumberFromIntent1 = data.getStringExtra("pemasukanSumber");
                Toast.makeText(this, NomorFromIntent1, Toast.LENGTH_LONG).show();
                Toast.makeText(this, TanggalFromIntent1, Toast.LENGTH_LONG).show();
                Toast.makeText(this, JumlahFromIntent1, Toast.LENGTH_LONG).show();
                Toast.makeText(this, SumberFromIntent1, Toast.LENGTH_LONG).show();
                pemasukanArrayList.add(new Pemasukan(NomorFromIntent1,TanggalFromIntent1,JumlahFromIntent1,SumberFromIntent1));
            }
        }
        FragmentPemasukan.adapter.notifyDataSetChanged();
        super.onActivityResult(requestCode,resultCode,data);
    }
}
