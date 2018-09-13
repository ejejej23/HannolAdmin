package com.sp.company;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.common.dao.CommonDAO;

@Service("company.companyServiceImpl")
public class CompanyServiceImpl implements CompanyService{
	@Autowired
	private CommonDAO dao;
	
	@Override
	public int insertCompany(Company dto){
		int result = 0;
		
		try {
			result = dao.insertData("company.insertCompany", dto);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return result;
	}

	@Override
	public int dataCount(Map<String, Object> map) {
		int result = 0;
		
		try {
			result = dao.selectOne("company.dataCount", map);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
	}

	@Override
	public List<Company> listCompany(Map<String, Object> map) {
		List<Company> list = null;
		
		try {
			list = dao.selectList("company.listCompany", map);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return list;
	}

	@Override
	public Company readCompany(int num) {
		Company dto = null;
		
		try {
			dto = dao.selectOne("company.readCompany", num);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return dto;
	}

	@Override
	public int updateCompany(Company dto) {
		int result = 0;
		
		try {
			result = dao.updateData("company.updateCompany", dto);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
	}

	@Override
	public int deleteCompany(int num) {
		int result = 0;
		
		try {
			result = dao.deleteData("company.deleteCompany", num);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
	}

}
