import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Before
    fun clearBeforeTest() {
        WallService.clear()
    }

    @Test
    fun addPost_ID_1() {
        val result = WallService.add(Post(1, 1, 1, date = 1))
        assertEquals(1, result.id)
    }

    @Test
    fun addPost_ID_3() {
        val result = WallService.add(Post(3, 1, 1, date = 1))
        assertEquals(1, result.id)
    }

    @Test
    fun updatePostTrue() {
        WallService.add(Post(1, 1, 1, date = 1))
        val result = WallService.update(Post(1, 1, 1, date = 1))
        assertEquals(true, result)
    }

    @Test
    fun updatePostFalse() {
        WallService.add(Post(2, 1, 1, date = 1))
        val result = WallService.update(Post(3, 1, 1, date = 1))
        assertEquals(false, result)
    }

    @Test
    fun createComment() {
        WallService.add(Post(1, 1, 1, date = 1))
        val result = WallService.createComment(1, Comment())
        assertEquals(1, result.id)
    }
}