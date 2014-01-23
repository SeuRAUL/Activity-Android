package com.example.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class OutraActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_outra);
	}
	
	public void closeActivity(View v) {
		finish();
		
		Toast.makeText(this, "Fechando Activity", Toast.LENGTH_SHORT).show();
	}

}
