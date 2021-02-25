package com.ncu.gulimall.product.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ncu.gulimall.product.service.BrandService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

	@Autowired
	BrandService brandService;
	
	@Test
	public void test1() {
		int count = brandService.count();
		System.out.println(count);
		
	}
}
