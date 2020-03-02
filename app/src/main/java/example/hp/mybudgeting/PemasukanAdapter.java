package example.hp.mybudgeting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PemasukanAdapter extends RecyclerView.Adapter<PemasukanAdapter.PemasukanViewHolder> {
    private List<Pemasukan> pemasukans;
    private int itemLayout = R.layout.layoutpemasukan;

    public PemasukanAdapter(List<Pemasukan> pemasukans) {
        this.pemasukans = pemasukans;
    }

    @Override
    public int getItemCount() {
        if(pemasukans == null) {
            return 0;
        }
        return pemasukans.size();
    }

    @NonNull
    @Override
    public PemasukanAdapter.PemasukanViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        View itemView = LayoutInflater.from(context).inflate(itemLayout, viewGroup, false);
        return new PemasukanViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PemasukanAdapter.PemasukanViewHolder viewHolder, int position) {
        viewHolder.bind(pemasukans.get(position));
    }


    class PemasukanViewHolder extends RecyclerView.ViewHolder {
        private TextView nomor;
        private TextView tanggal;
        private TextView jumlah;
        private TextView sumber;

        public PemasukanViewHolder(@NonNull View itemView) {
            super(itemView);
            nomor = itemView.findViewById(R.id.nomormasuk);
            tanggal = itemView.findViewById(R.id.tanggalmasuk);
            jumlah = itemView.findViewById(R.id.jumlahmasuk);
            sumber = itemView.findViewById(R.id.sumbermasuk);
        }

        public void bind(Pemasukan pemasukan) {
            sumber.setText(pemasukan.getSumber());
            tanggal.setText(pemasukan.getTanggal());
            jumlah.setText(pemasukan.getJumlah());
            sumber.setText(pemasukan.getSumber());
        }
    }
}
