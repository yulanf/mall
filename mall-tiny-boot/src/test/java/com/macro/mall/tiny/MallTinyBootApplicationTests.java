package com.macro.mall.tiny;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallTinyBootApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private PmsBrandService pmsBrandService;

    @Test
    public void testMethod() {
        List<PmsBrand> brandList = pmsBrandService.listAllBrand();
        log.info("testMethod:{}", brandList);

    }

}