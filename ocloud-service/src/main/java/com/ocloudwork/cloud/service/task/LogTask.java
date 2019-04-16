package com.ocloudwork.cloud.service.task;


import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
/**
 * 定时任务
 * @author minghui
 *
 */
@Component
public class LogTask {
	private static Logger log=LoggerFactory.getLogger(LogTask.class);
	@Scheduled(fixedRate=36000000)
	public void logTime(){
		log.info(LocalDateTime.now().toString());
	}
}
