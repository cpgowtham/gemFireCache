package com.loader;

import java.util.Properties;

import com.gemstone.gemfire.cache.CacheLoader;
import com.gemstone.gemfire.cache.CacheLoaderException;
import com.gemstone.gemfire.cache.Declarable;
import com.gemstone.gemfire.cache.LoaderHelper;

public class ServerLoader  implements Declarable, CacheLoader{

	@Override
	public void init(Properties arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object load(LoaderHelper helper) throws CacheLoaderException {
		// TODO Auto-generated method stub
		String key = (String) helper.getKey();
	      
		System.out.println(" Loader called to retrieve value for " + key);

	// Create a value using the suffix number of the key (key1, key2, etc.)

		return "user" + (Integer.parseInt(key));
	}

}
