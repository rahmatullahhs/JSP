package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Employee;
import util.DbUtil;

public class EmpDao {


        static PreparedStatement ps;
        static ResultSet rs;
        static String sql;

        public static List<Employee> getAllemployee() {
            List<Employee> employees = new ArrayList<>();
            sql = "select * from employee";

            try {
                ps = DbUtil.getCon().prepareStatement(sql);

                rs = ps.executeQuery();

                while (rs.next()) {
                    Employee s = new Employee(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("email"),
                            rs.getString("role"),
                            rs.getFloat("salary")
                       
                    );

                    employees.add(s);

                }

                rs.close();
                ps.close();
                DbUtil.getCon().close();

            } catch (SQLException ex) {
                Logger.getLogger(EmpDao.class.getName()).log(Level.SEVERE, null, ex);
            }

            return employees;
        }

        public static int saveEmp(Employee s) {
            int status = 0;
            sql = "insert into employee(name, email, role, salary) values(?,?,?,?)";

            try {
                ps = DbUtil.getCon().prepareStatement(sql);
                ps.setString(1, s.getName());
                ps.setString(2, s.getEmail());
                ps.setString(3, s.getRole());
                ps.setFloat(4, s.getSalary());
              

                status = ps.executeUpdate();

                System.out.println(status);

                ps.close();
                DbUtil.getCon().close();

            } catch (SQLException ex) {
                Logger.getLogger(EmpDao.class.getName()).log(Level.SEVERE, null, ex);
            }

            return status;
        }

    }


