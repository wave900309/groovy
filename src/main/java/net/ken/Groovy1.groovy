package net.ken
/**
 * Created by Yang, Haiqiang on 2019/05/21.
 */
class Groovy1 {
    public static void main(String[] args) {
        new GroovyFile('F:\\groovy.txt').eachLine('UTF-8') {
            println it
        }
    }
}
