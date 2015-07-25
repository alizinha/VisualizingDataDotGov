package alizinha.c4q.nyc.visualizingdatadotgov.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import alizinha.c4q.nyc.visualizingdatadotgov.R;
import alizinha.c4q.nyc.visualizingdatadotgov.models.DeathData;

/**
 * Created by c4q-Allison on 7/24/15.
 */

    public class DeathDataListAdapter extends RecyclerView.Adapter<DeathDataListAdapter.DeathRowViewHolder> {
    private List<DeathData> deathDataList = new ArrayList<>();

    public void setDeathdataList(List<DeathData> deathdataList) {
        this.deathDataList.clear();
        this.deathDataList.addAll(deathdataList);
    }

    @Override
    public DeathRowViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View deathRowView = LayoutInflater.from(parent.getContext()).inflate(R.layout.death_data_row, parent, false);
        DeathRowViewHolder trendingCardViewHolder = new DeathRowViewHolder(deathRowView);
        return trendingCardViewHolder;
    }

    @Override
    public void onBindViewHolder(DeathRowViewHolder holder, int position) {
        DeathData rowData = deathDataList.get(position);
        holder.deathCauseTV.setText(rowData.getCause());
        holder.deathCountTV.setText(rowData.getDeathCount() + "");
        holder.deathPercentTV.setText(rowData.getDeathPercent() + "%");

    }

    @Override
    public int getItemCount() {
        return deathDataList.size();
    }

    public static class DeathRowViewHolder extends RecyclerView.ViewHolder {
        private TextView deathCauseTV;
        private TextView deathCountTV;
        private TextView deathPercentTV;

        public DeathRowViewHolder(View itemView) {
            super(itemView);
            this.deathCauseTV = (TextView) itemView.findViewById(R.id.death_cause);
            this.deathCountTV = (TextView) itemView.findViewById(R.id.death_count);
            this.deathPercentTV = (TextView) itemView.findViewById(R.id.death_percent);
        }
    }
}
