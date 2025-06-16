package hib.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration().configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session sess = factory.openSession();
        Transaction tx = sess.beginTransaction();
        
        Interview i1 = new Interview();
        Interview i2 = new Interview();
        Interview i3 = new Interview();
        Interview i4 = new Interview();
        
        //list for c1
        List<Interview> iList1 = new ArrayList<Interview>();
        iList1.add(i1);
        iList1.add(i2);
        
      //list for c2
        List<Interview> iList2 = new ArrayList<Interview>();
        iList2.add(i1);
        iList2.add(i3);
        
      //list for c3
        List<Interview> iList3 = new ArrayList<Interview>();
        iList3.add(i2);
        iList3.add(i3);
        iList3.add(i4);
        
        Candidate c1 = new Candidate(111, "sumit", iList1);
        Candidate c2 = new Candidate(222, "anya", iList2);
        Candidate c3 = new Candidate(333, "ravi", iList3);
        
        //list for interview1
        List<Candidate> cList1 = new ArrayList<Candidate>();
        cList1.add(c1);
        cList1.add(c2);
        
      //list for interview2
        List<Candidate> cList2 = new ArrayList<Candidate>();
        cList2.add(c1);
        cList2.add(c3);
        
      //list for interview3
        List<Candidate> cList3 = new ArrayList<Candidate>();
        cList3.add(c2);
        cList3.add(c3);
        
      //list for interview4
        List<Candidate> cList4 = new ArrayList<Candidate>();
        cList4.add(c3);
        
        i1.setiId(1);
        i1.setiName("TCS");
        i1.setCandList(cList1);
        
        i2.setiId(2);
        i2.setiName("HCL");
        i2.setCandList(cList2);
        
        i3.setiId(3);
        i3.setiName("IBM");
        i3.setCandList(cList3);
        
        i4.setiId(4);
        i4.setiName("CGI");
        i4.setCandList(cList4);
       
        sess.persist(c1);
        sess.persist(c2);
        sess.persist(c3);
        
        sess.persist(i1);
        sess.persist(i2);
        sess.persist(i3);
        sess.persist(i4);
        
        tx.commit();
    }
}
