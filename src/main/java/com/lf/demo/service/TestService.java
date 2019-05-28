package com.lf.demo.service;

import com.lf.demo.common.ServerResponse;

/**
 * @author linfei
 * @version 1.0
 * @date 2019/5/28
 * @desc
 * @see
 * @since 1.0
 */
public interface TestService {

    ServerResponse testIdempotence();
}
