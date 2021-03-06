/**
  * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
  *
  * Copyright (c) 2019 IO-Teknologi Indonesia, and individual contributors
  * as indicated by the @author tags. All Rights Reserved
  *
  * The contents of this file are subject to the terms of the
  * Common Development and Distribution License (the License).
  *
  * Everyone is permitted to copy and distribute verbatim copies
  * of this license document, but changing it is not allowed.
  *
  */
package id.io.asset.util.constant; 

public class ConstantHelper {

    // REST Endpoints
    public static final String HTTP_STATUS_CODE         = "statusCode";
    public static final String HTTP_RESPONSE            = "response";
    public static final String HTTP_REASON              = "reason";
    public static final String HTTP_CODE                = "code";
    public static final String HTTP_MESSAGE             = "message";
    public static final String HTTP_SUCCESSFUL          = "successful";

    // Database Tables
    public static final String CONFIG_DB_TABLE          = "configuration";
    public static final String CONFIG_DB_COL_ID         = "configuration.id";
    public static final String CONFIG_DB_COL_KEY        = " configuration.key";
    public static final String CONFIG_DB_COL_VALUE      = "configuration.value";

    //EMAIL CONFIGURATION
    public static final String EMAIL_HOSTNAME                   = "EMAIL_HOSTNAME";
    public static final String EMAIL_PORT                       = "EMAIL_PORT";
    public static final String EMAIL_USERNAME                   = "EMAIL_USERNAME";
    public static final String EMAIL_PASSWORD                   = "EMAIL_PASSWORD";
    public static final String EMAIL_ENABLE                     = "EMAIL_ENABLE";
    public static final String EMAIL_SERVER_NAME                = "EMAIL_SERVER_NAME";
    public static final String EMAIL_AUTHENTICATION_REQUIRED    = "EMAIL_AUTHENTICATION_REQUIRED";
    public static final String EMAIL_SMTP_REQUIRED              = "EMAIL_SMTP_REQUIRED";

    //OTP CONFIGURATION
    public static final String OTP_EXPIRY               = "OTP_EXPIRY";
    public static final String OTP_LENGTH               = "OTP_LENGTH";
    public static final String OTP_EMAIL_SUBJECT        = "OTP_EMAIL_SUBJECT";
    public static final String OTP_EMAIL_CONTENT        = "OTP_EMAIL_CONTENT";

    //RESET PASSWORD CONFIGURATION
    public static final String PASSWORD_RESET_EMAIL_CONTENT         = "PASSWORD_RESET_EMAIL_CONTENT";
    public static final String PASSWORD_RESET_EMAIL_SUBJECT         = "PASSWORD_RESET_EMAIL_SUBJECT";
    public static final String PASSWORD_RESET_TOKEN_EXPIRY          = "PASSWORD_RESET_TOKEN_EXPIRY";
    public static final String PASSWORD_RESET_TOKEN_LENGTH          = "PASSWORD_RESET_TOKEN_LENGTH";
    
    
     //USER RESPONSE CONFIGURATION
    
    public static final String USER_USERID          = "userid";
    public static final String USER_USERNAME        = "username";
    public static final String USER_PASSWORD        = "password";
    public static final String USER_ALIAS           = "alias";
    public static final String USER_MEMBERID        = "memberid";
    public static final String USER_ISACTIVE        = "isactive";
    public static final String USER_MEMBERCODE      = "membercode";
    public static final String USER_MEMBERNAME      = "membername";
    public static final String USER_EMAIL           = "email";
    public static final String USER_IMAGEADDRESSES  = "imageaddress";
    public static final String USER_LEVELID         = "levelid";
    public static final String USER_DEPARTMENTID    = "departmentid";
    public static final String USER_DESCRIPTION     = "description";
    public static final String USER_ISADMIN         = "isadmin";

    //ASSET RESPONSE CONFIGURATION
    public static final String ASSET_ID             = "assetid";
    public static final String ASSET_ASSETCODE       = "assetcode";
    public static final String ASSET_ASSETNAME       = "assetname";
    public static final String ASSET_TYPEID          = "typeid";
    public static final String ASSET_MANUFACTURE     = "manufacture";
    public static final String ASSET_MODEL           = "model";
    public static final String ASSET_VENDORID        = "vendorid";
    public static final String ASSET_NOTE            = "note";
    public static final String ASSET_CREATEDT        = "createdt";
    
    //DEPARTMENT RESPONSE CONFIGURATION
    public static final String DEPARTMENT_DEPARTMENTID      = "departmentid";
    public static final String DEPARTMENT_DEPARTMENTCODE    = "departmentcode";
    public static final String DEPARTMENT_DEPARTMENTNAME    = "assetname";
    public static final String DEPARTMENT_DESCRIPTION       = "description";
    public static final String DEPARTMENT_ISACTIVE          = "isactive";
    
