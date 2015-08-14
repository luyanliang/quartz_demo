package com.wanhang.quartz.demo;

import java.util.Map;

public class Job {

	public void execute(Map<String, String> jobData) {
		System.out.println("####################");
		System.out.println(jobData.get("type") + ":Test Job Run at :" + System.currentTimeMillis());
		System.out.println("####################");
	}
}
