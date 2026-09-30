package example.com.server.Utils;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration 
public class DBConection {
    @Value ("${db.name}")
    public String name;

    @Value ("${db.port}")
    public String port;

    @Value ("${db.host}")
    public String host;

    @Value ("${db.user}")
    public String user;

    @Value ("${db.password}")
    String password;

    @Bean 

    public DataSource getDBConecction(){
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setDriverClassName("com.mysql.cj.jdbc.Driver");
        source.setUrl("jdbc:mysql://" + host + ":" + port + "/" + name);
        source.setPassword(password);
        source.setUsername(user);
        return source;
    }
}
