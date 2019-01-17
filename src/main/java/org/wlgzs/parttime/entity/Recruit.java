package org.wlgzs.parttime.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-01-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Recruit implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 招聘id
     */
    @TableId(value = "recruit_id", type = IdType.AUTO)
    private Integer recruitId;

    /**
     * 用户id(招聘者)
     */
    private Integer recruiterId;

    /**
     * 招聘者姓名
     */
    private String recruiterName;

    /**
     * 工作名
     */
    private String workName;

    /**
     * 工作内容
     */
    private String woekContent;

    /**
     * 电话(招聘者)  
     */
    private String recruiterPhone;

    /**
     * 发布时间
     */
    private LocalDateTime time;

    /**
     * 薪资
     */
    private BigDecimal salary;

    /**
     * 状态（是否被接取，完成与否）(0表示没接取，1表示未完成，2表示已完成)
     */
    private String state;

    /**
     * 审核状态，1通过，0待审核
     */
    private String auditCode;


}
