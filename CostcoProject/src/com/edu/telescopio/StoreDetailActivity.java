package com.edu.telescopio;

import static com.edu.telescopio.Constants.ID;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.edu.telescopio.repository.dao.SaleStoreDAOImpl;
import com.edu.telescopio.repository.vo.SaleStore;

/**
 * @author andres
 *
 */
public class StoreDetailActivity extends Activity {
	
	private SaleStore saleStore;
	
	private void setup(Intent intent) {
				
		this.saleStore = SaleStoreDAOImpl.getInstance().getSaleStores().get(intent.getStringExtra(ID));
		
		TextView txtView = (TextView)this.findViewById(R.id.storeName);
		txtView.setText(this.saleStore.getStoreName());		
		
		txtView = (TextView)this.findViewById(R.id.address);
		txtView.setText(this.saleStore.getAddress());
		
		txtView = (TextView)this.findViewById(R.id.phone);
		txtView.setText(this.saleStore.getPhone());
		Linkify.addLinks(txtView, Linkify.ALL);
		
		txtView = (TextView)this.findViewById(R.id.website);
		txtView.setText(this.saleStore.getWebSite());
		Linkify.addLinks(txtView, Linkify.ALL);
		
		txtView = (TextView)this.findViewById(R.id.email);
		txtView.setText(this.saleStore.getEmail());
		Linkify.addLinks(txtView, Linkify.ALL);
		
		txtView = (TextView)this.findViewById(R.id.pot_wkdays);
		txtView.setText(this.saleStore.getPublicOpeningTime()[0]);		
		
		txtView = (TextView)this.findViewById(R.id.pot_wknd);
		txtView.setText(this.saleStore.getEmail());
		txtView.setText(this.saleStore.getPublicOpeningTime()[1]);	
						
		((Button)this.findViewById(R.id.button_detail_call)).setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				
				makeCall();
				
			}
			
		});				
		
		((Button)this.findViewById(R.id.button_detail_img)).setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				
				showImage();
				
			}
			
		});
		
	}
	
	private void makeCall() {
		
		startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel::"+this.saleStore.getPhone())));
		
	}
	
	private void showImage() {
		
		startActivity(new Intent(this.getApplicationContext(), StoreImageActivity.class));
		
	}
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_store_detail);
						
		this.setup(getIntent());
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.store_detail, menu);
		return true;
	}

}
