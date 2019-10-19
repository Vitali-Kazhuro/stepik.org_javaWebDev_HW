package dbService.dao;

import dbService.dataSets.UsersDataSet;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


public class UsersDAO {

    private Session session;

    public UsersDAO(Session session) {
        this.session = session;
    }

    public UsersDataSet get(String login) throws HibernateException {
        return (UsersDataSet) session.createCriteria(UsersDataSet.class)
                .add(Restrictions.eq("login", login)).uniqueResult();
    }

    public long getUserId(String login) throws HibernateException {
        Criteria criteria = session.createCriteria(UsersDataSet.class);
        return ((UsersDataSet) criteria.add(Restrictions.eq("login", login)).uniqueResult()).getId();
    }

    public long insertUser(UsersDataSet user) throws HibernateException {
        return (Long) session.save(user);
    }
}
