/*
 * CET-Lite for CoinEx Chain
 * A REST interface for state queries, transaction generation and broadcasting.
 *
 * OpenAPI spec version: 3.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.coinex.dex.client.api;

import org.coinex.dex.client.ApiException;
import org.coinex.dex.client.model.InlineResponse20064;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SlashApi
 */
@Ignore
public class SlashApiTest {

    private final SlashApi api = new SlashApi();

    
    /**
     * Query validator slash info
     *
     * Query validator slash power, reason, and jailed status etc
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void querySlashTest() throws ApiException {
        Long time = null;
        Long sid = null;
        Integer count = null;
        InlineResponse20064 response = api.querySlash(time, sid, count);

        // TODO: test validations
    }
    
}
