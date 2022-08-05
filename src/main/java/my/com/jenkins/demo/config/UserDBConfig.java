//package my.com.jenkins.demo.config;
//
//import java.util.*;
//
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.*;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.*;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//@Configuration
//@EnableJpaRepositories(entityManagerFactoryRef="entityManagerFactory",basePackages="my.com.jenkins.demo.repository")
//@EnableTransactionManagement
//public class UserDBConfig {
//	@Primary
//	@Bean(name="datasource")
//	@ConfigurationProperties(prefix="spring.datasource")
//	public DataSource datasource() {
//		return DataSourceBuilder.create().build();
//	}
//	
//	@Primary
//	@Bean(name="entityManagerFactory")
//	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(EntityManagerFactoryBuilder builder,
//			@Qualifier("datasource") DataSource dataSource) {
//		Map<String,Object> properties = new HashMap<>();
//		properties.put("hibernate.htm2ddl.auto", "update");
//		properties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
//		
//		return builder.dataSource(dataSource).properties(properties).packages("my.com.jenkins.demo.model")
//				.persistenceUnit("User").build();
//	}
//	
//	@Primary
//	@Bean(name="transactionManager")
//	public PlatformTransactionManager transactionManager(@Qualifier("entityManagerFactory") EntityManagerFactory entityManagerFactory) {
//		return new JpaTransactionManager(entityManagerFactory);
//	}
//}
