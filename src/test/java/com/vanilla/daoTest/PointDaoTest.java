package com.vanilla.daoTest;

import com.vanilla.config.AppConfig;
import com.vanilla.dao.PointDaoImpl;
import com.vanilla.model.Point;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(
        classes = { AppConfig.class })
public class PointDaoTest {
    PointDaoImpl pointDao;
    @BeforeEach
    public void beforeEachTest() {
        ApplicationContext appCntxt = new AnnotationConfigApplicationContext(com.vanilla.config.AppConfig.class);
        pointDao = appCntxt.getBean("pointDaoImpl", PointDaoImpl.class);
        pointDao.insertPoint(new Point(11,22,33));
    }
    @Test
    public void retrieveAllRecords() {
        int actualResult = pointDao.getPoint().size();
        int expectedResult = 2;
        Assertions.assertNotEquals(actualResult, expectedResult);
    }

}
