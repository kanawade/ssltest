package com.hrdb.repository; 
// Generated 16 Sep, 2014 12:14:07 PM 

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.hrdb.*;
/**
 * Specifies methods used to obtain and modify User related information
 * which is stored in the database.
 */
@Repository("hrdb.UserDao")
public class UserRepository extends WMGenericDaoImpl <User, Integer> {

   @Autowired
   @Qualifier("hrdbTemplate")
   private HibernateTemplate template;

   public HibernateTemplate getTemplate() {
        return this.template;
   }
}

