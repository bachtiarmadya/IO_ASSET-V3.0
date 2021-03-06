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
package id.io.asset.controller;

import id.io.asset.model.AssetRegisterModel;
import id.io.asset.util.constant.ConstantHelper;
import id.io.asset.util.database.AssetRegisterDatabaseHelper;
import id.io.asset.util.database.UUIDGeneratorHelper;
import java.util.List;
import java.util.UUID;
import org.apache.http.HttpStatus;
import org.json.JSONObject;

public class AssetRegisterController extends BaseController{
    private AssetRegisterDatabaseHelper assetRegisterDatabaseHelper;
    private UUIDGeneratorHelper uuidGenerator;
    
    public AssetRegisterController(){
        assetRegisterDatabaseHelper = new AssetRegisterDatabaseHelper();
        this.uuidGenerator = new UUIDGeneratorHelper();
    }
    //create
    public JSONObject create(JSONObject json){
        JSONObject response = new JSONObject();
        if(json.length() != 0){
            UUID uuid = uuidGenerator.generateUUID(json.getString(ConstantHelper.ASSETREGISTER_ASSETCODE));
            boolean codeValidate = assetRegisterDatabaseHelper.assetRegisterCodeValidity(json.getString(ConstantHelper.ASSETREGISTER_ASSETCODE));
            if(codeValidate){
                AssetRegisterModel model = new AssetRegisterModel();
                model.setAssetid(uuid.toString());
                model.setLocationname(json.getString(ConstantHelper.ASSETREGISTER_LOCATIONNAME));
                model.setAssetcode(json.getString(ConstantHelper.ASSETREGISTER_ASSETCODE));
                model.setBuildingname(json.getString(ConstantHelper.ASSETREGISTER_BUILDINGNAME));
                model.setMembercode(json.getString(ConstantHelper.ASSETREGISTER_MEMBERCODE));
                model.setRateid(json.getString(ConstantHelper.ASSETREGISTER_RATEID));
                model.setGeolocation(json.getString(ConstantHelper.ASSETREGISTER_GEOLOCATION));
                model.setPhoto(json.getString(ConstantHelper.ASSETREGISTER_PHOTO));
                model.setNote(json.getString(ConstantHelper.ASSETREGISTER_NOTE));
                
                assetRegisterDatabaseHelper.create(model);
                
                response .put(ConstantHelper.HTTP_CODE, HttpStatus.SC_OK);
                response.put(ConstantHelper.HTTP_REASON, "create_asset_register_successful");
                response.put(ConstantHelper.HTTP_MESSAGE, "Create Asset Register Successful!");
            }else{
                response.put(ConstantHelper.HTTP_CODE, HttpStatus.SC_BAD_REQUEST);
                response.put(ConstantHelper.HTTP_REASON, "duplicate_assetid");
                response.put(ConstantHelper.HTTP_MESSAGE, "Error Duplicate AssetId " + codeValidate);
            }
        }else{
            response.put(ConstantHelper.HTTP_CODE, HttpStatus.SC_BAD_REQUEST);
            response.put(ConstantHelper.HTTP_REASON, "error_create_asset_register");
            response.put(ConstantHelper.HTTP_MESSAGE, "Error Create Asset Register : No such Asset");
        }
        return response;
    }
    //update
    public JSONObject update(String assetId, JSONObject json) {
        JSONObject response = new JSONObject();
        if (json.length() != 0) {
            AssetRegisterModel model = new AssetRegisterModel();
            model.setLocationname(json.getString(ConstantHelper.ASSETREGISTER_LOCATIONNAME));
            model.setAssetcode(json.getString(ConstantHelper.ASSETREGISTER_ASSETCODE));
            model.setBuildingname(json.getString(ConstantHelper.ASSETREGISTER_BUILDINGNAME));
            model.setMembercode(json.getString(ConstantHelper.ASSETREGISTER_MEMBERCODE));
            model.setRateid(json.getString(ConstantHelper.ASSETREGISTER_RATEID));
            model.setGeolocation(json.getString(ConstantHelper.ASSETREGISTER_GEOLOCATION));
            model.setPhoto(json.getString(ConstantHelper.ASSETREGISTER_PHOTO));
            model.setNote(json.getString(ConstantHelper.ASSETREGISTER_NOTE));
            assetRegisterDatabaseHelper.update(assetId, model);
            response.put(ConstantHelper.HTTP_CODE, HttpStatus.SC_OK);
            response.put(ConstantHelper.HTTP_REASON, "update_asset_register_successful");
            response.put(ConstantHelper.HTTP_MESSAGE, "Update Asset Register Successful!");
        } else {
            response.put(ConstantHelper.HTTP_CODE, HttpStatus.SC_BAD_REQUEST);
            response.put(ConstantHelper.HTTP_REASON, "error_update_asset_Register");
            response.put(ConstantHelper.HTTP_MESSAGE, "Error Update Asset Register : No such Asset");
        }
        return response;
    }
    //delete
    public JSONObject delete(String assetId) {
        JSONObject json = new JSONObject();
        int result = assetRegisterDatabaseHelper.delete(assetId);
        if (result == 1) {
            json.put(ConstantHelper.HTTP_CODE, HttpStatus.SC_OK);
            json.put(ConstantHelper.HTTP_REASON, "delete_asset_register_successful");
            json.put(ConstantHelper.HTTP_MESSAGE, "Delete Asset Register Successful!");
        } else {
            json.put(ConstantHelper.HTTP_CODE, HttpStatus.SC_BAD_REQUEST);
            json.put(ConstantHelper.HTTP_REASON, "error_delete_asset_register");
            json.put(ConstantHelper.HTTP_MESSAGE, "Error Delete Asset Register");
        }
        return json;
    }
    //list
    public List<AssetRegisterModel> assetList() {
        List<AssetRegisterModel> assetList = assetRegisterDatabaseHelper.getList();
        return assetList;
    }
    //findById
    public AssetRegisterModel getAsset(String assetId) {
        AssetRegisterModel asset = assetRegisterDatabaseHelper.findById(assetId);
        return asset;
    }
}
