package zoopit.emergency.zoopitserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ZoopitServerApplication

fun main(args: Array<String>) {
	runApplication<ZoopitServerApplication>(*args)
}
