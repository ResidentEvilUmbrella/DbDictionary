package com.yunhesoft.tm4.dbdictionary.entity.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: zhang.jt
 */
@Getter
@Setter
public class SysDictTableDto {
	private String tmuid;
	private String tableName;
	private String tableShowName;
	private String moduleCode;
	private String dbConnId;
	private Boolean used;
	private Integer sort;
	private String remark;
}
