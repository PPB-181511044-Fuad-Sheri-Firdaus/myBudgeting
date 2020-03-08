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

    //Intent data = new Intent("");

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
}
