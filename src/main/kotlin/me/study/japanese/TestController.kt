package me.study.japanese

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(
    @Autowired
    val hiragana:Hiragana
){


    @GetMapping("/")
    fun testrest() :String
        {
            hiragana.getword().keys.forEach(System.out::println)
            return "hello kotlin server"
        }
}