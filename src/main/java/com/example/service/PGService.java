package com.example.service;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.dao.PriyathamGalisettyDAO;
import com.example.modal.PriyathamGalisetty;
import com.example.repository.PGRepository;

@Service
public interface PGService {
	List<PriyathamGalisetty> getAllData();
	List<PriyathamGalisetty> getPG(String firstName);
	int deletefromPG(String fn);
	Boolean insertintoPG();
	int updatePG();
}
