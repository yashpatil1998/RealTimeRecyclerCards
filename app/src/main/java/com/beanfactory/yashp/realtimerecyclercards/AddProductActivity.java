package com.beanfactory.yashp.realtimerecyclercards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddProductActivity extends AppCompatActivity {

    EditText newTitle;
    EditText newDesc;
    EditText newRating;
    Button addButton;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);

        newTitle = (EditText) findViewById(R.id.newTitleText);
        newDesc = (EditText) findViewById(R.id.newDescText);
        newRating = (EditText) findViewById(R.id.newRatingText);
        addButton = (Button) findViewById(R.id.addButton);

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference().child("list");

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Product product = new Product(newTitle.getText().toString(), newDesc.getText().toString(), Integer.parseInt(newRating.getText().toString()));
                databaseReference.push().setValue(product);
                finish();
            }
        });
    }
}
