package com.example.firstapp;

import java.io.Serializable;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.example.firstapp.personInfo;

import com.example.firstapp.MainActivity;

public class SecondActivity extends ActionBarActivity {

	TextView textView1;
	TextView textView2;	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		System.out.println("Activity Started");
		setContentView(R.layout.activity_second);
	
//		Bundle bundle = getIntent().getBundleExtra("bundle");
//		
//		String firstName= bundle.getString("first");
//		textView1 = (TextView) findViewById(R.id.textView1);
//		textView1.setText(firstName);	
//		
//		String secondName= bundle.getString("second");
//		System.out.println(secondName);
//		textView2 = (TextView) findViewById(R.id.textView2);
//		textView2.setText(secondName);
//		
		
//		
		Intent intent = getIntent();
//		String firstName= intent.getStringExtra("first");
//		String secondName = intent.getStringExtra("second");
//		System.out.println(secondName);
//		textView1 = (TextView) findViewById(R.id.textView1);
//		textView2 = (TextView) findViewById(R.id.textView2);
//		textView1.setText(firstName);	
//		textView2.setText(secondName);
		
		
		
		personInfo model = (personInfo) getIntent().getSerializableExtra("personObject");
		

		String firstName = model.getFirstName();
		String secondName = model.getSecondName();
		String fullName = firstName + " " +secondName;
		
		textView1 = (TextView) findViewById(R.id.textView1);
		textView2 = (TextView) findViewById(R.id.textView2);
		textView1.setText(fullName);	
		//textView2.setText(secondName);
		
		Toast tost = Toast.makeText(getApplicationContext(), fullName, Toast.LENGTH_SHORT);
		tost.show();
		
		
		if(firstName.equals(null) || secondName.equals(null))
		{
			tost = Toast.makeText(getApplicationContext(), "it will be good to fill full detail", Toast.LENGTH_SHORT);
			tost.show();
		}
		
		
		
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

	
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
