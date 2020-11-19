package cs6359.utdcart.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public interface DBMgr {

	Object execute(Connection connection) throws SQLException;
}
