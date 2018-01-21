package a2room.recyclerview;

/**
 * Created by alexi on 1/20/2018.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Adapter extends RecyclerView.Adapter<ItemViewHolder> {


    private int numberOfItemToHold;

    public Adapter(int numberOfItemToHold) {

        this.numberOfItemToHold = numberOfItemToHold;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        Context context = viewGroup.getContext(); // find the resource in the app called list_views.xml
        int layoutIdForListItem = R.layout.list_views; // find the layout
        LayoutInflater inflater = LayoutInflater.from(context);// extract the layout

        /**********************************
         *
         * View Box is ready
         *
         **********************************/


        View view = inflater.inflate(layoutIdForListItem, viewGroup, false);

        ItemViewHolder viewHolder = new ItemViewHolder(view); // pass the view

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {

        holder.bind(position);
    }

    // in this point of the program the getItemCount does not know quantity of items
    @Override
    public int getItemCount() {
        return numberOfItemToHold;
    }
}
