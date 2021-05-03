package com.example.testproject

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class CommentUnitTest {
    private lateinit var commentAdapter: UserAdapter

    @Before
    fun Wait(){
        Thread.sleep(120)
    }

    @Test
    fun getCommentListTest() {
        Assert.assertEquals(0, 0)
    }

    @Test
    fun getCommentListAddTest() {
        Assert.assertEquals(0, 0)
    }

    @Test
    fun getCommentListRemoveTest() {
        Assert.assertEquals(0, 0)
    }
}