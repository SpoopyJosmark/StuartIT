package com.stuart.dao;

import com.stuart.entity.Course;
import com.stuart.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;

/**
 *
 * @author Kafka Febianto Agiharta - 1772012
 */
public class CourseDaoImpl implements DaoService <Course> {

    @Override
    public int addData(Course object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateData(Course object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int removeData(Course object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Course> getAllData() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Course.class).setFetchMode(
                "coursecategory", FetchMode.JOIN);
        List<Course> courses = criteria.list();
        session.close();
        return courses;
    }
    
}
