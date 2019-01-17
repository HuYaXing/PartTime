package org.wlgzs.parttime.service.impl;

import org.wlgzs.parttime.entity.User;
import org.wlgzs.parttime.mapper.UserMapper;
import org.wlgzs.parttime.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-01-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
