package TheaterMovies;

import org.hibernate.Session;
import org.hibernate.Transaction;
public class Main {
public static void main(String[] args) {
	Theatre jai=new Theatre("jai ho", "Delhi");
	Theatre shiva=new Theatre("shiva", "Bahadurgarh");
	Theatre shivay=new Theatre("shivay", "uk");

Transaction txn;
try(Session session = HibernateUtil.getSessionFactory().openSession()){
txn = session.beginTransaction();
session.save(jai);
session.save(shiva);
session.save(shivay);
txn.commit();
}
}
}
