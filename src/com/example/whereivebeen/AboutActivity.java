package com.example.whereivebeen;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;



public class AboutActivity extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
	}
	
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.about, menu);
		MenuItem mi_map = (MenuItem)menu.findItem(R.id.action_map);
		mi_map.setIntent(new Intent(this, MapActivity.class));
		MenuItem mi_pin = (MenuItem)menu.findItem(R.id.action_pin);
		mi_pin.setIntent(new Intent(this, PinActivity.class));
		return true;
	}
	
	public void onClick(View v){
		switch(v.getId())
		{
		case R.id.returnButton:
			Intent mainIntent = new Intent(this, MainActivity.class);
			startActivity(mainIntent);
			break;
		}
	}
}
