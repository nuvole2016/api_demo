package com.example.api_demo.controller;

import com.example.api_demo.entity.Trade;
import com.example.api_demo.service.TradeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ResponseBody
@RestController
@Api
@Component
public class TradeController {

    @Autowired
    TradeService tradeService;

    @ApiOperation(value = "get all trade")
    @RequestMapping(value = "/trade", method = RequestMethod.GET)
    public List<Trade> getAllTrade() {

        return tradeService.getAllTrade();

    }

    @ApiOperation(value = "get trade by tradeId")
    @RequestMapping(value = "/trade/{tradeId}", method = RequestMethod.GET)
    public Trade getTradeById(@PathVariable String tradeId) {

        return tradeService.findTradeById(tradeId);

    }

}
