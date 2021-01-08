//package com.gtmap.fundsupervision.service.impl;
//
//import com.gtmap.fundsupervision.entity.FcjyClfMmhtEntity;
//import com.gtmap.fundsupervision.service.FcjyClfMmhtService;
//import com.gtmap.fundsupervision.vo.ClfMmhtListVo;
//import com.gtmap.fundsupervision.vo.ClfMmhtVo;
//import com.gtmap.fundsupervision.vo.FcxxVo;
//import com.gtmap.fundsupervision.vo.ZJjgFcxxVo;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//
///**
// * @author <a href="mailto:liuyaozong@gtmap.cn">liuyaozong</a>
// * @version 1.0, 2020/12/22
// * @description
// */
//
//@SpringBootTest
//class ZjjghtServiceImplTest {
//
//    @Autowired
//    private FcjyClfMmhtService fcjyClfMmhtService;
//
//    @Test
//    void getDataByHtbh() {
//        List<ClfMmhtListVo> clfMmhtListVoByHtbh = fcjyClfMmhtService.findClfMmhtListVoByHtbh("0");
//        int i = 1;
//    }
//
//    @Test
//    void findClfMmhtVoByHtbh() {
//
//        ClfMmhtVo clfMmhtVo = fcjyClfMmhtService.findClfMmhtVoByHtbh("20000");
//
//        int i = 0;
//    }
//
//    @Test
//    void testFindClfMmhtVoByHtbh() {
//
//        FcjyClfMmhtEntity clfMmhtByHtbh = fcjyClfMmhtService.findClfMmhtByHtbh("20000");
//        int i = 1;
//    }
//
//    @Test
//    void findFcxxByCqzh() {
//        List<FcxxVo> fcxxVoByHtbh = fcjyClfMmhtService.findFcxxVoByHtbh("1");
//
//        int i = 1;
//    }
//
//    @Test
//    void findZJjgFcxxVoByCqzh() {
//        ZJjgFcxxVo zJjgFcxxVoByCqzh = fcjyClfMmhtService.findZJjgFcxxVoByCqzh("124000000");
//        int i = 1;
//    }
//}