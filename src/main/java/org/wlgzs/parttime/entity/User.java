package org.wlgzs.parttime.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    /**
     * 手机号
     */
    private String userPhone;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 姓名
     */
    private String userName;

    /**
     * 性别
     */
    private String sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 账户金额
     */
    private BigDecimal userMoney;

    /**
     * 个人简介
     */
    private String introduction;

    /**
     * 地区
     */
    private String userAddress;

    /**
     * 邮箱
     */
    private String userEmail;


}
