
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.DBUtil;
public class UserDAO {
public String getUserType(String userID) {

    String userType = null;

    try {

        Connection con = DBUtil.getConnection();

        String sql = "SELECT USERTYPE FROM USER_DETAILS WHERE USERID=?";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, userID);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            userType = rs.getString("USERTYPE");
        }

        rs.close();
        ps.close();
        con.close();

    } catch (Exception e) {
        e.printStackTrace();
    }

    return userType;
}
}
