/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import java.time.OffsetDateTime;
import org.openapitools.client.model.User;

import org.openapitools.client.Configuration;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;
import io.vertx.core.Vertx;
import io.vertx.ext.unit.junit.VertxUnitRunner;
import io.vertx.ext.unit.junit.RunTestOnContext;
import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.Async;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
@Disabled
public class UserApiTest {

    private UserApi api;

    @BeforeAll
    public void setupApiClient() {
        api = new UserApiImpl();
    }

    /**
     * Create user
     * This can only be done by the logged in user.
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void createUserTest(TestContext testContext) {
        Async async = testContext.async();
        User body = null;
        api.createUser(body, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    /**
     * Creates list of users with given input array
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void createUsersWithArrayInputTest(TestContext testContext) {
        Async async = testContext.async();
        List<User> body = null;
        api.createUsersWithArrayInput(body, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    /**
     * Creates list of users with given input array
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void createUsersWithListInputTest(TestContext testContext) {
        Async async = testContext.async();
        List<User> body = null;
        api.createUsersWithListInput(body, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    /**
     * Delete user
     * This can only be done by the logged in user.
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void deleteUserTest(TestContext testContext) {
        Async async = testContext.async();
        String username = null;
        api.deleteUser(username, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    /**
     * Get user by user name
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void getUserByNameTest(TestContext testContext) {
        Async async = testContext.async();
        String username = null;
        api.getUserByName(username, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    /**
     * Logs user into the system
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void loginUserTest(TestContext testContext) {
        Async async = testContext.async();
        String username = null;
        String password = null;
        api.loginUser(username, password, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    /**
     * Logs out current logged in user session
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void logoutUserTest(TestContext testContext) {
        Async async = testContext.async();
        api.logoutUser(result -> {
            // TODO: test validations
            async.complete();
        });
    }
    /**
     * Updated user
     * This can only be done by the logged in user.
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void updateUserTest(TestContext testContext) {
        Async async = testContext.async();
        String username = null;
        User body = null;
        api.updateUser(username, body, result -> {
            // TODO: test validations
            async.complete();
        });
    }
}
