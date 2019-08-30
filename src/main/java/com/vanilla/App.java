package com.vanilla;

import com.vanilla.config.AppConfig;
import com.vanilla.dao.PointDaoImpl;
import com.vanilla.model.Point;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext appCntxt = new AnnotationConfigApplicationContext(AppConfig.class);
        PointDaoImpl pointDaoImpl = appCntxt.getBean("pointDaoImpl", PointDaoImpl.class);
        System.out.println(pointDaoImpl.getPoint());
    }
}
