package com.client;

import java.util.Properties;

import com.gemstone.gemfire.cache.InterestResultPolicy;
import com.gemstone.gemfire.cache.Region;
import com.gemstone.gemfire.cache.client.ClientCache;
import com.gemstone.gemfire.cache.client.ClientCacheFactory;
import com.pojo.Employee;

public class CacheClient {

	public static void main(String[] args) {

		Properties prop = new Properties();

		prop.setProperty("cache-xml-file", "client.xml");

		ClientCache cache = new ClientCacheFactory(prop).create();

		Region<String, Employee> empRegion = cache.getRegion("employee");

		empRegion.registerInterest("ALL_KEYS", InterestResultPolicy.KEYS);

		//empRegion.put("001", new Employee("user1", "pwd2"));
		
		while(true){
		}
	}

}
