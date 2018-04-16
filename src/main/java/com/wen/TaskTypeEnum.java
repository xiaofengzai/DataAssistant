package com.wen;

import com.wen.common.EnumMessage;

/**
 * Created by wenfeng on 2018/4/16.
 */
public enum TaskTypeEnum implements EnumMessage<Integer> {
    CreateTask(1,"新建任务"),
    ExcuteTask(2,"执行任务"),
    TerminateTask(3,"终止任务");

    TaskTypeEnum(Integer value, String displayName){
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
