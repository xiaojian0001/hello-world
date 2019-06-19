package cn.erha.job;

import java.util.Date;

import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

import cn.erha.mapper.OrderMapper;

public class OrderOTJob extends QuartzJobBean {

	@Override
	protected void executeInternal(JobExecutionContext jobContext) throws JobExecutionException {
		
		JobDetail jobDetail=jobContext.getJobDetail();
		
		ApplicationContext context=(ApplicationContext) jobDetail.getJobDataMap().get("applicationContext");
	
		System.out.println("定时任务开始执行");

		Date oTime=new Date(new Date().getTime()-60*60*24);
		
		context.getBean(OrderMapper.class).orderOTDelete(oTime);
		
		System.out.println("定时任务执行结束");
	}

}
