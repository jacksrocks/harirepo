package com.hk;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.hk.sbean.groupvalues;

@SpringBootApplication
public class SpringBootBulkpropertiesApplication
{

	public static void main(String[] args)
	{
	  ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootBulkpropertiesApplication.class, args);
	  groupvalues values=ctx.getBean("gv",groupvalues.class);
	  System.out.println(values);
	  String[] names = ctx.getBeanDefinitionNames();
	  System.out.println(Arrays.toString(names));
	  ctx.close();
	}

}
