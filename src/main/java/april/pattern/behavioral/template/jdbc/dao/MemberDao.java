package april.pattern.behavioral.template.jdbc.dao;

import april.pattern.behavioral.template.jdbc.framework.JdbcTemplate;
import april.pattern.behavioral.template.jdbc.framework.RowMapper;
import april.pattern.behavioral.template.jdbc.po.Member;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author yanzx
 */
public class MemberDao extends JdbcTemplate {
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll() {
        String sql = "select * from t_member";

        return super.executeQuery(sql, (RowMapper<Member>) (rs, rowNum) -> {

            Member member = new Member();
            member.setUsername(rs.getString("username"));
            member.setPassword(rs.getString("password"));
            member.setAge(rs.getInt("age"));
            member.setAddr(rs.getString("addr"));
            return member;

        }, null);
    }
}
