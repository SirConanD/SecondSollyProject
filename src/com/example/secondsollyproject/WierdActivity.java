package com.example.secondsollyproject;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WierdActivity extends Activity
{
	private Button appButton;
	private Button textButton;
	private TextView appText;
	private ArrayList<Integer> colorList;
	private ArrayList<Integer> textList;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wierd);
		
		appButton = (Button) findViewById(R.id.firstbutton);
		textButton = (Button) findViewById(R.id.secondbutton);
		appText = (TextView) findViewById(R.id.boringTextView);
		colorList = new ArrayList<Integer>();
		textList = new ArrayList<Integer>();
		
		fillTheTextList();
		fillTheColorList();
		setUpListeners();
	}
	
	private void fillTheTextList()
	{
		textList.add(R.string.serious);
		textList.add(R.string.secondSerious);
	}
	
	private void fillTheColorList()
	{
		colorList.add(R.color.black);
		colorList.add(R.color.prettyPurple);
		colorList.add(R.color.deepRed);
		colorList.add(R.color.uglyBrown);
		colorList.add(R.color.white);
		colorList.add(R.color.orange);
		colorList.add(R.color.lightishRed);
	}
	
	private void setUpListeners()
	{
		appButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				//Button click stuff goes here
				int randomIndex = (int) (Math.random() * colorList.size());
				
				
				appButton.setBackgroundResource(colorList.get(randomIndex));
			}
		});
	}
}
