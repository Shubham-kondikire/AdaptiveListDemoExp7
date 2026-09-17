package com.example.adaptivelistdemo;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<ListItem> itemList;
    private CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.toolbar_title);
        setSupportActionBar(toolbar);

        itemList = buildData();

        ListView listView = findViewById(R.id.listView);
        adapter = new CustomAdapter(this, itemList);
        listView.setAdapter(adapter);

        TextView footer = findViewById(R.id.textFooter);
        footer.setText("Shubham Shivaji Kondikire | USN: 25MCAR0102 | Experiment 7");

        listView.setOnItemClickListener((parent, view, position, id) -> {
            ListItem item = itemList.get(position);
            showImageDialog(item);
        });
    }

    private void showImageDialog(ListItem item) {
        View dialogView = LayoutInflater.from(this)
                .inflate(R.layout.dialog_image, null);

        ImageView dialogImage = dialogView.findViewById(R.id.dialogImage);
        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);

        dialogImage.setImageResource(item.getImageResId());
        dialogTitle.setText(item.getTitle());

        new AlertDialog.Builder(this)
                .setView(dialogView)
                .setPositiveButton("Close", null)
                .show();
    }

    private List<ListItem> buildData() {
        List<ListItem> list = new ArrayList<>();
        list.add(new ListItem(R.drawable.ic_apple, "Apple", "Crisp and sweet", "₹120/kg"));
        list.add(new ListItem(R.drawable.ic_banana, "Banana", "Rich in potassium", "₹50/dozen"));
        list.add(new ListItem(R.drawable.ic_grape, "Grapes", "Seedless, juicy", "₹90/kg"));
        list.add(new ListItem(R.drawable.ic_mango, "Mango", "King of fruits", "₹150/kg"));
        list.add(new ListItem(R.drawable.ic_orange, "Orange", "Vitamin C boost", "₹80/kg"));
        list.add(new ListItem(R.drawable.ic_watermelon, "Watermelon", "Refreshing summer fruit", "₹40/kg"));
        return list;
    }
}
