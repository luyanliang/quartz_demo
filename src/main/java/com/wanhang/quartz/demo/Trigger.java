package com.wanhang.quartz.demo;

/**
 * 记录下次运行作业的时间和运行job的key
 * 
 * @author 卢艳亮
 * @version 2015年8月14日 上午11:19:17
 */
public class Trigger implements Comparable<Trigger> {
	private String jobKey;
	private long nextFireTime;

	@Override
	public int compareTo(Trigger o) {// 在treemap中可以根据下次运行时间排序
		return (int) (this.nextFireTime - o.getNextFireTime());
	}

	public void resert() {
		setNextFireTime(-1);// 测试是只想运行一次,使用-1来退出
	}

	/**
	 * @return the jobKey
	 */
	public String getJobKey() {
		return jobKey;
	}

	/**
	 * @param jobKey
	 *            the jobKey to set
	 */
	public void setJobKey(String jobKey) {
		this.jobKey = jobKey;
	}

	/**
	 * @return the nextFireTime
	 */
	public long getNextFireTime() {
		return nextFireTime;
	}

	/**
	 * @param nextFireTime
	 *            the nextFireTime to set
	 */
	public void setNextFireTime(long nextFireTime) {
		this.nextFireTime = nextFireTime;
	}

}