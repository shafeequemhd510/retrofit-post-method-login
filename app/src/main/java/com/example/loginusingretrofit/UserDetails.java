
package com.example.loginusingretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserDetails {

    @SerializedName("server")
    @Expose
    private String server;
    @SerializedName("DB")
    @Expose
    private String dB;
    @SerializedName("LoginNo")
    @Expose
    private Long loginNo;
    @SerializedName("LoginID")
    @Expose
    private String loginID;
    @SerializedName("Username")
    @Expose
    private String username;
    @SerializedName("IsEditor")
    @Expose
    private String isEditor;
    @SerializedName("DefualtLanguage")
    @Expose
    private String defualtLanguage;
    @SerializedName("LanguagesList")
    @Expose
    private String languagesList;
    @SerializedName("Organisation")
    @Expose
    private String organisation;
    @SerializedName("CompanyEmail")
    @Expose
    private String companyEmail;
    @SerializedName("IsDashboard")
    @Expose
    private String isDashboard;
    @SerializedName("logoImage")
    @Expose
    private String logoImage;
    @SerializedName("OrgId")
    @Expose
    private Long orgId;
    @SerializedName("LoggedOrgID")
    @Expose
    private Long loggedOrgID;
    @SerializedName("UserId")
    @Expose
    private Long userId;
    @SerializedName("api_key")
    @Expose
    private String apiKey;
    @SerializedName("Mobile")
    @Expose
    private String mobile;
    @SerializedName("ErrorNo")
    @Expose
    private Long errorNo;
    @SerializedName("ValidationKey")
    @Expose
    private String validationKey;

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getDB() {
        return dB;
    }

    public void setDB(String dB) {
        this.dB = dB;
    }

    public Long getLoginNo() {
        return loginNo;
    }

    public void setLoginNo(Long loginNo) {
        this.loginNo = loginNo;
    }

    public String getLoginID() {
        return loginID;
    }

    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIsEditor() {
        return isEditor;
    }

    public void setIsEditor(String isEditor) {
        this.isEditor = isEditor;
    }

    public String getDefualtLanguage() {
        return defualtLanguage;
    }

    public void setDefualtLanguage(String defualtLanguage) {
        this.defualtLanguage = defualtLanguage;
    }

    public String getLanguagesList() {
        return languagesList;
    }

    public void setLanguagesList(String languagesList) {
        this.languagesList = languagesList;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getIsDashboard() {
        return isDashboard;
    }

    public void setIsDashboard(String isDashboard) {
        this.isDashboard = isDashboard;
    }

    public String getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(String logoImage) {
        this.logoImage = logoImage;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Long getLoggedOrgID() {
        return loggedOrgID;
    }

    public void setLoggedOrgID(Long loggedOrgID) {
        this.loggedOrgID = loggedOrgID;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Long getErrorNo() {
        return errorNo;
    }

    public void setErrorNo(Long errorNo) {
        this.errorNo = errorNo;
    }

    public String getValidationKey() {
        return validationKey;
    }

    public void setValidationKey(String validationKey) {
        this.validationKey = validationKey;
    }

}
