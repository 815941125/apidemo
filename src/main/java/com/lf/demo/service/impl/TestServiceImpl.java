package com.lf.demo.service.impl;

import com.lf.demo.common.ServerResponse;
import com.lf.demo.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @author linfei
 * @version 1.0
 * @date 2019/5/28
 * @desc
 * @see
 * @since 1.0
 */
@Service
public class TestServiceImpl implements TestService {
    @Override
    public ServerResponse testIdempotence() {
        return ServerResponse.success("操作成功");
    }
}
