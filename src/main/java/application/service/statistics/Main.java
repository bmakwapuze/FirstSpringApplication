package application.service.statistics;

import application.service.statistics.config.AppConfig;
import application.service.statistics.service.StatisticsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    static final Logger log = Logger.getLogger(String.valueOf(Main.class));

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        log.info("enter number of elements");
        int numOfValues = sc.nextInt();
        double[] values = new double[numOfValues];
        log.info("enter " + numOfValues + " elements");
        for (int i = 0; i < numOfValues; i++) {
            values[i] = sc.nextDouble();
        }
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StatisticsService sum = context.getBean("statisticsService", StatisticsService.class);
        StatisticsService median = context.getBean("statisticsService", StatisticsService.class);
        StatisticsService average = context.getBean("statisticsService", StatisticsService.class);
        log.info("sum is " + sum.calculateSum(values));
        log.info("median is " + median.calculateMedian(values));
        log.info("avarage is " + average.calculateAverage(values));
    }
}

