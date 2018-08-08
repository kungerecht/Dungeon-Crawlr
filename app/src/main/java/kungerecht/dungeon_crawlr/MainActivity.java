package kungerecht.dungeon_crawlr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
//Entry screen for game

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button backBtn = (Button) findViewById(R.id.backBtn);
        final Button selectBtn = (Button) findViewById(R.id.selectBtn);
        final Button newBtn = (Button) findViewById(R.id.newBtn);
        final TextView title = findViewById(R.id.titleText);
        final TextView title1 = findViewById(R.id.titleText1);
        final Button slotBtn1 = findViewById(R.id.slotBtn1);

//Show new character screen items and hide main screen items
        newBtn.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                backBtn.setVisibility(View.VISIBLE);
                selectBtn.setVisibility(View.INVISIBLE);
                newBtn.setVisibility(View.INVISIBLE);
                title.setVisibility(View.INVISIBLE);
            }
        });

//Show select screen items and hide main screen items
        selectBtn.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                backBtn.setVisibility(View.VISIBLE);
                selectBtn.setVisibility(View.INVISIBLE);
                newBtn.setVisibility(View.INVISIBLE);
                title.setVisibility(View.INVISIBLE);
                title1.setVisibility(View.VISIBLE);
                slotBtn1.setVisibility(View.VISIBLE);
            }
        });

//Show main menu items and hide all other items
        backBtn.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                backBtn.setVisibility(View.INVISIBLE);
                selectBtn.setVisibility(View.VISIBLE);
                newBtn.setVisibility(View.VISIBLE);
                title.setVisibility(View.VISIBLE);
                title1.setVisibility(View.INVISIBLE);
                slotBtn1.setVisibility(View.INVISIBLE);
            }
        });

    }



}
