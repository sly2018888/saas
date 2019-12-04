package com.sly.domain.system;

import lombok.Data;

import java.io.Serializable;

@Data
public class Dept implements Serializable {

    private String deptId;
    private String deptName;
    private Dept parent;
    private String state;
    private String companyId;
    private String companyName;
}
