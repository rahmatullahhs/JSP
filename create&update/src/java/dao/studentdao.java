package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.student;
import util.dbutil;

public class studentdao {

    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;

    public static List<student> getAllStudents() {
        List<student> students = new ArrayList<>();
        sql = "select * from student";

        try {
            ps = dbutil.getCon().prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                student s = new student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("contactNo"),
                        rs.getString("subject"),
                        rs.getString("gender")
                );

                students.add(s);

            }

            rs.close();
            ps.close();
            dbutil.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(studentdao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return students;
    }

    public static int saveStudent(student s) {

        if (!(s.getName().isEmpty())) {

        }

        int status = 0;
        sql = "insert into student(name, email, contactNo, subject, gender) values(?,?,?,?,?)";

        try {
            ps = dbutil.getCon().prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getContactNo());
            ps.setString(4, s.getSubject());
            ps.setString(5, s.getGender());

            status = ps.executeUpdate();

            System.out.println(status);

            ps.close();
            dbutil.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(studentdao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

    public static void deleteStudent(int id) {
        sql = "delete from student where id= ?";

        try {
            ps = dbutil.getCon().prepareStatement(sql);
            ps.setInt(1, id);

            ps.executeUpdate();

            ps.close();
            dbutil.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(studentdao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static student getById(int id) {
        student s = null;
        sql = "select * from student where id=?";

        try {
            ps = dbutil.getCon().prepareStatement(sql);
            ps.setInt(1, id);

            rs = ps.executeQuery();

            while (rs.next()) {
                s = new student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("contactNo"),
                        rs.getString("subject"),
                        rs.getString("gender")
                );
            }

            rs.close();
            ps.close();
            dbutil.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(studentdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }

    public static int updateStudent(student s) {
        int status = 0;
        sql = "update student set name= ?, email= ?, contactNo= ?, gender=?, subject=? where id=?";

        try {
            ps = dbutil.getCon().prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getContactNo());
            ps.setString(4, s.getGender());
            ps.setString(5, s.getSubject());
            ps.setInt(6, s.getId());

            status = ps.executeUpdate();

            System.out.println(status);

            ps.close();
            dbutil.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(studentdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

}