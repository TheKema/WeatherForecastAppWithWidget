package ainullov.kamil.com.weatherforecastusingretrofit;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.ViewHolder> {

    private List<ItemInWeatherAdapter> itemInWeatherAdapters;
    private LayoutInflater inflater;

    WeatherAdapter(Context context, List<ItemInWeatherAdapter> itemInWeatherAdapters) {
        this.itemInWeatherAdapters = itemInWeatherAdapters;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public WeatherAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherAdapter.ViewHolder holder, int position) {
        holder.tvItemDate.setText(itemInWeatherAdapters.get(position).getDate());
        holder.tvItemTemp.setText((int) itemInWeatherAdapters.get(position).getTemp());
        holder.tvItemDesc.setText(itemInWeatherAdapters.get(position).getDesc());
//        holder.ivItemIcon.set("Reposts "+itemInAdapters.get(position).);
    }

    @Override
    public int getItemCount() {
        return itemInWeatherAdapters.size();
    }

    class ViewHolder extends  RecyclerView.ViewHolder{
        final TextView tvItemDate;
        final TextView tvItemTemp;
        final TextView tvItemDesc;
        final ImageView ivItemIcon;

        public ViewHolder(View itemView) {
            super(itemView);
            tvItemDate = itemView.findViewById(R.id.tvItemDate);
            tvItemTemp = itemView.findViewById(R.id.tvItemTemp);
            tvItemDesc = itemView.findViewById(R.id.tvItemDesc);
            ivItemIcon = itemView.findViewById(R.id.ivItemIcon);
        }
    }
}
