package com.elastic.search.service;

import com.elastic.search.SearchApplication;
import com.elastic.search.entity.Commodity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: zhouheng
 * @Created: with IntelliJ IDEA.
 * @Description:
 * @Date: 2019-08-15
 * @Time: 13:56
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CommodityServiceTest {


    @Autowired
    private CommodityService commodityService;

    @Test
    public void count() {
        System.out.println(commodityService.count());
    }

    @Test
    public void save() {
//        Commodity commodity
    }

    @Test
    public void delete() {
    }

    @Test
    public void getAll() {
    }

    @Test
    public void getByName() {
    }

    @Test
    public void pageQuery() {
    }
}
