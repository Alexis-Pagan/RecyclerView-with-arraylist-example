package a2room.recyclerview;

import android.view.View;
import android.widget.TextView;
import android.support.v7.widget.RecyclerView;

import java.lang.reflect.Array;

public class ItemViewHolder extends RecyclerView.ViewHolder {


    // init the item view
    private TextView itemTextView;

    public ItemViewHolder(View itemText) {
        super(itemText);
        itemTextView = (TextView) itemText.findViewById(R.id.list_items);
    }

    public void bind(int data) {

        ArrayListData dataTo = new ArrayListData();

        itemTextView.setText(String.valueOf(dataTo.getStringForItem().get(data)));

    }
}
