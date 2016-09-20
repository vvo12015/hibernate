import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.goit.java.model.Employee;
import ua.goit.java.dao.EmployeeDAO;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;

public class JDBCTest {

    private DataSource dataSource;

    private static final Logger LOGGER = LoggerFactory.getLogger(JDBCTest.class);
    private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");

    private String url;
    private String user;
    private String password;

    @Test
    public void loadDriver(){
        try{
            LOGGER.info("Loading JDBC driver: org.postgresql.Driver");
            Class.forName("org.postgresql.Driver");
            LOGGER.info("JDBC driver successfully");
            url = "jdbc:postgresql://localhost:5432/restaurant";
            user = "user";
            password = "111111";

        } catch (ClassNotFoundException e) {
            LOGGER.error("Cannot find driver: org.postgresql.Driver");
        }
    }

    @Test
    public void connectDBTest(){
        loadDriver();
        LOGGER.info("Connecting to DB");
        try (Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement()){
            LOGGER.info("Successfully connected to DB");
            String sql = "SELECT * FROM EMPLOYEE WHERE name = 'test'";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Assert.assertEquals("out equals surname which equals test", resultSet.getString("surname"),
                        "test");
            }
        }catch (SQLException e){
            LOGGER.error("Exception occurred while connecting to DB: " + url, e);
            throw new RuntimeException();
        }
    }

    @Test(expected = RuntimeException.class)
    public void connectDB_BadPasswordTest(){
        loadDriver();
        LOGGER.info("Connecting to DB");
        String bad_password = "1111";
        try (Connection connection = DriverManager.getConnection(url, user, bad_password)){
            LOGGER.info("Successfully connected to DB");
        }catch (SQLException e){
            LOGGER.error("Exception occurred while connecting to DB: " + url, e);
            throw new RuntimeException();
        }
    }

    @Test
    public void readDBTest(){
        loadDriver();
        LOGGER.info("Connecting to DB");
        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()){
            LOGGER.info("Successfully connected to DB");
            String sql = "SELECT * FROM EMPLOYEE WHERE name = 'test'";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Assert.assertEquals("out equals surname which equals test", resultSet.getString("surname"),
                        "test");
            }
        }catch (SQLException e){
            LOGGER.error("Exception occurred while connecting to DB: " + url, e);
            throw new RuntimeException();
        }
    }

    @Test
    public void EmployeeDAO_FindAll(){
        loadDriver();
        LOGGER.info("Connecting to DB");
        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()){
            LOGGER.info("Successfully connected to DB");
            LOGGER.info("Read count records in tables Employee");

            String sql = "SELECT COUNT(*) FROM EMPLOYEE";
            Long countRecords = 0L;
            ResultSet resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {
                countRecords = resultSet.getLong(1);
            }
            LOGGER.info("Read count records from tables Employee - successfully");
            EmployeeDAO employeeDAO = (EmployeeDAO) applicationContext.getBean("employeeDao");
            List<Employee> employees;

            LOGGER.info("Run HEmployeeDAO.findAll");

            employees = employeeDAO.findAll();
            Long size = Long.valueOf(employees.size());

            LOGGER.info("Run HEmployeeDAO.findAll - successfully");

            Assert.assertEquals("Equals count record between query SQL and findAll HEmployeeDAO",
                    countRecords, size);
        }catch (SQLException e){
            LOGGER.error("Exception occurred while connecting to DB: " + url, e);
            throw new RuntimeException();
        }
    }

    @Test
    public void EmployeeDAO_load(){

        EmployeeDAO employeeDAO = (EmployeeDAO) applicationContext.getBean("employeeDao");

        LOGGER.info("Run HEmployeeDAO.load");

        Employee employee = employeeDAO.load(1L);

        LOGGER.info("Run HEmployeeDAO.load - successfully");

        Assert.assertEquals("Equals count record between query SQL and findAll HEmployeeDAO",
                "test", employee.getName());
    }
}
