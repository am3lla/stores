package com.edu.telescopio;

import android.app.Activity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.Menu;
import android.widget.TextView;


public class AboutActivity extends Activity {				
	
	private void setupIds() {
						
		TextView txtView = (TextView)this.findViewById(R.id.author);
		txtView.setText(R.string.author);
		Linkify.addLinks(txtView, Linkify.ALL);
		
		txtView = (TextView)this.findViewById(R.id.email);
		txtView.setText(R.string.author_email);
		Linkify.addLinks(txtView, Linkify.ALL);
		
		txtView = (TextView)this.findViewById(R.id.mobile);
		txtView.setText(R.string.author_mobile);
		Linkify.addLinks(txtView, Linkify.ALL);
		
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		
		this.setupIds();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.about, menu);
		return true;
	}

}
