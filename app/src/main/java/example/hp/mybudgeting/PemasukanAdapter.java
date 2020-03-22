package example.hp.mybudgeting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PemasukanAdapter extends RecyclerView.Adapter<PemasukanAdapter.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView pemasukanNomor;
        public TextView pemasukanTanggal;
        public TextView pemasukanJumlah;
        public TextView pemasukanSumber;

        public ViewHolder(View itemView) {
            super(itemView);

            pemasukanNomor = (TextView) itemView.findViewById(R.id.pemasukan_nomor);
            pemasukanTanggal = (TextView) itemView.findViewById(R.id.pemasukan_tanggal);
            pemasukanJumlah = (TextView) itemView.findViewById(R.id.pemasukan_jumlah);
            pemasukanSumber = (TextView) itemView.findViewById(R.id.pemasukan_sumber);
        }
    }

    private List<Pemasukan> mPemasukan;

    public PemasukanAdapter(List<Pemasukan> pemasukans) { mPemasukan = pemasukans; }

    @NonNull
    @Override
    public PemasukanAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View deadlineView = inflater.inflate(R.layout.item_pemasukan,parent,false);

        ViewHolder viewHolder = new ViewHolder(deadlineView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PemasukanAdapter.ViewHolder viewHolder, int position) {
        Pemasukan pemasukans = mPemasukan.get(position);

        TextView pemasukanNomor = viewHolder.pemasukanNomor;
        pemasukanNomor.setText(pemasukans.getmNomor());

        TextView pemasukanTanggal = viewHolder.pemasukanTanggal;
        pemasukanTanggal.setText(pemasukans.getmTanggal());

        TextView pemasukanJumlah = viewHolder.pemasukanJumlah;
        pemasukanJumlah.setText(pemasukans.getmJumlah());

        TextView pemasukanSumber = viewHolder.pemasukanSumber;
        pemasukanSumber.setText(pemasukans.getmSumber());
    }

    @Override
    public int getItemCount() { return mPemasukan.size(); }
}
