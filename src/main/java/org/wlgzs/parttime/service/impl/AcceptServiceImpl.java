package org.wlgzs.parttime.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.wlgzs.parttime.entity.Accept;
import org.wlgzs.parttime.mapper.AcceptMapper;
import org.wlgzs.parttime.service.IAcceptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-01-16
 */
@Service
public class AcceptServiceImpl extends ServiceImpl<AcceptMapper, Accept> implements IAcceptService {
    @Autowired(required = true)
    AcceptMapper acceptMapper;


}
