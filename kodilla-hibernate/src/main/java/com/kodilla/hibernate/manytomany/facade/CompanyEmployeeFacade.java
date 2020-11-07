package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

import static org.hibernate.hql.internal.antlr.HqlSqlTokenTypes.LIKE;

@Service
public class CompanyEmployeeFacade {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    public List<Employee> findEmployees(String partOfName){
        return employeeDao.retrievePartOfSurname(partOfName);
    }

    public List<Company> findCompany(String partoFCompanyName){
        return companyDao.retrievePartOfCompanyName(partoFCompanyName);
    }
}