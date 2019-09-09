package com.example.swaggerdemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Api("客服接口")
@RestController
@RequestMapping("/checkcenter")
public class CheckCenterController {


    @ApiOperation(value = "获取客服", notes = "根据cid获取客服")
    @ApiImplicitParam(name = "cid", value = "客户id", required = true, dataType = "String")
    @GetMapping("/getCenter")
    public ResponseEntity getCenter(String cid) {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("cid", cid);
        map.put("name", "客服");
        return ResponseEntity.ok(map);
    }

    @ApiOperation(value = "获取客服", notes = "根据cid获取客服")
    @ApiImplicitParam(name = "cid", value = "客户id", required = true, dataType = "String")
    @PostMapping("/getCenter/{cid}")
    public ResponseEntity getCenter2(@PathVariable String cid) {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("cid", cid);
        map.put("name", "客服");
        return ResponseEntity.ok(map);
    }




}
