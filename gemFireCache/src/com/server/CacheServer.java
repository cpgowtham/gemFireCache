package com.server;

import java.util.Properties;

import com.gemstone.gemfire.cache.Cache;
import com.gemstone.gemfire.cache.CacheFactory;
import com.gemstone.gemfire.cache.Region;
import com.pojo.Employee;


public class CacheServer {
	
	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		prop.setProperty("cache-xml-file", "server.xml");
		prop.setProperty("start-locator", String.format("%s,server=true,peer=true", "localhost[42422]"));
		
		Cache serverCache = new CacheFactory(prop).create();
		
		Region<String, Employee> region = serverCache.getRegion("employee");
		region.put("001", new Employee("user1", "pwd1"));
		region.put("002", new Employee("user2", "pwd2"));
		
		
		
	}

}
