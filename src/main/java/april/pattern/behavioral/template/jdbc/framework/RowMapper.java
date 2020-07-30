package april.pattern.behavioral.template.jdbc.framework;

import java.sql.ResultSet;

/**
 * @author yanzx
 */
@FunctionalInterface
public interface RowMapper<T> {
    T mapRow(ResultSet rs, int rowNum) throws Exception;
}
