package com.ferhatkocaosmanli.controller;

import com.ferhatkocaosmanli.dto.DtoEmployee;

public interface IRestEmployeeController {

    public DtoEmployee findEmployeeById(Long id);
}
