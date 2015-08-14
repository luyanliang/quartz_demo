package com.wanhang.quartz.demo;

public class MainTest {

	public static void main(String[] args) throws Exception {
		final JobDetail detail1 = new JobDetail("job1", Job.class) {
			{
				getJobData().put("type", "job1");
			}
		};
		final JobDetail detail2 = new JobDetail("job2", Job.class) {
			{
				getJobData().put("type", "job2");
			}
		};
		final Trigger trigger1 = new Trigger() {
			{
				setNextFireTime(System.currentTimeMillis() + 3000l);
			}
		};
		final Trigger trigger2 = new Trigger() {
			{
				setNextFireTime(System.currentTimeMillis() + 1000l);
			}
		};

		Scheduler scheduler = new Scheduler();
		scheduler.schedulerJob(detail1, trigger1);
		scheduler.schedulerJob(detail2, trigger2);

		scheduler.start();
		Thread.sleep(10000l);
		scheduler.halt();
	}

}
