package com.sly.service.cargo;

import com.sly.domain.cargo.Contract;
import com.sly.domain.cargo.ContractExample;
import com.github.pagehelper.PageInfo;
import com.sly.domain.vo.ContractProductVo;

import java.util.List;


public interface ContractService {

	//根据id查询
    Contract findById(String id);

    //保存
    void save(Contract contract);

    //更新
    void update(Contract contract);

    //删除
    void delete(String id);

    //分页查询
	public PageInfo findAll(ContractExample example, int page, int size);

    List<ContractProductVo> findContractProductVoByShipTime(String inputDate,String companyId);
}
