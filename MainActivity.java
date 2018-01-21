package a2room.recyclerview;

import android.app.ActionBar;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private Adapter mAdapter;
    private RecyclerView mListItems;
    private ArrayListData the = new ArrayListData();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListItems = (RecyclerView) findViewById(R.id.recycler_view_layout);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mListItems.setLayoutManager(layoutManager);

        mListItems.setHasFixedSize(true);

        mAdapter = new Adapter(the.size());

        // this will communicate to the RecylerView which is the adapter
        mListItems.setAdapter(mAdapter);

        ActionBar bar = this.getActionBar();
    }
}
