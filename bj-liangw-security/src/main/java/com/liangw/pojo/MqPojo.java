package com.liangw.pojo;
import lombok.Data;

import java.util.List;

/**
 * @ClassName MqPojo
 * @Description TODO
 * @Author liangw
 * @Date 2020/7/1 18:16
 * @Version 1.0
 **/
@Data
public class MqPojo {
    private Integer type;
    private List<MqNotices> notices;
}
