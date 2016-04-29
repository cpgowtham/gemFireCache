package com.listener;

import java.util.Properties;

import com.gemstone.gemfire.cache.CacheListener;
import com.gemstone.gemfire.cache.Declarable;
import com.gemstone.gemfire.cache.EntryEvent;
import com.gemstone.gemfire.cache.RegionEvent;
import com.pojo.Employee;

public class ClientListener implements Declarable, CacheListener<String, Employee>{

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCreate(EntryEvent<String, Employee> arg0) {
		// TODO Auto-generated method stub
		System.out.println("Client Listener : Created : "+ arg0.getKey());
	}

	@Override
	public void afterDestroy(EntryEvent<String, Employee> arg0) {
		// TODO Auto-generated method stub
		System.out.println("Client Listener : Destroyed : "+ arg0.getKey());
	}

	@Override
	public void afterInvalidate(EntryEvent<String, Employee> arg0) {
		// TODO Auto-generated method stub
		System.out.println("Client Listener : Invalidated : "+ arg0.getKey());
	}

	@Override
	public void afterRegionClear(RegionEvent<String, Employee> arg0) {
		// TODO Auto-generated method stub
		System.out.println("Client Listener : Region Cleared : "+ arg0.getRegion().getName());
	}

	@Override
	public void afterRegionCreate(RegionEvent<String, Employee> arg0) {
		// TODO Auto-generated method stub
		System.out.println("Client Listener : Region Created : "+ arg0.getRegion().getName());
	}

	@Override
	public void afterRegionDestroy(RegionEvent<String, Employee> arg0) {
		// TODO Auto-generated method stub
		System.out.println("Client Listener : Region Destroyed : "+ arg0.getRegion().getName());
	}

	@Override
	public void afterRegionInvalidate(RegionEvent<String, Employee> arg0) {
		// TODO Auto-generated method stub
		System.out.println("Client Listener : Region Invalidated : "+ arg0.getRegion().getName());
	}

	@Override
	public void afterRegionLive(RegionEvent<String, Employee> arg0) {
		// TODO Auto-generated method stub
		System.out.println("Client Listener : Region Live : "+ arg0.getRegion().getName());
	}

	@Override
	public void afterUpdate(EntryEvent<String, Employee> arg0) {
		// TODO Auto-generated method stub
		System.out.println("Client Listener : Updated : "+ arg0.getKey());
	}

	@Override
	public void init(Properties arg0) {
		// TODO Auto-generated method stub
		
	}

}
