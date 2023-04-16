package com.lin.service.impl;

import com.lin.dao.DormitoryDao;
import com.lin.domain.Dormitory;
import com.lin.service.DormitoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DormitoryServiceImpl implements DormitoryService {
    @Autowired
    private DormitoryDao dormitoryDao;
    @Override
    public List<Dormitory> getDormitory() {
        return dormitoryDao.getDormitory();
    }
    public Boolean delete(Integer st_id){
        return dormitoryDao.delete(st_id)>0;
    }
    public Boolean update(Dormitory dormitory){
        return dormitoryDao.update(dormitory)>0;
    }

    @Override
    public Dormitory selectById(long id) {
        return dormitoryDao.selectById(id);
    }
}
