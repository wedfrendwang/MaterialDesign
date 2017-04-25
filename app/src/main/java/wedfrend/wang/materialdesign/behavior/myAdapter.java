package wedfrend.wang.materialdesign.behavior;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import wedfrend.wang.materialdesign.R;

/**
 * Created by welive on 2017/4/24.
 */

public class myAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<String> listString;
    private Context context;


    public myAdapter(List<String> listString, Context context) {
        this.listString = listString;
        this.context = context;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv;
        public ViewHolder(View itemView) {
            super(itemView);
            tv = ((TextView) itemView.findViewById(R.id.tv_ViewHolder));
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //我这里只需要一个ViewHolder
//        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder,null,false);
//        ViewHolder vh = new ViewHolder(v);
//        return vh;
        TextView textView = new TextView(context);
        textView.setPadding(16, 16, 16, 16);
        return new RecyclerView.ViewHolder(textView) {
        };


    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
//        ((ViewHolder) holder).tv.setText(listString.get(position));
        TextView itemView = (TextView) holder.itemView;
        itemView.setText(listString.get(position));

    }

    @Override
    public int getItemCount() {
        return listString.size();
    }
}
