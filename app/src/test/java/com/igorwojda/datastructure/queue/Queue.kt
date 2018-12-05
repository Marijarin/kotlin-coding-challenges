package com.igorwojda.datastructure.queue

import org.amshove.kluent.shouldEqual
import org.junit.Test

private class Queue {
    private val list = mutableListOf<Int>()

    fun add(i: Int) {
    }

    fun remove(): Int {
        return 0
    }
}

class QueueTest {
    @Test
    fun `can add elements to a queue`() {
        val q = Queue()
        q.add(1)
    }

    @Test
    fun `can remove elements from empty queue`() {
        val q = Queue()
        q.remove() shouldEqual null
    }

    @Test
    fun `can remove elements from a queue`() {
        val q = Queue()
        q.add(1)
        q.remove()
    }

    @Test
    fun `order of elements is maintained`() {
        val q = Queue()
        q.add(1)
        q.add(2)
        q.add(3)
        q.remove() shouldEqual 1
        q.remove() shouldEqual 2
        q.remove() shouldEqual 3
        q.remove() shouldEqual null
    }
}
