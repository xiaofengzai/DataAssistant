package com.wen;

import com.wen.common.EnumMessage;
import com.wen.common.EnumUtils;

import java.util.List;

/**
 * Created by wenfeng on 2018/4/16.
 */
public enum StageTypeEnum implements EnumMessage<Integer> {
    CreateSplitTask(1,OperationTypeEnum.FileSplit,TaskTypeEnum.CreateTask,"新建任务","/task/create_task.fxml"),
    CreateGrapTask(2,OperationTypeEnum.DataGrap,TaskTypeEnum.CreateTask,"新建任务","/task/create_task.fxml"),
    CreateImportTask(3,OperationTypeEnum.DataImport,TaskTypeEnum.CreateTask,"新建任务","/task/create_task.fxml"),
    CreateExportTask(4,OperationTypeEnum.DataExport,TaskTypeEnum.CreateTask,"新建任务","/task/create_task.fxml"),
    CreateAnalysis(5,OperationTypeEnum.DataAnalysis,TaskTypeEnum.CreateTask,"新建任务","/task/create_task.fxml"),
    EditSplitTask(11,OperationTypeEnum.FileSplit,TaskTypeEnum.EditTask,"编辑任务","/task/create_task.fxml"),
    EditGrapTask(12,OperationTypeEnum.DataGrap,TaskTypeEnum.EditTask,"编辑任务","/task/create_task.fxml"),
    EditImportTask(13,OperationTypeEnum.DataImport,TaskTypeEnum.EditTask,"编辑任务","/task/create_task.fxml"),
    EditExportTask(14,OperationTypeEnum.DataExport,TaskTypeEnum.EditTask,"编辑任务","/task/create_task.fxml"),
    EditAnalysis(15,OperationTypeEnum.DataAnalysis,TaskTypeEnum.EditTask,"编辑任务","/task/create_task.fxml"),
    ExcuteSplitTask(21,OperationTypeEnum.FileSplit,TaskTypeEnum.ExcuteTask,"执行任务","/task/create_task.fxml"),
    ExcuteGrapTask(22,OperationTypeEnum.DataGrap,TaskTypeEnum.ExcuteTask,"执行任务","/task/create_task.fxml"),
    ExcuteImportTask(23,OperationTypeEnum.DataImport,TaskTypeEnum.ExcuteTask,"执行任务","/task/create_task.fxml"),
    ExcuteExportTask(24,OperationTypeEnum.DataExport,TaskTypeEnum.ExcuteTask,"执行任务","/task/create_task.fxml"),
    ExcuteAnalysis(25,OperationTypeEnum.DataAnalysis,TaskTypeEnum.ExcuteTask,"执行任务","/task/create_task.fxml"),
    TerminateSplitTask(31,OperationTypeEnum.FileSplit,TaskTypeEnum.TerminateTask,"终止任务","/task/create_task.fxml"),
    TerminateGrapTask(32,OperationTypeEnum.DataGrap,TaskTypeEnum.TerminateTask,"终止任务","/task/create_task.fxml"),
    TerminateImportTask(33,OperationTypeEnum.DataImport,TaskTypeEnum.TerminateTask,"终止任务","/task/create_task.fxml"),
    TerminateExportTask(34,OperationTypeEnum.DataExport,TaskTypeEnum.TerminateTask,"终止任务","/task/create_task.fxml"),
    TerminateAnalysis(35,OperationTypeEnum.DataAnalysis,TaskTypeEnum.TerminateTask,"终止任务","/task/create_task.fxml"),
    RemoveSplitTask(41,OperationTypeEnum.FileSplit,TaskTypeEnum.RemoveTask,"删除任务","/task/create_task.fxml"),
    RemoveGrapTask(42,OperationTypeEnum.DataGrap,TaskTypeEnum.RemoveTask,"删除任务","/task/create_task.fxml"),
    RemoveImportTask(43,OperationTypeEnum.DataImport,TaskTypeEnum.RemoveTask,"删除任务","/task/create_task.fxml"),
    RemoveExportTask(44,OperationTypeEnum.DataExport,TaskTypeEnum.RemoveTask,"删除任务","/task/create_task.fxml"),
    RemoveAnalysis(45,OperationTypeEnum.DataAnalysis,TaskTypeEnum.RemoveTask,"删除任务","/task/create_task.fxml");

    StageTypeEnum(Integer value, OperationTypeEnum operationTypeEnum,TaskTypeEnum taskTypeEnum,String displayName,String resourceLocation){
        this.value=value;
        this.operationTypeEnum=operationTypeEnum;
        this.taskTypeEnum=taskTypeEnum;
        this.displayName=displayName;
        this.resourceLocation=resourceLocation;
    }
    private Integer value;
    private OperationTypeEnum operationTypeEnum;
    private TaskTypeEnum taskTypeEnum;
    private String displayName;
    private String resourceLocation;
    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }

    public OperationTypeEnum getOperationTypeEnum() {
        return operationTypeEnum;
    }

    public TaskTypeEnum getTaskTypeEnum() {
        return taskTypeEnum;
    }

    public String getResourceLocation() {
        return resourceLocation;
    }

    public static StageTypeEnum getStageTypeEnumByOperationAndTaskType(OperationTypeEnum operationTypeEnum,TaskTypeEnum taskTypeEnum){
        List<StageTypeEnum> list= EnumUtils.getAllItems(StageTypeEnum.class);
        for(StageTypeEnum typeEnum : StageTypeEnum.values()) {
            if(typeEnum.getOperationTypeEnum().equals(operationTypeEnum) && typeEnum.getTaskTypeEnum().equals(taskTypeEnum)){
                return typeEnum;
            }
        }
        return null;
    }

}
