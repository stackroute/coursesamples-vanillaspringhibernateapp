package com.vanilla.dao;

import com.vanilla.model.Point;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@Repository
public class PointDaoImpl {

    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Point> getPoint(){
        String hql = "from Point";
        Query query = sessionFactory.openSession().createQuery(hql);
        return ((List<Point>) query.list());
    }

    public Point getPointById(int pointId){
        String hql = "from Point WHERE pointId=:pointId";
        Query query = sessionFactory.openSession().createQuery(hql);
        query.setParameter("pointId", pointId);
        return (Point) query.list();
    }

    public void insertPoint(Point p){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(p);
        transaction.commit();
    }

}