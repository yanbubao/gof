package april.pattern.behavioral.template.jdbc.framework;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yanzx
 */
public abstract class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * template method
     *
     * @param sql
     * @param rowMapper
     * @param values
     * @return resultList
     */
    public final List<?> executeQuery(String sql, RowMapper<?> rowMapper, Object[] values) {
        try {
            //1、获取连接
            Connection conn = this.getConnection();
            //2、创建语句集
            PreparedStatement ps = this.createPrepareStatement(conn, sql);
            //3、执行语句集
            ResultSet rs = this.executeQuery(ps, values);
            //4、处理结果集
            List<?> result = this.parseResultSet(rs, rowMapper);
            //5、关闭结果集
            rs.close();
            //6、关闭语句集
            ps.close();
            //7、关闭连接
            conn.close();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    protected List<?> parseResultSet(ResultSet rs, RowMapper<?> rowMapper) throws Exception {
        List<Object> result = new ArrayList<>();
        int rowNum = 0;
        while (rs.next()) {
            result.add(rowMapper.mapRow(rs, rowNum++));
        }
        return result;
    }

    private PreparedStatement createPrepareStatement(Connection conn, String sql) throws SQLException {
        return conn.prepareStatement(sql);
    }

    private Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }

    protected ResultSet executeQuery(PreparedStatement ps, Object[] values) throws SQLException {
        for (int i = 0; i < values.length; i++) {
            ps.setObject(i, values[i]);
        }
        return ps.executeQuery();
    }
}
