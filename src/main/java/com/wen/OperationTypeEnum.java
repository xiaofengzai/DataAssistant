package com.wen;

import com.wen.common.EnumMessage;

/**
 * Created by wenfeng on 2018/4/16.
 */
public enum  OperationTypeEnum implements EnumMessage<Integer> {
    FileSplit(1,"文件分割"),
    DataGrap(2,"数据抓取"),
    DataImport(3,"数据导入"),
    DataExport(4,"数据导出"),
    DataAnalysis(5,"数据分析");

    OperationTypeEnum(Integer value,String displayName){
        this.value=value;
        this.displayName=displayName;
    }
    private Integer value;
    private String displayName;
    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }
}
