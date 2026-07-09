package com.ferhatkocaosmanli.service;

import com.ferhatkocaosmanli.dto.DtoEmployee;

public interface IEmployeeService {

    DtoEmployee findEmployeeById(Long id);
}