    //CONFIGURATION RESPONSE CONFIGURATION
    public static final String CONFIGURATION_ID      = "id";
    public static final String CONFIGURATION_KEY     = "key";
    public static final String CONFIGURATION_VALUE   = "value";
    
    //DEPARTMENT MEMBER RESPONSE CONFIGURATION
    public static final String DEPARTMENTMEMBER_MEMBERID          = "memberid";
    public static final String DEPARTMENTMEMBER_MEMBERCODE        = "membercode";
    public static final String DEPARTMENTMEMBER_MEMBERNAME        = "membername";
    public static final String DEPARTMENTMEMBER_EMAIL             = "email";
    public static final String DEPARTMENTMEMBER_IMAGEADDRESS      = "imageaddress";
    public static final String DEPARTMENTMEMBER_DESCRIPTION       = "description";
    public static final String DEPARTMENTMEMBER_LEVELID           = "levelid";
    public static final String DEPARTMENTMEMBER_DEPARTMENTID      = "departmentid";
    public static final String DEPARTMENTMEMBER_ISADMIN           = "isadmin";
    public static final String DEPARTMENTMEMBER_ISACTIVE          = "isactive";
    
    //MEMBER LEVEL RESPONSE CONFIGURATION
    public static final String MEMBERLEVEL_LEVELID                  = "levelid";
    public static final String MEMBERLEVEL_LEVELCODE                = "levelcode";
    public static final String MEMBERLEVEL_LEVELNAME                = "levelname";
    public static final String MEMBERLEVEL_DESCRIPTION              = "description";
    public static final String MEMBERLEVEL_ISACTIVE                 = "isactive";
    
    //OTP LOG RESPONSE CONFIGURATION
    public static final String OTPLOG_ID                            = "id";
    public static final String OTPLOG_USERID                        = "userid";
    public static final String OTPLOG_OTP                           = "otp";
    public static final String OTPLOG_CREATEDT                      = "createdt";
    
    //ASSET REGISTER RESPONSE CONFIGURATION
    public static final String ASSETREGISTER_ASSETID         = "assetid";
    public static final String ASSETREGISTER_LOCATIONNAME    = "locationname";
    public static final String ASSETREGISTER_ASSETCODE       = "assetcode";
    public static final String ASSETREGISTER_BUILDINGNAME    = "buildingname";
    public static final String ASSETREGISTER_MEMBERCODE      = "membercode";
    public static final String ASSETREGISTER_RATEID          = "rateid";
    public static final String ASSETREGISTER_GEOLOCATION     = "geolocation";
    public static final String ASSETREGISTER_PHOTO           = "photo";
    public static final String ASSETREGISTER_NOTE            = "note";
    public static final String ASSETREGISTER_CREATEDT        = "createdt";
    
    //PROVINCE RESPONSE CONFIGURATION
    public static final String PROVINCE_PROVINCEID          = "provinceid";
    public static final String PROVINCE_PROVINCECODE        = "provincecode";
    public static final String PROVINCE_PROVINCENAME        = "provincename";
    public static final String PROVINCE__ISACTIVE           = "isactive";
    
    //CITY RESPONSE CONFIGURATION
    public static final String CITY_CITYID                      = "cityid";
    public static final String CITY_CITYNAME                    = "cityname";
    public static final String CITY_PROVINCEID                  = "provinceid";
    public static final String CITY_ISACTIVE                    = "isactive";
    
    //BUILDING RESPONSE CONFIGURATION
    public static final String BUILDING_BUILDINGID          = "buildingid";
    public static final String BUILDING_BUILDINGNAME        = "buildingname";
    public static final String BUILDING_DESCRIPTION         = "description";
    public static final String BUILDING_CITYID              = "cityid";
    public static final String BUILDING_ISACTIVE            = "isactive";
    
    //VENDOR RESPONSE CONFIGURATION
    public static final String VENDOR_VENDORID          = "vendorid";
    public static final String VENDOR_VENDORCODE        = "vendorcode";
    public static final String VENDOR_VENDORNAME        = "vendorname";
    public static final String VENDOR_CONTACT           = "contact";
    public static final String VENDOR_EMAIL             = "email";
    public static final String VENDOR_ADDRESS          = "address";
    public static final String VENDOR_NOTE             = "note";
    public static final String VENDOR_RATE             = "rate";
    public static final String VENDOR_REGISTERED       = "registered";
    
}
