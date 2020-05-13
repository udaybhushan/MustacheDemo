package com.example.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.ListDataPojo;
import com.example.demo.pojo.SingleFieldPojo;
import com.example.demo.service.MustacheService;

@RestController
@RequestMapping("/v1/mustache")
public class MustacheController {
	
	@Autowired
	MustacheService mustacheService;
	
	@GetMapping("/getSingleFieldTemplate")
	public String getDefaultTemplate() {
		return "<html>\r\n" + 
				"<body>\r\n" + 
				"<p>{{data}}</p>\r\n" + 
				"</body>\r\n" + 
				"</html>";
	}
	
	@GetMapping("/getListDataTemplate")
	public String getListDataTemplate() {
		return "<html>\r\n" + 
				"<body>\r\n" + 
				"<p>{{#data}}{{/data}}</p>\r\n" + 
				"<p>{{#singleFieldedList}}{{data}}{{/singleFieldedList}}</p>\r\n" + 
				"</body>\r\n" + 
				"</html>";
	}
	
	@PostMapping("/signleFieldData")
	public String renderTemplate(@RequestBody SingleFieldPojo singleFieldPojo) {
		try {
			return mustacheService.renderSingleFieldData(singleFieldPojo);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@PostMapping("/listData")
	public String renderListData(@RequestBody ListDataPojo listData) {
		try {
			return mustacheService.renderSingleFieldData(listData);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
