package a2room.recyclerview;

import java.util.ArrayList;

/**
 * Created by alexi on 1/20/2018.
 */

public class ArrayListData {

    public ArrayList<String> itemData = new ArrayList<>();

    public ArrayList<String> getStringForItem() {

        itemData.add("TextView Item: a");
        itemData.add("TextView Item: b");
        itemData.add("TextView Item: c");
        itemData.add("TextView Item: d");
        itemData.add("TextView Item: e");
        itemData.add("TextView Item: f");
        itemData.add("TextView Item: g");
        itemData.add("TextView Item: h");

        return itemData;
    }

    public int size() {
        return getStringForItem().size();
    }
}
