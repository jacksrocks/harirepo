package com.hk.sbean;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("gv")
@Data
@ConfigurationProperties("com.hk")
public class groupvalues 
{
	private String[] cities;
	private List<String> colors;
	private TreeSet<Long> phnos;

}
