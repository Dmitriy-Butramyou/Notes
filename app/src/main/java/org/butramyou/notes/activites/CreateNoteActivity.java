package org.butramyou.notes.activites;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import org.butramyou.notes.R;

public class CreateNoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_note_activity);

        ImageView imageBack = findViewById(R.id.imageBack);
        imageBack.setOnClickListener(v -> getOnBackPressedDispatcher().onBackPressed());
    }
}