package com.ocloudwork.cloud.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
/**
 * 数据初始化配置
 * <p>Description: </p>  
 * <p>Copyright: Copyright (c) 2018</p>  
 * <p>Company: www.ocloudwork.com</p>  
 * @author minghui
 * @datetime 2018年8月21日-上午10:33:09
 */
@Component
//@Order(value=1)//有多个CommandLineRunner接口时可以指定执行顺序（小的先执行）
public class DataInitConfig implements CommandLineRunner {//CommandLineRunner表示在所有的bean以及applicationCOntenxt完成后的操作

//  @Autowired
//  ConfigRepository configRepository;
//  @Autowired
//  CacheService cacheService;

  @Override
  public void run(String... args) throws Exception {
      System.err.println("执行数据初始化操作......");
      //将config数据。。放置redis
//      List<Config> configs = configRepository.findAll();
//      if(configs != null && !configs.isEmpty()){
//          for(Config config : configs){
//              String key = Constant.CONFIG_PREFIX+config.getKey();
//              String val = config.getValue();
//
//              cacheService.set(key, val);
//          }
//      }
  }
}
