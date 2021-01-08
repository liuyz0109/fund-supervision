package com.gtmap.fundsupervision.service.impl;

import com.gtmap.fundsupervision.entity.FcjyChcgCgshEntity;
import com.gtmap.fundsupervision.mapper.FcjyChcgCgshMapper;
import com.gtmap.fundsupervision.service.FcjyChcgCgshService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
 * @version 1.0, 2020/12/13
 * @description
 */

@Slf4j
@Service
public class FcjyChcgCgshServiceImpl implements FcjyChcgCgshService {

    @Autowired
    private FcjyChcgCgshMapper fcjyChcgCgshMapper;

    //全查
    @Override
    public List<FcjyChcgCgshEntity> findAll() {
        return fcjyChcgCgshMapper.findAll();
    }
}
