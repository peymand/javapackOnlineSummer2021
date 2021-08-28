package com.kahkeshan.conf;

import org.hibernate.Hibernate;
import org.hibernate.boot.jaxb.internal.stax.HbmEventReader;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.dialect.MySQL55Dialect;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

//@Configuration
//@ComponentScan("com.kahkeshan")
//@EnableTransactionManagement
public class SpringContextConfig {

    @Bean("sf")
    public LocalSessionFactoryBean localSessionFactoryBean() {
        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
        factoryBean.setDataSource(dataSource());
        factoryBean.setPackagesToScan("com.kahkeshan.data.entities");
        Properties properties = new Properties();
        properties.setProperty(AvailableSettings.HBM2DDL_AUTO,"update");
        properties.setProperty(AvailableSettings.SHOW_SQL,"true");
        properties.setProperty(AvailableSettings.DIALECT, "org.hibernate.dialect.MySQL55Dialect");

        factoryBean.setHibernateProperties(properties);

        return factoryBean;
    }

    @Bean
    public DataSource dataSource() {
        SimpleDriverDataSource sdd = new SimpleDriverDataSource();
        sdd.setUrl("jdbc:mysql://localhost:3306/test");
        sdd.setUsername("root");
        sdd.setPassword("123456");
        sdd.setDriverClass(com.mysql.cj.jdbc.Driver.class);
        return sdd;
    }

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }


    @Bean
    public PlatformTransactionManager hibernateTransactionManager() {
        HibernateTransactionManager transactionManager
                = new HibernateTransactionManager();
        transactionManager.setSessionFactory(localSessionFactoryBean().getObject());
        return transactionManager;
    }
}
