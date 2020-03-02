package example.hp.mybudgeting;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import example.hp.mybudgeting.R;

public class fragmentpemasukan extends Fragment {

    private RecyclerView pemasukanRecyclerView;
    private PemasukanAdapter pemasukanAdapter;
    private List pemasukans;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragmentpemasukan);

        pemasukanRecyclerView = findViewById(R.id.recycler_pemasukan);
        setupRecyclerView();
    }

    private void setupRecyclerView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        pemasukanRecyclerView.setLayoutManager(layoutManager);

        pemasukans = new ArrayList();
        populatePemasukan();

        pemasukanAdapter = new PemasukanAdapter(pemasukans);
        pemasukanRecyclerView.setAdapter(pemasukanAdapter);
    }

    private void populatePemasukan() {
        for (int i=0; i<10; i++) {
            String nomor = String.valueOf(i+1);
            String tanggal = String.valueOf(1);
            String jumlah = String.valueOf(100000);
            String sumber = String.valueOf("Kiriman Rutin");
        }
    }
}