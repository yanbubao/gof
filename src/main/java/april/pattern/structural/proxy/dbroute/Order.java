package april.pattern.structural.proxy.dbroute;

import lombok.Data;

/**
 * @author yanzx
 */
@Data
public class Order {

    /**
     * 订单创建时间进行按年分库
     */
    private Long createTime;

    private Object orderInfo;

    private String id;
}
