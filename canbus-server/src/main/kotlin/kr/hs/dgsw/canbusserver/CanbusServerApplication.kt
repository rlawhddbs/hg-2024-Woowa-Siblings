package kr.hs.dgsw.canbusserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CanbusServerApplication

fun main(args: Array<String>) {
    runApplication<CanbusServerApplication>(*args)
}
