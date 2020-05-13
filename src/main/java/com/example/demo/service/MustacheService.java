package com.example.demo.service;

import java.io.IOException;
import java.io.StringWriter;

import org.springframework.stereotype.Service;

import com.example.demo.pojo.ListDataPojo;
import com.example.demo.pojo.SingleFieldPojo;
import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;

@Service
public class MustacheService {
	
	public String renderSingleFieldData(SingleFieldPojo singleFieldPojo) throws IOException {
		MustacheFactory mustacheFactory = new DefaultMustacheFactory();
		Mustache mustache = mustacheFactory.compile("./src/main/resources/templates/main.mustache");
		StringWriter writer = new StringWriter();
		mustache.execute(writer, singleFieldPojo).flush();
		return writer.toString();
	}
	public String renderSingleFieldData(ListDataPojo listDataPojo) throws IOException {
		MustacheFactory mustacheFactory = new DefaultMustacheFactory();
		Mustache mustache = mustacheFactory.compile("./src/main/resources/templates/ListDataTemplate.mustache");
		StringWriter writer = new StringWriter();
		mustache.execute(writer, listDataPojo).flush();
		return writer.toString();
	}
}
