package com.example.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.modal.PriyathamGalisetty;
import com.example.service.PGService;

@RestController
public class PGController {

	@Autowired
	PGService ps;
	
	@RequestMapping(value = "/get/{fn}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<PriyathamGalisetty> getData(@PathVariable String fn) {
		System.out.println("fn"+fn);
		return ps.getPG(fn);

	}
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<PriyathamGalisetty> getAllData() {
		return ps.getAllData();

	}
	
	@RequestMapping(value ="/Del/{fn}",method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public int deletebyfirstName(@PathVariable String fn){
		return ps.deletefromPG(fn);
	}
	
	@RequestMapping(value = "/insert" ,method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public Boolean insertintoPG() {
		return ps.insertintoPG();
	}
	
	@RequestMapping(value = "/update" , method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public int updatePG()
	{
		return ps.updatePG();
	}
	// Delete(DELETE) Update(PUT) Insert (POST)
}
