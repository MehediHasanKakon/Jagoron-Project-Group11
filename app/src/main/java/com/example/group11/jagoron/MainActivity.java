package com.example.group11.jagoron;


import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

<<<<<<< HEAD
	
=======
	TextView banglaTextView;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		banglaTextView = (TextView) findViewById(R.id.textView1);
		Typeface myCustomFont = Typeface.createFromAsset(getAssets(), "fonts/SutonnyOMJ.ttf");
		banglaTextView.setTypeface(myCustomFont);

	}



    public void verify(View v){
		Intent Main = new Intent(this, Verify.class);
		startActivity(Main);

		}
    public void register(View v){
		Intent i_register=new Intent(MainActivity.this,Register.class);
		startActivity(i_register);
		}


>>>>>>> Mou




}