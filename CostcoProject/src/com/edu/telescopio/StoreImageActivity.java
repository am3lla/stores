package com.edu.telescopio;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

/**
 * @author andres
 *
 */
public class StoreImageActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_store_image);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.store_image, menu);
		return true;
	}

}
