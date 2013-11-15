package com.edu.telescopio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.edu.telescopio.repository.dao.SaleStoreDAOImpl;
import com.edu.telescopio.repository.vo.SaleStore;

import static com.edu.telescopio.Constants.ID;
import static com.edu.telescopio.Constants.STORE_NAME;

/**
 * @author andres
 *
 */
public class MainActivity extends ListActivity {

	private List<HashMap<String, String>> collection;

	
	private void setupListView() {				
											
		Collection<SaleStore> saleStores = SaleStoreDAOImpl.getInstance().getSaleStores().values();					
		
		this.collection = new ArrayList<HashMap<String, String>>();
		
		for(SaleStore ss : saleStores) {
						
			HashMap<String, String> map = new HashMap<String, String>();
			map.put(ID, ss.getId().toString());
			map.put(STORE_NAME, ss.getStoreName());
			
			this.collection.add(map);
			
		}
				
		SimpleAdapter adapter = new SimpleAdapter(this, 
				collection, 
				android.R.layout.simple_list_item_1, 
				new String[] {STORE_NAME, ID }, 
				new int[] { android.R.id.text1, android.R.id.text2 });

        setListAdapter(adapter);
		
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		this.setupListView();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
				
		HashMap<String, String> element = (HashMap<String, String>)getListAdapter().getItem(position);
						
		Intent intent = new Intent(getApplicationContext(), StoreDetailActivity.class);
		intent.putExtra(ID,  element.get(ID));
		
		startActivity(intent);
		
	}
	
	public boolean onOptionsItemSelected(MenuItem item) {
		
		switch(item.getItemId()) {
		
			case R.id.title_activity_about:								
				startActivity(new Intent(this, AboutActivity.class));
				
				break;
						
		}
				
		return true;
		
	}
	
}
