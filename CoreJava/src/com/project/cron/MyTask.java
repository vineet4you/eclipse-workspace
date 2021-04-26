package com.project.cron;

import java.util.Date;
import java.util.TimerTask;

public class MyTask extends TimerTask  {

	@Override
	public void run() {
	System.out.println(new Date());
	System.out.println();
		
	}

}
