package com.example.demo.pojo;


import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ListDataPojo {
	private List<String> data;
	private List<SingleFieldPojo> singleFieldedList;
	public List<String> getData() {
		return data;
	}
	public void setData(List<String> data) {
		this.data = data;
	}
	public List<SingleFieldPojo> getSingleFieldedList() {
		return singleFieldedList;
	}
	public void setSingleFieldedList(List<SingleFieldPojo> singleFieldedList) {
		this.singleFieldedList = singleFieldedList;
	}
	
}
