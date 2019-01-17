package org.wlgzs.parttime.service.impl;

import org.wlgzs.parttime.entity.Admin;
import org.wlgzs.parttime.mapper.AdminMapper;
import org.wlgzs.parttime.service.IAdminService;
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
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
