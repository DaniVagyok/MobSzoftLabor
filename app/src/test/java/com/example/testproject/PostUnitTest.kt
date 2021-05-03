package com.example.testproject

import android.content.Context
import io.swagger.client.model.PostData
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class PostUnitTest {

    private lateinit var postsAdapter: PostAdapter

    @Before
    fun Wait(){
        Thread.sleep(60)
    }

    @Test
    fun getPostListTest() {
        assertEquals(0,0)
    }

    @Test
    fun getPostListAddTest() {
        assertEquals(0,0)
    }

    @Test
    fun getPostListRemoveTest() {
        assertEquals(0,0)
    }
}