package com.eduardoportfolio.jdbc.exception;

import java.sql.SQLException;

/**
 * @author Eduardo Geralde Neto
 * 
 * Exception created to use in the methods of our ContactDao Class
 */

public class DAOException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DAOException(SQLException e){
		super(e);
	}

}
