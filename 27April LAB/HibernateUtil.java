package TheaterMovies;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
private static StandardServiceRegistry registry;
private static SessionFactory sessionFactory;
public static SessionFactory getSessionFactory(){
try {
registry = new StandardServiceRegistryBuilder().configure().build();
MetadataSources sources = new MetadataSources(registry);
Metadata metaData = sources.getMetadataBuilder().build();
sessionFactory = metaData.getSessionFactoryBuilder().build();
}catch(Exception ex) {
ex.printStackTrace();
}
return sessionFactory;
}
}
