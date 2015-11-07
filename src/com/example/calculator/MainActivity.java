package com.example.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView.FindListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	EditText e1,e2;
	Button b1,b2,b3,b4,b5;
	TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.editText1);

        e2=(EditText) findViewById(R.id.editText2);
        t=(TextView) findViewById(R.id.textView1);
       
        
        
        b1=(Button) findViewById(R.id.button1);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);
        b5=(Button) findViewById(R.id.button5);
        
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
		        String s1=e1.getText().toString();
		        
		        String s2=e2.getText().toString();
		       
		        if(s1.length()==0 )
		        {
		        	e1.setError("enter value"); return;
		        	
		        }
		        if(s1.equals(".")){
		        	s1="0.";
		        }
		        if(s2.equals(".")){
		        	s2="0.";
		        }
		        if(s2.length()==0)
		        {
		        	e2.setError("enter value");
		        }
		       
		        if(!s1.contains(".")&&!s2.contains(".")){
			        
		        	int a=Integer.parseInt(s1);
		        	int b=Integer.parseInt(s2);
		        	int c=a+b;
		        	String s3=c+"";
					t.setText(s3);
		        	
		        
		        	
		        }
		        else{
		        
		        double a=Double.parseDouble(s1);
		        double b=Double.parseDouble(s2);
		        double c=a+b;
		        String s3=c+"";
				t.setText(s3);
				
				
				
				
				
			}}
			
			
			
		});
        String s1="";
		String s2="";
		String s3="";
 b2.setOnClickListener(new OnClickListener() {
			
	 @Override
		public void onClick(View arg0) {
	        String s1=e1.getText().toString();
	        
	        String s2=e2.getText().toString();
	       
	        if(s1.length()==0)
	        {
	        	e1.setError("enter value"); return;
	        	
	        }
	        if(s1.equals("."))
	        {
	        	s1="0.";
	        }
	        if(s2.length()==0)
	        {
	        	e2.setError("enter value");
	        }
	        if(s2.equals("."))
	        {
	        	s2="0.";
	        }
	        if(!s1.contains(".")&&!s2.contains(".")){
		        
	        	int a=Integer.parseInt(s1);
	        	int b=Integer.parseInt(s2);
	        	int c=a-b;
	        	String s3=c+"";
				t.setText(s3);
	        }
	        	
	        else{
	        	
	        
	        double a=Double.parseDouble(s1);
	        double b=Double.parseDouble(s2);
	        double c=a-b;
	        String s3=c+"";
			t.setText(s3);
					
			}}
		});
        
 b3.setOnClickListener(new OnClickListener() {
		
	 @Override
		public void onClick(View arg0) {
	        String s1=e1.getText().toString();
	        
	        String s2=e2.getText().toString();
	       
	        if(s1.length()==0)
	        {
	        	e1.setError("enter value"); return;
	        	
	        }
	        if(s1.equals("."))
	        {
	        	s1="0.";
	        }
	        if(s2.length()==0)
	        {
	        	e2.setError("enter value");
	        }
	        if(s2.equals("."))
	        {
	        	s2="0.";
	        }
	        if(!s1.contains(".")&&!s2.contains(".")){
		        
	        	int a=Integer.parseInt(s1);
	        	int b=Integer.parseInt(s2);
	        	int c=a-b;
	        	String s3=c+"";
				t.setText(s3);
	        }
	        	
	        else{
	        	
	        
	        double a=Double.parseDouble(s1);
	        double b=Double.parseDouble(s2);
	        double c=a*b;
	        String s3=c+"";
			t.setText(s3);
				
		}}
	});
 
 
 b4.setOnClickListener(new OnClickListener() {
		
	 @Override
		public void onClick(View arg0) {
	        String s1=e1.getText().toString();
	        
	        String s2=e2.getText().toString();
	       
	        if(s1.length()==0)
	        {
	        	e1.setError("enter value"); return;
	        	
	        }
	        if(s1.equals("."))
	        {
	        	s1="0.";
	        }
	        if(s2.length()==0)
	        {
	        	e2.setError("enter value");
	        }
	        if(s2.equals("."))
	        {
	        	s2="0.";
	        }
	        if(!s1.contains(".")&&!s2.contains(".")){
		        
	        	int a=Integer.parseInt(s1);
	        	int b=Integer.parseInt(s2);
	        	int c=a-b;
	        	String s3=c+"";
				t.setText(s3);
	        }
	        	
	        else{
	        	
	        
	        double a=Double.parseDouble(s1);
	        double b=Double.parseDouble(s2);
	        double c=a/
	        		
	        		
	        		
	        		b;
	        String s3=c+"";
			t.setText(s3);
				
			
	        }
		}
	});
 b5.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		
		e1.setText("");
		e2.setText("");
		
		
	}
});
        
        
        
        
    }


    
    
}
