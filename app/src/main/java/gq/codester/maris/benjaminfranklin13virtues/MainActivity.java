package gq.codester.maris.benjaminfranklin13virtues;

import android.app.Dialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    FloatingActionButton fab;
    TextView t10,t20,t30,t40,t50,t60,t70,t80,t90,t100,t110,t120,t130;
    String temperance, silence, order, resolution, frugality, industry, sincerity, justice
            ,moderation, cleanliness, tranquility, chastity, humility;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        temperance = "Eat not to dullness; drink not to elevation.";
        silence = "Speak not but what may benefit others or yourself; avoid trifling conversation. ";
        order = "Let all your things have their places; let each part of your business have its time. ";
        resolution = "Resolve to perform what you ought; perform without fail what you resolve. ";
        frugality = " Make no expense but to do good to others or yourself; i.e., waste nothing. ";
        industry = "Lose no time; be always employ'd in something useful; cut off all unnecessary actions. ";
        sincerity = "Use no hurtful deceit; think innocently and justly, and, if you speak, speak accordingly. ";
        justice = "Wrong none by doing injuries, or omitting the benefits that are your duty. ";
        moderation = "Avoid extremes; forbear resenting injuries so much as you think they deserve. ";
        cleanliness = "Tolerate no uncleanliness in body, cloaths, or habitation. ";
        tranquility = "Be not disturbed at trifles, or at accidents common or unavoidable. ";
        chastity = "Rarely use venery but for health or offspring, never to dullness, weakness, or the injury of your own or another's peace or reputation. ";
        humility = "Imitate Jesus and Socrates. ";

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(this);


        t10 = (TextView) findViewById(R.id.t10);
        t20 = (TextView) findViewById(R.id.t20);
        t30 = (TextView) findViewById(R.id.t30);
        t40 = (TextView) findViewById(R.id.t40);
        t50 = (TextView) findViewById(R.id.t50);
        t60 = (TextView) findViewById(R.id.t60);
        t70 = (TextView) findViewById(R.id.t70);
        t80 = (TextView) findViewById(R.id.t80);
        t90 = (TextView) findViewById(R.id.t90);
        t100 = (TextView) findViewById(R.id.t100);
        t110 = (TextView) findViewById(R.id.t110);
        t120 = (TextView) findViewById(R.id.t120);
        t130 = (TextView) findViewById(R.id.t130);

        t10.setOnClickListener(this);
        t20.setOnClickListener(this);
        t30.setOnClickListener(this);
        t40.setOnClickListener(this);
        t50.setOnClickListener(this);
        t60.setOnClickListener(this);
        t70.setOnClickListener(this);
        t80.setOnClickListener(this);
        t90.setOnClickListener(this);
        t100.setOnClickListener(this);
        t110.setOnClickListener(this);
        t120.setOnClickListener(this);
        t130.setOnClickListener(this);

    }//end onCreate

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_info) {
            info();
        }
        else if(id == R.id.action_reset){
            Toast.makeText(this, "Reset option has been chosen", Toast.LENGTH_SHORT).show();
        }
        else if(id == R.id.action_share){
            Toast.makeText(this,"Share option has been chosen",Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if(t10 == v ){
            final Dialog dialog = new Dialog(MainActivity.this);
            dialog.setTitle("Info Box");
            dialog.setContentView(R.layout.popup);
            TextView info = (TextView) dialog.findViewById(R.id.info);
            info.setText(temperance);
            dialog.show();
        }

        if(t20 == v ){
            final Dialog dialog = new Dialog(MainActivity.this);
            dialog.setTitle("Info Box");
            dialog.setContentView(R.layout.popup);
            TextView info = (TextView) dialog.findViewById(R.id.info);
            info.setText(silence);
            dialog.show();
        }

        if(t30 == v ){
            final Dialog dialog = new Dialog(MainActivity.this);
            dialog.setTitle("Info Box");
            dialog.setContentView(R.layout.popup);
            TextView info = (TextView) dialog.findViewById(R.id.info);
            info.setText(order);
            dialog.show();
        }

        if(t40 == v ){
            final Dialog dialog = new Dialog(MainActivity.this);
            dialog.setTitle("Info Box");
            dialog.setContentView(R.layout.popup);
            TextView info = (TextView) dialog.findViewById(R.id.info);
            info.setText(resolution);
            dialog.show();
        }

        if(t50 == v ){
            final Dialog dialog = new Dialog(MainActivity.this);
            dialog.setTitle("Info Box");
            dialog.setContentView(R.layout.popup);
            TextView info = (TextView) dialog.findViewById(R.id.info);
            info.setText(frugality);
            dialog.show();
        }

        if(t60 == v ){
            final Dialog dialog = new Dialog(MainActivity.this);
            dialog.setTitle("Info Box");
            dialog.setContentView(R.layout.popup);
            TextView info = (TextView) dialog.findViewById(R.id.info);
            info.setText(industry);
            dialog.show();
        }

        if(t70 == v ){
            final Dialog dialog = new Dialog(MainActivity.this);
            dialog.setTitle("Info Box");
            dialog.setContentView(R.layout.popup);
            TextView info = (TextView) dialog.findViewById(R.id.info);
            info.setText(sincerity);
            dialog.show();
        }

        if(t80 == v ){
            final Dialog dialog = new Dialog(MainActivity.this);
            dialog.setTitle("Info Box");
            dialog.setContentView(R.layout.popup);
            TextView info = (TextView) dialog.findViewById(R.id.info);
            info.setText(justice);
            dialog.show();
        }

        if(t90 == v ){
            final Dialog dialog = new Dialog(MainActivity.this);
            dialog.setTitle("Info Box");
            dialog.setContentView(R.layout.popup);
            TextView info = (TextView) dialog.findViewById(R.id.info);
            info.setText(moderation);
            dialog.show();
        }

        if(t100 == v ){
            final Dialog dialog = new Dialog(MainActivity.this);
            dialog.setTitle("Info Box");
            dialog.setContentView(R.layout.popup);
            TextView info = (TextView) dialog.findViewById(R.id.info);
            info.setText(cleanliness);
            dialog.show();
        }

        if(t110 == v ){
            final Dialog dialog = new Dialog(MainActivity.this);
            dialog.setTitle("Info Box");
            dialog.setContentView(R.layout.popup);
            TextView info = (TextView) dialog.findViewById(R.id.info);
            info.setText(tranquility);
            dialog.show();
        }

        if(t120 == v ){
            final Dialog dialog = new Dialog(MainActivity.this);
            dialog.setTitle("Info Box");
            dialog.setContentView(R.layout.popup);
            TextView info = (TextView) dialog.findViewById(R.id.info);
            info.setText(chastity);
            dialog.show();
        }

        if(t130 == v ){
            final Dialog dialog = new Dialog(MainActivity.this);
            dialog.setTitle("Info Box");
            dialog.setContentView(R.layout.popup);
            TextView info = (TextView) dialog.findViewById(R.id.info);
            info.setText(humility);
            dialog.show();
        }

        if(fab == v){
            info();
        }
    }//end onClick

    public void info(){
        final Dialog dialog = new Dialog(MainActivity.this);
        dialog.setTitle("Info Box");
        dialog.setContentView(R.layout.popup);

        TextView info = (TextView) dialog.findViewById(R.id.info);
        info.setText("Information about this whole lot");

        dialog.show();
    }
}//end Class
