package com.project.cron;

import java.util.Timer;
import java.util.TimerTask;

public class CronJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer timer=new Timer();
		TimerTask timerT=new MyTask();
		timer.schedule(timerT, 0, 2000);
	}

}
