package example.hp.mybudgeting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class FragmentPemasukan extends Fragment {
    public ArrayList<Pemasukan> pemasukans;
    public PemasukanAdapter adapter;



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_pemasukan, container, false);
        RecyclerView rvPemasukan =view.findViewById(R.id.rvPemasukan);

        pemasukans = MainActivity.createPemasukanList();

        adapter = new PemasukanAdapter(pemasukans);

        LinearLayoutManager layoutManager =new LinearLayoutManager(this.getActivity().getBaseContext());
        rvPemasukan.setAdapter(adapter);
        rvPemasukan.setLayoutManager(layoutManager);
        rvPemasukan.setHasFixedSize(true);

        return view;
    }
}
