package br.com.acasadojava.sql;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import br.com.acasadojava.config.Config;

public final class MyDataSource implements DataSource {

	@Override
	public final PrintWriter getLogWriter() throws SQLException {
		return null;
	}

	@Override
	public final int getLoginTimeout() throws SQLException {
		return 0;
	}

	@Override
	public final void setLogWriter(final PrintWriter arg0) throws SQLException {
	}

	@Override
	public final void setLoginTimeout(final int arg0) throws SQLException {
	}

	@Override
	public final boolean isWrapperFor(final Class<?> arg0) throws SQLException {
		return false;
	}

	@Override
	public final <T> T unwrap(final Class<T> arg0) throws SQLException {
		return null;
	}

	@Override
	public final Connection getConnection() throws SQLException {
		try {
			final Config config = Config.getInstance();
			Class.forName(config.getDbDriver());
			return DriverManager.getConnection(config.getDbUrl(), config.getDbUser(), config.getDbPass());
		} catch (final Exception exc) {
			throw new SQLException(exc);
		}
	}

	@Override
	public final Connection getConnection(final String username, final String password) throws SQLException {
		return null;
	}

}
