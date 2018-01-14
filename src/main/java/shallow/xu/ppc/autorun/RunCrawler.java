package shallow.xu.ppc.autorun;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import shallow.xu.ppc.utils.Command;

/**
 * @author shallow
 */
@Configuration
@EnableScheduling
public class RunCrawler {
    private Logger logger = LoggerFactory.getLogger(RunCrawler.class);

    @Scheduled(cron = "0 0 0/1 * * ? ")//  每隔一个小时执行(秒 分 时)
    /**
     * 抓取糗百热门文字
     * 每隔一个小时抓取一次
     */
    public void crawlQiuBai() {
        logger.info("* * * * * * * * * * * * * * * * * * * *");
        logger.info("RunCrawler.crawlQiuBai 执行定时备份任务");
        Command.exeCmd("python ../ppc_crawler/main.py qiubai");
        logger.info("* * * * * * * * * * * * * * * * * * * *");
    }
}
