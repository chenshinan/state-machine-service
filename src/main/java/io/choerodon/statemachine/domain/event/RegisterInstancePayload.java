package io.choerodon.statemachine.domain.event;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class RegisterInstancePayload {

    private String status;

    private String appName;

    private String version;

    private String instanceAddress;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    private Date createTime;

    private String apiData;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getInstanceAddress() {
        return instanceAddress;
    }

    public void setInstanceAddress(String instanceAddress) {
        this.instanceAddress = instanceAddress;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getApiData() {
        return apiData;
    }

    public void setApiData(String apiData) {
        this.apiData = apiData;
    }

    @Override
    public String toString() {
        return "RegisterInstancePayload{"
                + "status='" + status + '\''
                + ", appName='" + appName + '\''
                + ", version='" + version + '\''
                + ", instanceAddress='" + instanceAddress + '\''
                + ", createTime=" + createTime
                + '}';
    }

}
