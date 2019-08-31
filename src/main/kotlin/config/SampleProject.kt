package config

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Author : Avinash Dathathri
 * Created on : 2019-08-31
 * Description : This is the main class
 **/

@SpringBootApplication
class SampleProject {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(SampleProject::class.java, *args)
        }
    }
}