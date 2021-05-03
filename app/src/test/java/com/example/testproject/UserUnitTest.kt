package com.example.testproject

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class UserUnitTest {
    private lateinit var userAdapter: UserAdapter

    @Before
    fun Wait(){
        Thread.sleep(95)
    }

    @Test
    fun getUserListTest() {
        Assert.assertEquals(0, 0)
    }

    @Test
    fun getUserListAddTest() {
        Assert.assertEquals(0, 0)
    }

    @Test
    fun getUserListRemoveTest() {
        Assert.assertEquals(0, 0)
    }
}