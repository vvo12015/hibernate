package ua.goit.java.restaurant.model.jdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.goit.java.restaurant.model.Employee;
import ua.goit.java.restaurant.dao.EmployeeDAO;
import ua.goit.java.restaurant.model.Waiter;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcEmployeeDAO implements EmployeeDAO {

    private DataSource dataSource;

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeDAO.class);

    @Override
    public List<Employee> findAll(){
        List<Employee> result = new ArrayList<>();

        LOGGER.info("Connecting to DB");
        try (Connection connection = dataSource.getConnection();
             Statement statement = connection.createStatement()){
            String sql = "SELECT * FROM EMPLOYEE";
            ResultSet resultSet = statement.executeQuery(sql);
            LOGGER.info("Successfully connected to DB from EmployeeDao.findAll");
            while (resultSet.next()) {
                result.add(createEmployee(resultSet));
            }
        }catch (SQLException e){
            LOGGER.error("Exception occurred while connecting to DB: ", e);
            throw new RuntimeException();
        }
        return result;
    }

    private Employee createEmployee(ResultSet resultSet) throws SQLException {
        Employee employee = new Employee();
        employee.setId(resultSet.getLong("id"));
        employee.setName(resultSet.getString("name"));
        employee.setSurName(resultSet.getString("surname"));
        employee.setPhoneNumber(resultSet.getString("phone_number"));
        employee.setSalary(resultSet.getFloat("salary"));
        return employee;
    }

    @Override
    public Employee load(Long id){
        LOGGER.info("Connecting to DB");
        String sql = "SELECT * FROM EMPLOYEE WHERE id = ?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)){

            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();
            LOGGER.info("Successfully connected to DB from EmployeeDao.load");

            if (resultSet.next()) {
                Employee employee = null;
                return createEmployee(resultSet);
            }else {
                LOGGER.error("Cannot find Employee with id" + id);
                throw new RuntimeException();
            }
        }catch (SQLException e){
            LOGGER.error("Exception occurred while connecting to DB: ", e);
            throw new RuntimeException();
        }
    }

    @Override
    public Waiter loadWaiter(Long id) {
        return null;
    }

    @Override
    public Employee findByName(String name) {
        return null;
    }

    @Override
    public Waiter findWaiterByName(String name) {
        return null;
    }

    @Override
    public void save(Employee employee) {

    }

    @Override
    public void remove(Employee employees) {

    }

    @Override
    public void removeAll() {

    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
