package com.example.sdg.listviewpor;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	@SuppressWarnings("unchecked")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		/*Integer[] ar = new Integer[100];

		for (int i = 0; i < 100; i++) {
			ar[i] = i + 1;
		}*/

		final Car[] cars = new Car[100];
		Car car;
		for (int i = 0; i < 100; i++) {
			car = new Car();

			car.setModel("Audi");
			car.setNumWheel(4);
			car.setNumSeat(i);
			car.setNum("D7689");

			cars[i] = car;
		}


		ListView listview = (ListView) findViewById(R.id.seven);

		ArrayAdapter adapter;
		adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, cars);


		listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
				new AlertDialog.Builder(MainActivity.this)
						.setTitle("Alert Dialog")
						.setMessage("What the fuck do you want,bitch?")
						.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface dialog, int which) {
								Toast.makeText(getApplicationContext(), ((TextView) view).getText(),
										Toast.LENGTH_SHORT).show();
							}
						})
						.setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface dialog, int which) {
								Toast.makeText(getApplicationContext(), "Go farm, dick head", // test
										Toast.LENGTH_SHORT).show();
							}
						}).show();
			}
		});
		listview.setAdapter(adapter);
	}
}