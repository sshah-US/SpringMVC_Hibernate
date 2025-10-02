package com.ss.breg.service;

import com.ss.breg.dao.AllInfoDAO;
import com.ss.breg.exception.ApplicationException;
import com.ss.breg.model.AllInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AllInfoService {

    @Autowired
    private AllInfoDAO dao;

    @Transactional(rollbackFor = Exception.class)
    public boolean registerUser(AllInfo info) throws ApplicationException {
        return dao.save(info);
    }
}
