package jdbcTest;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class TestJdbc {
    public ApplicationContext applicationContext = null;

    {
        applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    }

    @Before
    public void init(){

    }

    @Test
    public void test(){
        ComboPooledDataSource dataSource = (ComboPooledDataSource) applicationContext.getBean(ComboPooledDataSource.class);
        try {
            System.out.println(dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
