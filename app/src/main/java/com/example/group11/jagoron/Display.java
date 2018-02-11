package com.example.group11.jagoron;



import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.squareup.seismic.ShakeDetector;

import static java.lang.Thread.sleep;

public class Display extends Activity implements ShakeDetector.Listener{
	

	Cursor c;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display);

		SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
		ShakeDetector shakeDetector = new ShakeDetector(this);
		shakeDetector.start(sensorManager);
		
		
		SQLiteDatabase db;
		db=openOrCreateDatabase("NumDB", Context.MODE_PRIVATE, null);
		
		   c=db.rawQuery("SELECT * FROM details", null);
		   if(c.getCount()==0)
		   {
		       showMessage("Error", "No records found.");
		       return;
		   }
		   StringBuffer buffer=new StringBuffer();
		   while(c.moveToNext())
		   {
		       buffer.append("Name: "+c.getString(0)+"\n");
		       buffer.append("Number: "+c.getString(1)+"\n");
		   }
		   showMessage("Details", buffer.toString());


          
		
	}

	@Override
	public void hearShake() {

		Toast.makeText(this,"Shake has been detected !!!",Toast.LENGTH_SHORT).show();
		/*try {
			sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		GPSTracker tracker = new GPSTracker();

		double longt =tracker.getLongitude();
		double lat = tracker.getLatitude();
		Toast.makeText(this,"The location is on Latitude:"+lat+"Longitude:"+longt,Toast.LENGTH_LONG).show(); */

		RGeocoder rGeocoder = new RGeocoder();


	}
	
	public void showMessage(String title,String message)
    {
        Builder builder=new Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }


	
	
	public void back(View v) {
		Intent i_back=new Intent(Display.this,MainActivity.class);
		startActivity(i_back);
		
		}
	
	

}








